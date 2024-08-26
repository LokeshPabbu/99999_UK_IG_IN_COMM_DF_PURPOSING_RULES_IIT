package com.ignite.dofn;

import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.values.KV;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.List;

public class GenericRecordToKeyValue extends DoFn<GenericRecord, KV<String, GenericRecord>> implements Serializable {

    private static final Logger LOGGER = LoggerFactory.getLogger(GenericRecordToKeyValue.class);

    @ProcessElement
    public void processElement(ProcessContext context) {

        GenericRecord genericRecord = context.element();

        LOGGER.error("Transformed Generic Record --- >>>>> " + genericRecord);
        GenericRecord AccountGenericRecord = null;

        AccountGenericRecord = (GenericRecord) genericRecord.get("INSIGHT_ACCOUNT");
        if(AccountGenericRecord == null) {
            AccountGenericRecord = (GenericRecord) genericRecord.get("COMPANY_CIFAS");
        }
        if(AccountGenericRecord == null) {
            AccountGenericRecord = (GenericRecord) genericRecord.get("CCDS_ACCOUNT");
        }
        LOGGER.error("Generic Insight Record" + AccountGenericRecord);
        List<GenericRecord> latest = (List<GenericRecord>) AccountGenericRecord.get("latest");
        String key = "";

        for (GenericRecord genericRecord1:latest){
            GenericRecord raw = (GenericRecord) genericRecord1.get("standardised");
             key = (String) raw.get("COMPANY_REGISTERED_NUMBER");
            //break;

        }

      /*  latest.forEach(genericRecord1 -> {

            *//*GenericRecord latestGroup = new GenericData.Record();*//*

            GenericRecord raw = (GenericRecord) genericRecord1.get("rawfields");

            raw.get("COMPANY_REGISTERED_NUMBER");

           *//* GenericRecord casted = (GenericRecord) latestGroup.get("INSIGHT_ACCOUNT");
            casted.get("latest");
            List<GenericRecord> latestGR = new ArrayList<>();*//*


        });*/

        context.output(KV.of(key,genericRecord));




           /* List<GenericRecord> genericRecordList = new ArrayList<>();

            genericRecordList.add(genericRecord1);

            genericRecord.put("latest",genericRecordList);

            GenericRecord GE = (GenericRecord) genericRecord1.get("rawfields");
            String key;
            key = GE.get("COMPANY_REGISTERED_NUMBER").toString();
            Map<String,GenericRecord> recordMap = new HashMap<>();
            recordMap.put("Insight",genericRecord);
            context.output(KV.of(key,recordMap));});*/


    }
}
