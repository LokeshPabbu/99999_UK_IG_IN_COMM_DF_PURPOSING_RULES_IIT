package com.ignite.dofn;

import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.values.KV;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GenericRecordToKVofCompanyRegNumber extends DoFn<GenericRecord, KV<String, GenericRecord>> implements Serializable {
    private static final Logger LOGGER = LoggerFactory.getLogger(GenericRecordToKVofCompanyRegNumber.class);
    @ProcessElement
    public void processElement(ProcessContext context) {
        GenericRecord genericRecord = context.element();
        LOGGER.error("genericRecord :::: " + genericRecord);
//        List<KV<String, GenericRecord>> outputList = new ArrayList<>();

        String key = (String) genericRecord.get("companyregisterednumber");
        /*if (key != null) {
            outputList.add(KV.of(key, genericRecord));
        }
        LOGGER.error("genericRecord of List :::: " + outputList);*/
        /*if (!outputList.isEmpty()) {
            context.output(outputList);
        }*/

        context.output(KV.of(key, genericRecord));

    }
}
