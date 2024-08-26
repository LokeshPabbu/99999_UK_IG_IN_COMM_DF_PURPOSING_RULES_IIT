package com.ignite.launcher;

import com.ignite.options.CustomPipelineOptions;
import com.ignite.subdomain.CCDSGropingDomain;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Serializable;

public class CCDSExecutor implements Serializable {
    private static final Logger LOGGER = LoggerFactory.getLogger(CCDSExecutor.class);
    public static void main(String[] args) throws IOException {

        PipelineOptionsFactory.register(CustomPipelineOptions.class);
        CustomPipelineOptions options = PipelineOptionsFactory.fromArgs(args).withValidation()
                .as(CustomPipelineOptions.class);
        Pipeline pipeline = Pipeline.create(options);

        CCDSGropingDomain.getCCDSData(options,pipeline);

        pipeline.run().waitUntilFinish();
    }
}
