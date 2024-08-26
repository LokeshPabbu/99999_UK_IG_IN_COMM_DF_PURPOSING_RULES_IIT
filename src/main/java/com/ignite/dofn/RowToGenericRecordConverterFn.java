package com.ignite.dofn;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.values.Row;

import java.io.Serializable;


public class RowToGenericRecordConverterFn extends DoFn<Row, GenericRecord> implements Serializable {
    Schema schema;

    public RowToGenericRecordConverterFn(Schema schema) {
        this.schema = schema;
    }

    @ProcessElement
    public void processElement(@Element Row row, OutputReceiver<GenericRecord> outputReceiver) {
        GenericRecord genericRecord = new GenericData.Record(schema);
        for (org.apache.beam.sdk.schemas.Schema.Field field : row.getSchema().getFields()) {
            Object value = row.getValue(field.getName());
            genericRecord.put(field.getName(), value);
        }

        outputReceiver.output(genericRecord);
    }
}
