package com.ignite.dofn;

import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.values.KV;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class GenericRecordToDataSupplierCode extends DoFn<GenericRecord, Iterable<KV<String, GenericRecord>>> {
    private static final Logger LOGGER = LoggerFactory.getLogger(GenericRecordToKeyValue.class);
    @ProcessElement
    public void processElement(ProcessContext context) {
        GenericRecord genericRecord = context.element();
        LOGGER.error("genericRecord :::: " + genericRecord);
        List<KV<String, GenericRecord>> outputList = new ArrayList<>();

        String key = (String) genericRecord.get("datasuppliercode");
        if (key != null) {
            outputList.add(KV.of(key, genericRecord));
        }

        if (!outputList.isEmpty()) {
            context.output(outputList);
        }

    }
}
