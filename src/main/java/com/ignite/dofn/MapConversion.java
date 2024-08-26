package com.ignite.dofn;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.values.KV;

import java.io.Serializable;
import java.util.Map;

public class MapConversion extends DoFn< KV<String, Iterable<Map<String,GenericRecord>>>,GenericRecord> implements Serializable {

    private Schema schema;


    public MapConversion(Schema schema)
    {
       this.schema = schema;
    }

    @ProcessElement
    public void processElement(ProcessContext context) {

        Iterable<Map<String,GenericRecord>> maps =context.element().getValue();

        maps.forEach(stringGenericRecordMap -> {

            stringGenericRecordMap.keySet().forEach(k->{
                
                GenericRecord genericRecord = new GenericData.Record(schema);
                genericRecord.put(k,stringGenericRecordMap.get(k));
            });

        });


    }
}
