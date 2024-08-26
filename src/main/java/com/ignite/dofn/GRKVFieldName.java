package com.ignite.dofn;

import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.values.KV;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class GRKVFieldName extends DoFn<KV<String,Iterable<GenericRecord>>,KV<String, Map<String, Iterable<GenericRecord>>>> implements Serializable {
    private static final Logger LOGGER = LoggerFactory.getLogger(GRKVFieldName.class);
    @ProcessElement
    public void processElement(ProcessContext c) {
        KV<String,Iterable<GenericRecord>> iterableKV =   c.element();

        Iterable<GenericRecord> iterableGR = iterableKV.getValue();
        LOGGER.error("iterableGR ::: " + iterableGR);
        Map<String, Iterable<GenericRecord>> mapKV = new HashMap<>();

        for(GenericRecord gr : iterableGR) {
           /* String facilityNumber = String.valueOf(gr.get("facilitynumber"));
            String dataSupplierCode = String.valueOf(gr.get("datasuppliercode"));
            StringBuffer concatFNumberDSCode = new StringBuffer();
            concatFNumberDSCode.append(facilityNumber).append(dataSupplierCode);
            String key = concatFNumberDSCode.toString();*/
            String key = String.valueOf(gr.get("facilitynumber"));
            mapKV.put(key,iterableGR);
        }
        LOGGER.error("mapKV ::: " + mapKV);
        c.output(KV.of(iterableKV.getKey(),mapKV));

    }

}
