package com.ignite.subdomain;

import com.equifax.fabric.commons.storage.util.StorageUtil;
import com.google.api.services.bigquery.model.TableRow;
import com.ignite.dofn.*;
import com.ignite.options.CustomPipelineOptions;
import com.ignite.transformation.*;
import com.ignite.util.BigQueryUtil;
import com.ignite.util.JsonUtil;
import com.ignite.util.PiiDecryptUtil;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.coders.*;
import org.apache.beam.sdk.extensions.avro.coders.AvroCoder;
import org.apache.beam.sdk.extensions.avro.schemas.utils.AvroUtils;
import org.apache.beam.sdk.extensions.sql.SqlTransform;
import org.apache.beam.sdk.schemas.SchemaCoder;
import org.apache.beam.sdk.transforms.GroupByKey;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.*;

import java.io.IOException;
import java.io.Serializable;
import java.util.Map;


public class CCDSGropingDomain implements Serializable {

    public static void getCCDSData(CustomPipelineOptions options, Pipeline pipeline)  throws IOException {

        //ccds_submissions_uk_int
        String submissions = StorageUtil.readFileAsString(options.getCcds_SubmissionsSchema());
        Schema submissionsSchema = new Schema.Parser().parse(submissions);

        PCollection<TableRow> submissionsTable = BigQueryUtil.getTableRow(pipeline, options.getProject(),
                options.getDataSet(), options.getCcds_SubmissionsTableName(),
                options.getCurrentDate());

        PCollection<GenericRecord> submissionsRow = submissionsTable.apply(
                        "convert cons_product BQ tableRow to Row",
                        ParDo.of(new TableRowToGenericRecordConverterFn((submissionsSchema))))
                .setCoder(org.apache.beam.sdk.extensions.avro.coders.AvroCoder.of(submissionsSchema));

        PCollection<GenericRecord> submissionspiiDecrypted = submissionsRow
                .apply("DECRYPT PII FIELDS", ParDo.of(new PiiDecryptUtil(options.getBqCcdsPiiDekPath(),
                        options.getBqCcdsPiiGroupId())))
                .setCoder(AvroCoder.of(submissionsSchema));

        DataSetConfigDetails submissionsJson = JsonUtil.readDataSetConfig("bq_read/ccds_jsons/submissions.json");
        org.apache.beam.sdk.schemas.Schema submissionsJsonSchema = RowSchemaBuilder.getSchema(submissionsJson);

        PCollection<Row> submissionsJsonRow = submissionspiiDecrypted.
                apply("Generic Record to Row", ParDo.of(new GenericRecordToRowFn(submissionsJsonSchema)))
                .setCoder(RowCoder.of(submissionsJsonSchema));

//ccds_datasubmissions_uk_int
        String datasubmissions = StorageUtil.readFileAsString(options.getCcds_DatasubmissionsSchema());
        Schema datasubmissionsSchema = new Schema.Parser().parse(datasubmissions);

        PCollection<TableRow> datasubmissionsTable = BigQueryUtil.getTableRow(pipeline, options.getProject(),
                options.getDataSet(), options.getCcds_DatasubmissionsTableName(),
                options.getCurrentDate());


        PCollection<Row> datasubmissionsRow = datasubmissionsTable.apply(
                        "convert cons_product BQ tableRow to Row",
                        ParDo.of(new ConverterTableRowToRowStringFieldsFn(AvroUtils.toBeamSchema(datasubmissionsSchema))))
                .setCoder(SchemaCoder.of(AvroUtils.toBeamSchema(datasubmissionsSchema)));


//ccds_masterfacility_uk_int
        String masterfacility = StorageUtil.readFileAsString(options.getCcds_MasterfacilitySchema());
        Schema masterfacilitySchema = new Schema.Parser().parse(masterfacility);

        PCollection<TableRow> masterfacilityTable = BigQueryUtil.getTableRow(pipeline, options.getProject(),
                options.getDataSet(), options.getCcds_MasterfacilityTableName(),
                options.getCurrentDate());

        PCollection<Row> masterfacilityRow = masterfacilityTable.apply(
                        "convert cons_product BQ tableRow to Row",
                        ParDo.of(new ConverterTableRowToRowStringFieldsFn(AvroUtils.toBeamSchema(masterfacilitySchema))))
                .setCoder(SchemaCoder.of(AvroUtils.toBeamSchema(masterfacilitySchema)));


//ccds_datasupplier_uk_int
        String datasupplier = StorageUtil.readFileAsString(options.getCcds_DatasupplierSchema());
        Schema datasupplierSchema = new Schema.Parser().parse(datasupplier);

        PCollection<TableRow> datasupplierTaable = BigQueryUtil.getTableRow(pipeline, options.getProject(),
                options.getDataSet(), options.getCcds_DatasupplierTableName(),
                options.getCurrentDate());

        PCollection<Row> datasupplierRow = datasupplierTaable.apply(
                        "convert cons_product BQ tableRow to Row",
                        ParDo.of(new ConverterTableRowToRowStringFieldsFn(AvroUtils.toBeamSchema(datasupplierSchema))))
                .setCoder(SchemaCoder.of(AvroUtils.toBeamSchema(datasupplierSchema)));


        //ccds_activeghosting_uk_int
        String activeghosting = StorageUtil.readFileAsString(options.getCcds_ActiveghostingSchema());
        Schema activeghostingSchema = new Schema.Parser().parse(activeghosting);

        PCollection<TableRow> activeghostingTable = BigQueryUtil.getTableRow(pipeline, options.getProject(),
                options.getDataSet(), options.getCcds_ActiveghostingTableName(),
                options.getCurrentDate());

        PCollection<Row> activeghostingRow = activeghostingTable.apply(
                        "convert cons_product BQ tableRow to Row",
                        ParDo.of(new ConverterTableRowToRowStringFieldsFn(AvroUtils.toBeamSchema(activeghostingSchema))))
                .setCoder(SchemaCoder.of(AvroUtils.toBeamSchema(activeghostingSchema)));



//ccds_auditghosting_uk_int
        String auditghosting = StorageUtil.readFileAsString(options.getCcds_AuditghostingSchema());
        Schema auditghostingSchema = new Schema.Parser().parse(auditghosting);

        PCollection<TableRow> auditghostingTable = BigQueryUtil.getTableRow(pipeline, options.getProject(),
                options.getDataSet(), options.getCcds_AuditghostingTableName(),
                options.getCurrentDate());

        PCollection<Row> auditghostingRow = auditghostingTable.apply(
                        "convert cons_product BQ tableRow to Row",
                        ParDo.of(new ConverterTableRowToRowStringFieldsFn(AvroUtils.toBeamSchema(auditghostingSchema))))
                .setCoder(SchemaCoder.of(AvroUtils.toBeamSchema(auditghostingSchema)));



        StringBuffer query = new StringBuffer();
        query.append("select ")
                .append("a.urn,a.datasubmissionid, ")
                .append("a.pib,a.facilitynumber, a.companytypeindicator, a.businessname, a.addressline1, a.addressline2, a.addressline3, a.addressline4, a.addressline5, ")
                .append("a.addressline6, a.postcode, a.additionaltradingstyle, a.businesstelephonenumber, a.companyregisterednumber, a.vatnumber, ")
                .append("a.specialinstructionindicator, a.facilitytype, a.startdateofagreement, a.closedateofagreement, a.currentbalance, ")
                .append("a.currentbalancecreditindicator, a.facilitystatus, a.originaldefaultbalance, a.defaultsatisfactiondate, a.creditoverdraftlimit, a.flagsetting, ")
                .append("a.transfrdtoconsldtddebtaccnt,a.repaymentperiod, a.paymentamount, a.paymentfrequency, a.numberofcashadvances, a.valueofcashadvances, ")
                .append("a.minimumbalance, a.minimumbalancecreditindicator, a.maximumbalance, a.maximumbalancecreditindicator, a.averagebalance, ")
                .append("a.averagebalancecreditindicator, a.creditturnover, a.creditturnovernetgross, a.debitturnover, a.debitturnovernetgross, a.rejectedpayments, ")
                .append("a.maximumdurationofexcess, a.filler, a.changedfacilitynumber, a.banksortcode, a.bankaccountnumber, a.bankaccountiban, ")
                .append("a.curraccreportinglevelindicator, a.postcodealpha, a.telephonealpha, a.startdatealpha, a.businessnamealpha, a.matchstatus,a.matchedcompanynumber,")
                .append("a.matchedname, a.matchednamealpha, a.matchednolicorp, a.usablestatusid, a.recordprocessingstatusid, a.matchedcompanynumberlatest, ")
                .append("a.businessname_hash, a.businessnamealpha_hash, a.matchedname_hash, a.matchednamealpha_hash, a.addressline1_hash, a.addressline2_hash, ")
                .append("a.addressline3_hash, a.addressline4_hash, a.addressline5_hash, a.addressline6_hash, a.postcode_hash, a.postcodealpha_hash, ")
                .append("b.datasupplierid, b.filetypeid, b.submissiondate, b.filesourcecode, b.filecreationdate, b.dateofcreation, ")
                .append("c.masterkey, c.masterfacilitynumber, c.slavefacilitynumber, c.datechanged, c.previousfacilitynumber, ")
                .append("d.datasuppliercode, d.datasuppliername, ")
                .append("e.masterghostingreferencenumber, ")
                .append("f.dateofghosting, f.dateofunghosting, f.ghostingreferencenumber,  f.unghostrequestid, f.ghostrequestid ")
                .append("from ")
                .append(options.getCcds_SubmissionsTableName() + " a ")
                .append("join ")
                .append(options.getCcds_DatasubmissionsTableName() + " b ")
                .append("on a.datasubmissionid = b.datasubmissionid ")
                .append("join ")
                .append(options.getCcds_MasterfacilityTableName() + " c ")
                .append("on a.facilitynumber = c.slavefacilitynumber and b.datasupplierid = c.datasupplierid ")
                .append("join ")
                .append(options.getCcds_DatasupplierTableName() + " d ")
                .append("on b.datasupplierid = d.datasupplierid ")
                .append("join ")
                .append(options.getCcds_ActiveghostingTableName() + " e ")
                .append("on a.facilitynumber = e.facilitynumber and b.datasupplierid = e.datasupplierid ")
                .append("join ")
                .append(options.getCcds_AuditghostingTableName() + " f ")
                .append("on e.masterghostingreferencenumber = f.masterghostingreferencenumber ");


        //Merged Schema
        String mergedsourceschemas = StorageUtil.readFileAsString(options.getCCDSMergedSchema());
        Schema mergedsourceschemasSchema = new Schema.Parser().parse(mergedsourceschemas);

        PCollection<Row> result = PCollectionTuple.of(
                        new TupleTag<>(options.getCcds_SubmissionsTableName()), submissionsJsonRow)
                .and(new TupleTag<>(options.getCcds_DatasubmissionsTableName()), datasubmissionsRow)
                .and(new TupleTag<>(options.getCcds_MasterfacilityTableName()), masterfacilityRow)
                .and(new TupleTag<>(options.getCcds_DatasupplierTableName()), datasupplierRow)
                .and(new TupleTag<>(options.getCcds_ActiveghostingTableName()), activeghostingRow)
                .and(new TupleTag<>(options.getCcds_AuditghostingTableName()), auditghostingRow)
                .apply(SqlTransform.query((query.toString())));

        PCollection<GenericRecord> genericRecordPCollection  = result
                .apply("CONVERT TABLEROW TO GENERIC RECORD",
                        ParDo.of(new RowToGenericRecordConverterFn(mergedsourceschemasSchema)))
                .setCoder(org.apache.beam.sdk.extensions.avro.coders.AvroCoder.of(mergedsourceschemasSchema));


        PCollection<KV<String, GenericRecord>> kvCompanyRegNumber = genericRecordPCollection
                .apply("Key values", ParDo.of(new GenericRecordToKVofCompanyRegNumber()))
                .setCoder(KvCoder.of(StringUtf8Coder.of(),AvroCoder.of(mergedsourceschemasSchema)));

        PCollection<KV<String,Iterable<GenericRecord>>> pCollection1 = kvCompanyRegNumber.apply("Group By", GroupByKey.create());

        PCollection<KV<String, Map<String, Iterable<GenericRecord>>>> KvofMapFacilityNumber =pCollection1.apply("Field Name For Key Value",
                ParDo.of(new GRKVFieldName())).setCoder(KvCoder.of(StringUtf8Coder.of(),
                MapCoder.of(StringUtf8Coder.of(),IterableCoder.of(AvroCoder.of(mergedsourceschemasSchema)))));

//            LOGGER.error("pCollection1 :::: " + pCollection1.toString());

           /* PCollection<Iterable<org.apache.beam.sdk.values.KV<String, GenericRecord>>> kvIterableDataSupplierCode = genericRecordPCollection
                    .apply("Key values", ParDo.of(new GenericRecordToDataSupplierCode()))
                    .setCoder(IterableCoder.of(KvCoder.of(StringUtf8Coder.of(),AvroCoder.of(mergedsourceschemasSchema))));*/

        /*PCollection<GenericRecord> genericRecordPCollectionEncrypt = SecurityUtil
                .performPiiEncryption(options, genericRecordPCollection, pipeline, mergedsourceschemasSchema);*/

        // return genericRecordPCollection;
    }
}
