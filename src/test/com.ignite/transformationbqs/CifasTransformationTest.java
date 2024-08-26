package com.ignite.transformationbqs;

import com.equifax.fabric.commons.storage.util.StorageUtil;
import com.ignite.exception.IgniteTransformationExceptionTest;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.generic.GenericRecordBuilder;
import org.apache.beam.sdk.extensions.avro.coders.AvroCoder;
import org.apache.beam.sdk.extensions.avro.io.AvroIO;
import org.apache.beam.sdk.testing.TestPipeline;
import org.apache.beam.sdk.transforms.Create;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.PCollection;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.fail;

public class CifasTransformationTest {
    @Rule
    public final transient TestPipeline pipeline = TestPipeline.create();
    // Define the schema
    String schemaString = StorageUtil.readFileAsString("src/test/resources/schemas/cifas/cifa_cifa.avsc");
    Schema schema = new Schema.Parser().parse(schemaString);
    String destschemaString = StorageUtil.readFileAsString("src/test/resources/schemas/newcompanypv.avsc");
    Schema destinationSchema = new Schema.Parser().parse(destschemaString);
    @Test
    public void testCifasTransformation() {

        // Create a test input GenericRecord
        GenericRecord inputRecord = new GenericRecordBuilder(schema)
                .set("companyname", "TestCompany")
                .set("company", "12345678")
                .set("dateloaded", "2023-01-01")
                .set("operatorid", "12345")
                .set("caseid", "case123")
                .set("owningmembernumber", "12345")
                .set("cifasidnumber", "67890")
                .set("membersearchreference", "ref123")
                .set("casetype", "Type1")
                .set("product", "Product1")
                .set("facility", "Facility1")
                .set("frauddate", "2023-02-01")
                .set("archivedate", "2023-03-01")
                .set("destructiondate", "2023-04-01")
                .set("applicationdate", "2023-05-01")
                .set("filingreason", "Reason1")
                .set("availableformatching", "true")
                .set("hometelephone", "1234567890")
                .set("mobiletelephone", "0987654321")
                .set("email", "test@example.com")
                .set("subjectrole", "Role1")
                .set("subjectrolequalifier", "Qualifier1")
                .set("showonconsumerfiles", "true")
                .set("fraudcategory", "Category1")
                .set("addresstype", "Type1")
                .set("timeataddress", "1 year")
                .set("casenumber", "case123")
                .set("origaddrline1", "Line1")
                .set("origaddrline2", "Line2")
                .set("origaddrline3", "Line3")
                .set("origaddrline4", "Line4")
                .set("origaddrline5", "Line5")
                .set("origpostcode", "12345")
                .set("suppliedcompanyname", "SuppliedCompany")
                .set("suppliedcompanynumber", "Supplied123")
                .build();

        // Create a PCollection with the input record
        PCollection<GenericRecord> input = pipeline.apply("Create Input", Create.of(inputRecord).withCoder(AvroCoder.of(schema)));

        // Apply the transformation
        PCollection<GenericRecord> output = input.apply("Apply CifasTransformation", ParDo.of(new CifasTransformation()))
                .setCoder(org.apache.beam.sdk.extensions.avro.coders.AvroCoder.of(destinationSchema));

        output.apply("Writing Map PCollection to Avro",
                        AvroIO.writeGenericRecords(destinationSchema).to("src/test/resources/schemas/cifas/")
                                .withSuffix(".avro"));
        // Run the pipeline
        pipeline.run().waitUntilFinish();
    }
    // Negative Test Case 1: Schema is null
    @Test(expected = NullPointerException.class)
    public void testSchemaNull() {
        Schema nullSchema = null;

        GenericRecord inputRecord = new GenericRecordBuilder(nullSchema)
                .set("companyname", "TestCompany")
                .build();

        PCollection<GenericRecord> input = pipeline.apply("Create Input", Create.of(inputRecord).withCoder(AvroCoder.of(nullSchema)));
        pipeline.run().waitUntilFinish();
    }

    // Negative Test Case 2: Empty GenericRecord
    @Test
    public void testEmptyGenericRecord() {
        GenericRecord inputRecord = new GenericRecordBuilder(schema).build();

        PCollection<GenericRecord> input = pipeline.apply("Create Input", Create.of(inputRecord).withCoder(AvroCoder.of(schema)));
        pipeline.run().waitUntilFinish();
    }

    // Negative Test Case 3: Field Value Null
    @Test
    public void testFieldValueNull() {
        GenericRecord inputRecord = new GenericRecordBuilder(schema)
                .set("companyname", null)  // Set one field to null
                .build();

        PCollection<GenericRecord> input = pipeline.apply("Create Input", Create.of(inputRecord).withCoder(AvroCoder.of(schema)));
        pipeline.run().waitUntilFinish();
    }
}

