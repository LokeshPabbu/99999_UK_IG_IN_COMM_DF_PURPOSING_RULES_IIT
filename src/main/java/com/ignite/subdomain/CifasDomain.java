package com.ignite.subdomain;

import com.equifax.fabric.commons.storage.util.StorageUtil;
import com.google.api.services.bigquery.model.TableRow;
import com.ignite.dofn.TableRowToGenericRecordConverterFn;
import com.ignite.options.CustomPipelineOptions;
import com.ignite.util.BigQueryUtil;
import com.ignite.util.PiiDecryptUtil;
import com.ignite.util.SecurityUtil;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.extensions.avro.coders.AvroCoder;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.PCollection;

import java.io.IOException;
import java.io.Serializable;

public class CifasDomain implements Serializable {

public static PCollection<GenericRecord> getCifaData(CustomPipelineOptions options, Pipeline pipeline) throws IOException {
    String sourceSchemaStr = StorageUtil.readFileAsString(options.getCifasSchema());
    Schema sourceSchema = new Schema.Parser().parse(sourceSchemaStr);

    PCollection<TableRow> cifasBqTableRowPCollection = BigQueryUtil.getTableRow(pipeline, options.getProject(),
            options.getDataSet(), options.getCifasTableName(),
            options.getCurrentDate());

    PCollection<GenericRecord> cifasGenericRecord  = cifasBqTableRowPCollection
            .apply("CONVERT TABLEROW TO GENERIC RECORD",
                    ParDo.of(new TableRowToGenericRecordConverterFn(sourceSchema)))
            .setCoder(org.apache.beam.sdk.extensions.avro.coders.AvroCoder.of(sourceSchema));

    PCollection<GenericRecord> cifasPiiDecryptedPCollection = cifasGenericRecord
            .apply("DECRYPT PII FIELDS", ParDo.of(new PiiDecryptUtil(options.getBqCifasPiiDekPath(),
                    options.getBqCifasPiiGroupId())))
            .setCoder(AvroCoder.of(sourceSchema));

    PCollection<GenericRecord> genericRecordPCollectionEncrypt = SecurityUtil
            .performPiiEncryption(options, cifasPiiDecryptedPCollection, pipeline, sourceSchema);

    return genericRecordPCollectionEncrypt;
}

}


