package com.ignite.transformationbqs;

import com.equifax.fabric.commons.storage.util.StorageUtil;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
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

public class CcdsTransformationTest {

    @Rule
    public final transient TestPipeline pipeline = TestPipeline.create();

    // Define the schema
    String schemaString = StorageUtil.readFileAsString("src/test/resources/schemas/ccds/ccds_mergedsourceschemas.avsc");
    Schema schema = new Schema.Parser().parse(schemaString);

    String destschemaString = StorageUtil.readFileAsString("src/test/resources/schemas/newcompanypv.avsc");
    Schema destinationSchema = new Schema.Parser().parse(destschemaString);

    @Test
    public void testCifasTransformation() {

        // Create a test input GenericRecord
        GenericRecord record = new GenericData.Record(schema);

        record.put("urn", "URN12345");
        record.put("datasubmissionid", "DSID12345");
        record.put("pib", "PIB123");
        record.put("facilitynumber", "FAC12345");
        record.put("companytypeindicator", "CompanyType");
        record.put("businessname", "Business Name");
        record.put("addressline1", "Address Line 1");
        record.put("addressline2", "Address Line 2");
        record.put("addressline3", "Address Line 3");
        record.put("addressline4", "Address Line 4");
        record.put("addressline5", "Address Line 5");
        record.put("addressline6", "Address Line 6");
        record.put("postcode", "PC1234");
        record.put("additionaltradingstyle", "Trading Style");
        record.put("businesstelephonenumber", "1234567890");
        record.put("companyregisterednumber", "CRN12345");
        record.put("vatnumber", "VAT12345");
        record.put("specialinstructionindicator", "SpecialInstruction");
        record.put("facilitytype", "Facility Type");
        record.put("startdateofagreement", "2024-01-01");
        record.put("closedateofagreement", "2024-12-31");
        record.put("currentbalance", "10000");
        record.put("currentbalancecreditindicator", "Credit");
        record.put("facilitystatus", "Active");
        record.put("originaldefaultbalance", "5000");
        record.put("defaultsatisfactiondate", "2024-06-01");
        record.put("creditoverdraftlimit", "2000");
        record.put("flagsetting", "Flag1");
        record.put("transfrdtoconsldtddebtaccnt", "2024-07-01");
        record.put("repaymentperiod", "12 months");
        record.put("paymentamount", "500");
        record.put("paymentfrequency", "Monthly");
        record.put("numberofcashadvances", "5");
        record.put("valueofcashadvances", "1000");
        record.put("minimumbalance", "100");
        record.put("minimumbalancecreditindicator", "Credit");
        record.put("maximumbalance", "15000");
        record.put("maximumbalancecreditindicator", "Credit");
        record.put("averagebalance", "7500");
        record.put("averagebalancecreditindicator", "Credit");
        record.put("creditturnover", "25000");
        record.put("creditturnovernetgross", "Net");
        record.put("debitturnover", "20000");
        record.put("debitturnovernetgross", "Gross");
        record.put("rejectedpayments", "2");
        record.put("maximumdurationofexcess", "30 days");
        record.put("filler", "N/A");
        record.put("changedfacilitynumber", "CFN12345");
        record.put("banksortcode", "SortCode123");
        record.put("bankaccountnumber", "BAN12345");
        record.put("bankaccountiban", "IBAN12345");
        record.put("curraccreportinglevelindicator", "Indicator1");
        record.put("postcodealpha", "AlphaPC");
        record.put("telephonealpha", "AlphaTel");
        record.put("startdatealpha", "AlphaStart");
        record.put("businessnamealpha", "AlphaName");
        record.put("matchstatus", "Matched");
        record.put("matchedcompanynumber", "MCN12345");
        record.put("matchedname", "Matched Name");
        record.put("matchednamealpha", "AlphaMatchedName");
        record.put("matchednolicorp", "NLC12345");
        record.put("usablestatusid", "Status1");
        record.put("recordprocessingstatusid", "Status2");
        record.put("matchedcompanynumberlatest", "MCNLatest12345");
        record.put("businessname_hash", "hash1");
        record.put("businessnamealpha_hash", "hash2");
        record.put("matchedname_hash", "hash3");
        record.put("matchednamealpha_hash", "hash4");
        record.put("addressline1_hash", "hash5");
        record.put("addressline2_hash", "hash6");
        record.put("addressline3_hash", "hash7");
        record.put("addressline4_hash", "hash8");
        record.put("addressline5_hash", "hash9");
        record.put("addressline6_hash", "hash10");
        record.put("postcode_hash", "hash11");
        record.put("postcodealpha_hash", "hash12");
        record.put("datasupplierid", "DSID12345");
        record.put("filetypeid", "FTID12345");
        record.put("submissiondate", "2024-08-01");
        record.put("filesourcecode", "FSC12345");
        record.put("filecreationdate", "2024-07-01");
        record.put("dateofcreation", "2024-07-15");
        record.put("masterkey", "MK12345");
        record.put("masterfacilitynumber", "MFN12345");
        record.put("slavefacilitynumber", "SFN12345");
        record.put("datechanged", "2024-08-01");
        record.put("previousfacilitynumber", "PFN12345");
        record.put("datasuppliercode", "DSC12345");
        record.put("datasuppliername", "Data Supplier Name");
        record.put("masterghostingreferencenumber", "MGRN12345");
        record.put("dateofghosting", "2024-08-01");
        record.put("dateofunghosting", "2024-08-15");
        record.put("ghostingreferencenumber", "GRN12345");
        record.put("unghostrequestid", "UGRID12345");
        record.put("ghostrequestid", "GRID12345");

        // Create a PCollection with the input record
        PCollection<GenericRecord> input = pipeline.apply("Create Input", Create.of(record).withCoder(AvroCoder.of(schema)));

        // Apply the transformation
        PCollection<GenericRecord> output = input.apply("Apply CcdsTransformation", ParDo.of(new CCDSTransformation()))
                .setCoder(org.apache.beam.sdk.extensions.avro.coders.AvroCoder.of(destinationSchema));

        output.apply("Writing Map PCollection to Avro",
                AvroIO.writeGenericRecords(destinationSchema).to("src/test/resources/schemas/ccds/")
                        .withSuffix(".avro"));



        // Run the pipeline
        pipeline.run().waitUntilFinish();
    }

    // Negative Test Case 1: Schema is null
    @Test(expected = NullPointerException.class)
    public void testSchemaNull() {
        Schema nullSchema = null;

        GenericRecord inputRecord = new GenericRecordBuilder(nullSchema)
                .set("datasubmissionid", "TestCompany")
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
                .set("datasubmissionid", null)  // Set one field to null
                .build();

        PCollection<GenericRecord> input = pipeline.apply("Create Input", Create.of(inputRecord).withCoder(AvroCoder.of(schema)));
        pipeline.run().waitUntilFinish();
    }
}
