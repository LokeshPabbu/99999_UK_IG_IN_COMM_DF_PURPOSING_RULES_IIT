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

public class InsightTransformationTest {

    @Rule
    public final transient TestPipeline pipeline = TestPipeline.create();

    // Define the schema
    String schemaString = StorageUtil.readFileAsString("src/test/resources/schemas/insight/insight_merged_schema.avsc");
    Schema schema = new Schema.Parser().parse(schemaString);

    String destschemaString = StorageUtil.readFileAsString("src/test/resources/schemas/newcompanypv.avsc");
    Schema destinationSchema = new Schema.Parser().parse(destschemaString);

    @Test
    public void testCifasTransformation() {

        // Create a test input GenericRecord
        GenericRecord record = new GenericData.Record(schema);

        record.put("equifaxcompanyref", "123456789");
        record.put("companynumber", "987654321");
        record.put("typeofcompany", "Private");
        record.put("payprofhistory", "Good");
        record.put("lastpayprofentry", "2024-01-01");
        record.put("currentstatus", "Active");
        record.put("worststatus", "Late");
        record.put("nameformatind", "Full");
        record.put("houseident", "H123");
        record.put("clienttype", "Individual");
        record.put("accounttype", "Credit");
        record.put("clientno", "C987654");
        record.put("paymentfreq", "Monthly");
        record.put("updatedate", "2024-08-01");
        record.put("amendid", "A1");
        record.put("accountno", "ACC123456");
        record.put("posttowncode", "P123");
        record.put("absolutehseid", "HSID123");
        record.put("startdate", "2024-01-01");
        record.put("enddate", "2024-12-31");
        record.put("creditlimit", "10000");
        record.put("currentbalance", "5000");
        record.put("defaultbalance", "0");
        record.put("startbalance", "1000");
        record.put("creditterms", "12 months");
        record.put("repaymentperiod", "12 months");
        record.put("indicators", "None");
        record.put("clsbdate", "2024-12-31");
        record.put("clientsowninfo", "Info1");
        record.put("addressmatchedind", "Yes");
        record.put("companymatchedind", "Yes");
        record.put("addressline1", "123 Street");
        record.put("addressline2", "Apt 4B");
        record.put("addressline3", "City Center");
        record.put("addressline4", "Suburb");
        record.put("addressline5", "County");
        record.put("addressline6", "Country");
        record.put("loaddate", "2024-08-01");
        record.put("companyname", "XYZ Corp");
        record.put("tradingname", "XYZ Trading");
        record.put("scalingfactor", "1.0");
        record.put("indemnityindicator", "No");
        record.put("initialdeposit", "1000");
        record.put("terminalpayment", "200");
        record.put("closedusergroup", "None");
        record.put("rundate", "2024-08-01");
        record.put("runno", "Run1");
        record.put("jobnumber", "Job123");
        record.put("linenumber", "1");
        record.put("procflag", "Processed");
        record.put("matchtype", "Exact");
        record.put("birthdate", "1990-01-01");
        record.put("ncsc", "N123");
        record.put("jobid", "JobID123");
        record.put("companyname_hash", "hash1");
        record.put("birthdate_hash", "hash2");
        record.put("accountno_hash", "hash3");
        record.put("posttowncode_hash", "hash4");
        record.put("addressline1_hash", "hash5");
        record.put("addressline2_hash", "hash6");
        record.put("addressline3_hash", "hash7");
        record.put("addressline4_hash", "hash8");
        record.put("addressline5_hash", "hash9");
        record.put("addressline6_hash", "hash10");
        record.put("company", "XYZ");
        record.put("ibmclienttype", "ClientType1");
        record.put("ibmaccounttype", "AccountType1");
        record.put("ibmclientno", "ClientNo123");
        record.put("ltd", "Yes");
        record.put("tapesrc", "Source1");
        record.put("m_date", "2024-08-01");
        record.put("m_user", "User1");
        record.put("taperef", "Ref123");
        record.put("matchstatus", "Matched");
        record.put("transactiontype", "Credit");
        record.put("commencementdate", "2024-01-01");
        record.put("termsamount", "10000");
        record.put("termsoverinto", "6 months");
        record.put("termsmonths", "12");
        record.put("outstandingbalance", "5000");
        record.put("agreementnumber", "AG123");
        record.put("newrevised", "Revised");
        record.put("compnameaddrchange", "No");
        record.put("comphousename", "Building A");
        record.put("comphousenumber", "No 123");
        record.put("compstreetname", "Main Street");
        record.put("compstreettype", "Avenue");
        record.put("compdistrict", "District1");
        record.put("compposttown", "Post Town");
        record.put("compcounty", "County1");
        record.put("comppostcode", "PC123");
        record.put("comptelephone", "1234567890");
        record.put("compregistrationno", "Reg123");
        record.put("comptype", "Type1");
        record.put("vatnumber", "VAT123");
        record.put("othertradingstyle", "Style1");
        record.put("siccode", "SIC123");
        record.put("bankchangeflag", "Yes");
        record.put("bankhousename", "Bank Building");
        record.put("bankhousenumber", "No 456");
        record.put("bankstreetname", "Bank Street");
        record.put("bankstreettype", "Boulevard");
        record.put("bankdistrict", "Bank District");
        record.put("bankposttown", "Bank Town");
        record.put("bankcounty", "Bank County");
        record.put("bankpostcode", "BankPC");
        record.put("bankname", "BankName");
        record.put("banksortcode", "SortCode123");
        record.put("propchangeflag", "No");
        record.put("prophousename", "Prop Building");
        record.put("prophousenumber", "No 789");
        record.put("propstreetname", "Prop Street");
        record.put("propstreettype", "Road");
        record.put("propdistrict", "Prop District");
        record.put("propposttown", "Prop Town");
        record.put("propcounty", "Prop County");
        record.put("proppostcode", "PropPC");
        record.put("propname", "Prop Name");
        record.put("acno", "AC123");
        record.put("matchref", "Match123");
        record.put("yearsinbusiness", "10");
        record.put("firstdefaultdate", "2024-02-01");
        record.put("latestdefaultdate", "2024-07-01");
        record.put("sparedate", "2024-06-01");
        record.put("sparechar", "Spare1");
        record.put("comphousename_hash", "hash11");
        record.put("bankhousename_hash", "hash12");
        record.put("bankname_hash", "hash13");
        record.put("prophousename_hash", "hash14");
        record.put("propname_hash", "hash15");
        record.put("tradingname_hash", "hash16");
        record.put("comphousenumber_hash", "hash17");
        record.put("comppostcode_hash", "hash18");
        record.put("bankhousenumber_hash", "hash19");
        record.put("bankpostcode_hash", "hash20");
        record.put("prophousenumber_hash", "hash21");
        record.put("proppostcode_hash", "hash22");

        // Create a PCollection with the input record
        PCollection<GenericRecord> input = pipeline.apply("Create Input", Create.of(record).withCoder(AvroCoder.of(schema)));

        // Apply the transformation
        PCollection<GenericRecord> output = input.apply("Apply CifasTransformation", ParDo.of(new InsightTransformation()))
                .setCoder(org.apache.beam.sdk.extensions.avro.coders.AvroCoder.of(destinationSchema));

        output.apply("Writing Map PCollection to Avro",
                AvroIO.writeGenericRecords(destinationSchema).to("src/test/resources/schemas/insight/")
                        .withSuffix(".avro"));

        // Run the pipeline
        pipeline.run().waitUntilFinish();
    }

    // Negative Test Case 1: Schema is null
    @Test(expected = NullPointerException.class)
    public void testSchemaNull() {
        Schema nullSchema = null;

        GenericRecord inputRecord = new GenericRecordBuilder(nullSchema)
                .set("companynumber", "TestCompany")
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
                .set("companynumber", null)  // Set one field to null
                .build();

        PCollection<GenericRecord> input = pipeline.apply("Create Input", Create.of(inputRecord).withCoder(AvroCoder.of(schema)));
        pipeline.run().waitUntilFinish();
    }
}
