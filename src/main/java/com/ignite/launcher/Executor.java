package com.ignite.launcher;

import com.equifax.fabric.commons.storage.util.StorageUtil;
import com.ignite.options.CustomPipelineOptions;
import com.ignite.subdomain.*;
import com.ignite.transformationbqs.*;
import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.extensions.avro.coders.*;
import org.apache.beam.sdk.extensions.avro.io.AvroIO;
import org.apache.beam.sdk.options.PipelineOptionsFactory;

import org.apache.avro.Schema;
import org.apache.beam.sdk.transforms.*;
import org.apache.beam.sdk.values.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

public class Executor implements Serializable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Executor.class);
    public static void main(String[] args) throws IOException {

        PipelineOptionsFactory.register(CustomPipelineOptions.class);
        CustomPipelineOptions options = PipelineOptionsFactory.fromArgs(args).withValidation()
                .as(CustomPipelineOptions.class);
        Pipeline pipeline = Pipeline.create(options);

        String destination = StorageUtil.readFileAsString(options.getDestnationSchema());
        Schema destinationSchema = new Schema.Parser().parse(destination);

        PCollection<GenericRecord> genericRecordPCollectionEncrypt = null;
        PCollection<GenericRecord> pCollection  = null;

        if(options.getSubDomain().equalsIgnoreCase("insight_account")) {
            genericRecordPCollectionEncrypt = InsightDomain.getInsightData(options,pipeline);
            pCollection  = genericRecordPCollectionEncrypt
                    .apply("Mapping", ParDo.of(new InsightTransformation()))
                    .setCoder(org.apache.beam.sdk.extensions.avro.coders.AvroCoder.of(destinationSchema));

        } else  if(options.getSubDomain().equalsIgnoreCase("company_cifas")) {
            genericRecordPCollectionEncrypt = CifasDomain.getCifaData(options,pipeline);
            pCollection  = genericRecordPCollectionEncrypt
                    .apply("Mapping", ParDo.of(new CifasTransformation()))
                    .setCoder(org.apache.beam.sdk.extensions.avro.coders.AvroCoder.of(destinationSchema));

        }  else  if(options.getSubDomain().equalsIgnoreCase("ccds_account")) {
            genericRecordPCollectionEncrypt = CCDSDomain.getCCDSData(options,pipeline);
            pCollection  = genericRecordPCollectionEncrypt
                    .apply("Mapping", ParDo.of(new CCDSTransformation()))
                    .setCoder(org.apache.beam.sdk.extensions.avro.coders.AvroCoder.of(destinationSchema));

        }  else  if(options.getSubDomain().equalsIgnoreCase("nonlimited_register")) {
            genericRecordPCollectionEncrypt = Nonlimited_Register_Domain.getNonlimitedRegData(options,pipeline);
            pCollection  = genericRecordPCollectionEncrypt
                    .apply("Mapping", ParDo.of(new NonlimitTransformation()))
                    .setCoder(org.apache.beam.sdk.extensions.avro.coders.AvroCoder.of(destinationSchema));

        }  else  if(options.getSubDomain().equalsIgnoreCase("officer_legcy")) {
            System.out.println("options.getSubDomain() ::::: " + options.getSubDomain());
            genericRecordPCollectionEncrypt = OfficerLegacyDomain.getOfficerLegacyData(options,pipeline);
            pCollection  = genericRecordPCollectionEncrypt
                    .apply("Mapping", ParDo.of(new OfficerLegacyTransformation()))
                    .setCoder(org.apache.beam.sdk.extensions.avro.coders.AvroCoder.of(destinationSchema));
        }

        if(pCollection != null) {
            pCollection.apply("Writing Map PCollection to Avro",
                    AvroIO.writeGenericRecords(destinationSchema).to(options.getAvroGeneratedPath())
                            .withSuffix(".avro"));
        }

        // Run the pipeline
        pipeline.run().waitUntilFinish();
    }
}