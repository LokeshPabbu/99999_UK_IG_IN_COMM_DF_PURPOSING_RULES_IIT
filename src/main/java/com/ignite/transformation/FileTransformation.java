package com.ignite.transformation;

import com.equifax.fabric.commons.storage.util.StorageUtil;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ignite.transformationbqs.TransformationBQ;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
public class FileTransformation implements Serializable {
    private static final String MAPPING_FILE_PATH = "gs://df-dna-plt-poc-data-uk-int/BqToAvroPOC/Company_CIFA.json";
    public static Map<String, String> loadFieldMappings() {
        try {
            String jsonStr = StorageUtil.readFileAsString(MAPPING_FILE_PATH);
            ObjectMapper mapper = new ObjectMapper();
            JsonNode mappingsNode = mapper.readTree(jsonStr);
            Map<String, String> mappings = new HashMap<>();
            for (JsonNode mapping : mappingsNode) {
                String oldFieldName = mapping.get("oldFieldName").asText();
                String newFieldName = mapping.get("newFieldName").asText();
                mappings.put(oldFieldName, newFieldName);
            }
            return mappings;
        } catch (IOException e) {
            throw new TransformationBQ.IgniteTransformationException("Error processing field mappings", e);
        }
    }
}