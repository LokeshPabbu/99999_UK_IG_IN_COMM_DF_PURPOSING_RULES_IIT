package com.ignite.transformationbqs;


import com.equifax.datafabric.uk.purposing.implementation.rules.jr.contract.header.PurposingHeader;
import org.apache.avro.generic.GenericRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


public class TransformationBQ implements Serializable /*extends DoFn<GenericRecord, GenericRecord> */{
    private static final Logger LOGGER = LoggerFactory.getLogger(TransformationBQ.class);

   /* @ProcessElement
    public void processElement(@Element GenericRecord genericRecord, ProcessContext processContext) {

        PURP_COMMERCIAL_CREDIT_COMPANIES_VIEW companiesView = new PURP_COMMERCIAL_CREDIT_COMPANIES_VIEW();
        companiesView.setPurposingHeader(getPurposingHeader(genericRecord));

        InsightTransformation insightAccount = new InsightTransformation();
        companiesView.setINSIGHTACCOUNT(insightAccount.getInsightTransformation(genericRecord));

        *//*CompanyCifasTransformation cifasTransformation = new CompanyCifasTransformation();
        companiesView.setCOMPANYCIFAS(cifasTransformation.getCifasDetails(genericRecord));*//*

        processContext.output(companiesView);
    }*/

    public static class IgniteTransformationException extends RuntimeException {
        public IgniteTransformationException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static PurposingHeader getPurposingHeader(GenericRecord genericRecord)
    {
        PurposingHeader purposingHeader = new PurposingHeader();

        Map<CharSequence, CharSequence> value = new HashMap<>();
        value.put("NA","NA");
        purposingHeader.setAdditionalInfo(null);
        purposingHeader.setRunDate(0L);
        purposingHeader.setDataViewName("NA");
        purposingHeader.setEntityKey("NA");
        purposingHeader.setDataViewVersion("NA");

        return purposingHeader;
    }
}
