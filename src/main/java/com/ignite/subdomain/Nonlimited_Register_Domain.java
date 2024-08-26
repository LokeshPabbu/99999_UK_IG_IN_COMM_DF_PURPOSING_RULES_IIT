package com.ignite.subdomain;

import com.equifax.fabric.commons.storage.util.StorageUtil;
import com.google.api.services.bigquery.model.TableRow;
import com.ignite.dofn.TableRowToGenericRecordConverterFn;
import com.ignite.options.CustomPipelineOptions;
import com.ignite.util.BigQueryUtil;
import com.ignite.util.PiiDecryptUtil;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.extensions.avro.coders.AvroCoder;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.PCollection;

import java.io.IOException;
import java.io.Serializable;

public class Nonlimited_Register_Domain  implements Serializable {

    public static PCollection<GenericRecord> getNonlimitedRegData(CustomPipelineOptions options, Pipeline pipeline) throws IOException {
        String sourceSchemaStrICM = StorageUtil.readFileAsString(options.getNonlimit_Schema());
        Schema sourceSchemaICM = new Schema.Parser().parse(sourceSchemaStrICM);

        PCollection<TableRow> bqTableRowPCollectionICUI = BigQueryUtil.getTableRow(pipeline, options.getProject(),
                options.getDataSet(), options.getNonlimit_TableName(),
                options.getCurrentDate());

        PCollection<GenericRecord> destinationBqRecordPCollection  = bqTableRowPCollectionICUI
                .apply("CONVERT TABLEROW TO GENERIC RECORD",
                        ParDo.of(new TableRowToGenericRecordConverterFn(sourceSchemaICM)))
                .setCoder(AvroCoder.of(sourceSchemaICM));

        PCollection<GenericRecord> nonlimitedregPIIDecryption = destinationBqRecordPCollection
                .apply("DECRYPT PII FIELDS", ParDo.of(new PiiDecryptUtil(options.getBqNonlimitPiiDekPath(),
                        options.getBqNonlimitPiiGroupId())))
                .setCoder(AvroCoder.of(sourceSchemaICM));



        return nonlimitedregPIIDecryption;
    }
}
