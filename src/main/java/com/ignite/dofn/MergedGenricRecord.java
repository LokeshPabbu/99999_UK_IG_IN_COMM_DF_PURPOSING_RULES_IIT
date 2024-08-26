package com.ignite.dofn;

import com.ignite.transformationbqs.TransformationBQ;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.transforms.DoFn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.Map;

public class MergedGenricRecord extends DoFn<Map<String, Iterable<GenericRecord>>, GenericRecord> implements Serializable {
    private static final Logger LOGGER = LoggerFactory.getLogger(MergedGenricRecord.class);
    Schema schema;
    public MergedGenricRecord(Schema destinationSchema) {
        this.schema = destinationSchema;
    }

    @ProcessElement
    public void processElement(ProcessContext context) {
        GenericRecord gr = new  GenericData.Record(schema);

        for (Map.Entry<String, Iterable<GenericRecord>> entry : context.element().entrySet()) {
            //List<GenericRecord> listGR = new ArrayList<>();
            for (GenericRecord record : entry.getValue()) {
                //listGR.add((GenericRecord) record.get(entry.getKey()));
                LOGGER.error("entry.getKey()  ::: " + entry.getKey() );
                LOGGER.error("record ::: " + record );
                if(record != null) {
                    gr.put(entry.getKey(), record.get(entry.getKey()));
                    gr.put("purposingHeader", TransformationBQ.getPurposingHeader(gr));
                }
                LOGGER.error("listGR ::: " + gr);
            }
        }
        context.output(gr);
    }
}
