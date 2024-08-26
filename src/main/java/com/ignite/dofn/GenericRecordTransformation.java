package com.ignite.dofn;

import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.transforms.join.CoGbkResult;
import org.apache.beam.sdk.values.KV;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class GenericRecordTransformation extends DoFn<KV<String, CoGbkResult>, Map<String, Iterable<GenericRecord>>> implements Serializable {

    @ProcessElement
    public void processElement(ProcessContext c) {
        CoGbkResult s =   c.element().getValue();
        int size =   s.getSchema().size();
        Map<String, Iterable<GenericRecord>> valueMap = new HashMap<>();

        for (int i = 0; i< size; i++) {
            String tagName =  s.getSchema().getTag(i).getId();
            valueMap.put(tagName, s.getAll(tagName));
        }
        c.output(valueMap);







        /*List<List<String>> mastergenr = new ArrayList<>();
        KV<String, CoGbkResult> input = c.element();
        CoGbkResult s =   c.element().getValue();
        int gk =   s.getSchema().size();
        Map<String, Iterable<GenericRecord>> valueMap = new HashMap<>();

        for (int i=0;i<gk;i++)
        {
            List<String> ghk = new ArrayList<>();
            String hj =  s.getSchema().getTag(i).getId();
            valueMap.put(hj, s.getAll(hj));
        }

        c.output(valueMap);*/

    }
}
