package com.ignite.subdomain;

import com.equifax.fabric.commons.storage.util.StorageUtil;
import com.google.api.services.bigquery.model.TableRow;
import com.ignite.dofn.ConverterTableRowToRowStringFieldsFn;
import com.ignite.dofn.GenericRecordToRowFn;
import com.ignite.dofn.RowToGenericRecordConverterFn;
import com.ignite.dofn.TableRowToGenericRecordConverterFn;
import com.ignite.options.CustomPipelineOptions;
import com.ignite.transformation.DataSetConfigDetails;
import com.ignite.transformation.RowSchemaBuilder;
import com.ignite.util.BigQueryUtil;
import com.ignite.util.SecurityUtil;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.Pipeline;
import com.ignite.util.JsonUtil;
import com.ignite.util.PiiDecryptUtil;
import org.apache.beam.sdk.extensions.avro.coders.AvroCoder;
import org.apache.beam.sdk.coders.RowCoder;
import org.apache.beam.sdk.extensions.avro.schemas.utils.AvroUtils;
import org.apache.beam.sdk.extensions.sql.SqlTransform;
import org.apache.beam.sdk.schemas.SchemaCoder;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.sdk.values.PCollectionTuple;
import org.apache.beam.sdk.values.Row;
import org.apache.beam.sdk.values.TupleTag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Serializable;

public class OfficerLegacyDomain implements Serializable {

    private static final Logger LOGGER = LoggerFactory.getLogger(InsightDomain.class);
    public static PCollection<GenericRecord> getOfficerLegacyData(CustomPipelineOptions options, Pipeline pipeline) throws IOException {

        String directorcodirStr = StorageUtil.readFileAsString(options.getDirectorcodir());
        Schema directorcodir = new Schema.Parser().parse(directorcodirStr);

        String directordirectorStr = StorageUtil.readFileAsString(options.getDirectordirector());
        Schema directordirector = new Schema.Parser().parse(directordirectorStr);

        String mergedSchemaStr = StorageUtil.readFileAsString(options.getOlmergedSchema());
        Schema mergedSchema = new Schema.Parser().parse(mergedSchemaStr);




        /*DataSetConfigDetails directorCodirConfig = JsonUtil.readDataSetConfig("bq_read/director_codir.json");
        org.apache.beam.sdk.schemas.Schema directorCodirSchema = RowSchemaBuilder.getSchema(directorCodirConfig);*/

        PCollection<TableRow> directorCodir = BigQueryUtil.getTableRow(pipeline, options.getProject(),
                options.getDataSet(), options.getOlCodirTableName(),
                options.getCurrentDate());



        PCollection<Row> directorCodirGeneric = directorCodir.apply(
                        "convert cons_product BQ tableRow to Row",
                        ParDo.of(new ConverterTableRowToRowStringFieldsFn(AvroUtils.toBeamSchema(directorcodir))))
                .setCoder(SchemaCoder.of(AvroUtils.toBeamSchema(directorcodir)));


        DataSetConfigDetails directorDirConfig = JsonUtil.readDataSetConfig("bq_read/director_director.json");
        org.apache.beam.sdk.schemas.Schema directorDirSchema = RowSchemaBuilder.getSchema(directorDirConfig);


        PCollection<TableRow> directorDir = BigQueryUtil.getTableRow(pipeline, options.getProject(),
                options.getDataSet(), options.getOlDirTableName(),
                options.getCurrentDate());

        PCollection<GenericRecord> directorDirGeneric = directorDir.apply(
                        "convert cons_product BQ tableRow to Row",
                        ParDo.of(new TableRowToGenericRecordConverterFn((directordirector))))
                .setCoder(AvroCoder.of(directordirector));

        PCollection<GenericRecord> piiDecryptedPCollection1 = directorDirGeneric
                .apply("DECRYPT PII FIELDS", ParDo.of(new PiiDecryptUtil(options.getOlBqPiiDekPath(),
                        options.getOlBqPiiGroupId())))
                .setCoder(AvroCoder.of(directordirector));

        PCollection<Row> directorDirRow = piiDecryptedPCollection1.
                apply("Generic Record to Row", ParDo.of(new GenericRecordToRowFn(directorDirSchema)))
                .setCoder(RowCoder.of(directorDirSchema));



        StringBuffer query = new StringBuffer();
        query.append("SELECT ")
                .append("a.company, a.persno, a.perssuf, a.appttype, a.apptdate, a.apptdoc, a.resigdate, a.resigdoc, a.occupation, a.taperef, a.tapedate, ")
                .append("b.titles, b.fname, b.sname, b.hons, b.nationality, b.addr1, b.addr2, b.town, b.county, b.countrycd, b.postcode, b.birthdate, b.dirstatus, b.ksname, b.kfname, b.kpcode, ")
                .append("b.phone, b.ptcabs, b.saind, b.ssname, b.sfname, b.careof, b.pobox, b.usualcountry, ")
                .append("b.hasura, b.partialdob, b.fname_hash, b.sname_hash, b.birthdate_hash, b.ksname_hash, b.kfname_hash, b.ssname_hash, b.sfname_hash, ")
                .append("b.partialdob_hash, b.addr1_hash, b.addr2_hash, b.postcode_hash ")
                .append("FROM ")
                .append(options.getOlCodirTableName() + " as a JOIN " + options.getOlDirTableName() + " as b on a.persno = b.persno ");


        PCollection<Row> result = PCollectionTuple.of(
                        new TupleTag<>(options.getOlCodirTableName()), directorCodirGeneric)
                .and(new TupleTag<>(options.getOlDirTableName()), directorDirRow)
                .apply(SqlTransform
                        .query((query.toString())));

        PCollection<GenericRecord> genericRecordPCollection  = result
                .apply("CONVERT TABLEROW TO GENERIC RECORD",
                        ParDo.of(new RowToGenericRecordConverterFn(mergedSchema)))
                .setCoder(AvroCoder.of(mergedSchema));

//        PCollection<GenericRecord> genericRecordPCollectionEncrypt = SecurityUtil
//                .performPiiEncryption(options, genericRecordPCollection, pipeline, mergedSchema);
        return genericRecordPCollection;
    }
}
