package com.ignite.subdomain;

import com.equifax.fabric.commons.storage.util.StorageUtil;
import com.google.api.services.bigquery.model.TableRow;
import com.ignite.dofn.GenericRecordToRowFn;
import com.ignite.dofn.RowToGenericRecordConverterFn;
import com.ignite.dofn.TableRowToGenericRecordConverterFn;
import com.ignite.options.CustomPipelineOptions;
import com.ignite.transformation.*;
import com.ignite.util.BigQueryUtil;
import com.ignite.util.JsonUtil;
import com.ignite.util.PiiDecryptUtil;
import com.ignite.util.SecurityUtil;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.extensions.avro.coders.AvroCoder;
import org.apache.beam.sdk.coders.RowCoder;
import org.apache.beam.sdk.extensions.sql.SqlTransform;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.sdk.values.PCollectionTuple;
import org.apache.beam.sdk.values.Row;
import org.apache.beam.sdk.values.TupleTag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Serializable;

public class InsightDomain implements Serializable {
    private static final Logger LOGGER = LoggerFactory.getLogger(InsightDomain.class);
    public static PCollection<GenericRecord> getInsightData(CustomPipelineOptions options,Pipeline pipeline) throws IOException {

        String insightComminsightmaster = StorageUtil.readFileAsString(options.getInsightCMSchema());
        Schema insightCMSchema = new Schema.Parser().parse(insightComminsightmaster);

        String iiSchemaStr = StorageUtil.readFileAsString(options.getInsigtInsightSchema());
        Schema iiSchema = new Schema.Parser().parse(iiSchemaStr);

        String mergedSchemaStr = StorageUtil.readFileAsString(options.getInsightMergedSchema());
        Schema mergedSchema = new Schema.Parser().parse(mergedSchemaStr);

        DataSetConfigDetails insightCommConfig = JsonUtil.readDataSetConfig("bq_read/insightComm.json");
        org.apache.beam.sdk.schemas.Schema insightCommSchema = RowSchemaBuilder.getSchema(insightCommConfig);

        PCollection<TableRow> insightCom = BigQueryUtil.getTableRow(pipeline, options.getProject(),
                options.getDataSet(), options.getInsightCMTableName(),
                options.getCurrentDate());

        PCollection<GenericRecord> insightComGeneric = insightCom.apply(
                        "convert cons_product BQ tableRow to Row",
                        ParDo.of(new TableRowToGenericRecordConverterFn((insightCMSchema))))
                .setCoder(org.apache.beam.sdk.extensions.avro.coders.AvroCoder.of(insightCMSchema));

        PCollection<GenericRecord> piiDecryptedPCollection = insightComGeneric
                .apply("DECRYPT PII FIELDS", ParDo.of(new PiiDecryptUtil(options.getBqInCommPiiDekPath(),
                        options.getBqInCommPiiGroupId())))
                .setCoder(AvroCoder.of(insightCMSchema));

        PCollection<Row> insightCommRow = piiDecryptedPCollection.
                apply("Generic Record to Row", ParDo.of(new GenericRecordToRowFn(insightCommSchema)))
                .setCoder(RowCoder.of(insightCommSchema));


       DataSetConfigDetails insightConfig = JsonUtil.readDataSetConfig("bq_read/insight.json");
        org.apache.beam.sdk.schemas.Schema schema = RowSchemaBuilder.getSchema(insightConfig);



        PCollection<TableRow> insight = BigQueryUtil.getTableRow(pipeline, options.getProject(),
                options.getDataSet(), options.getInsigtInsightTableName(),
                options.getCurrentDate());

        PCollection<GenericRecord> insightGeneric = insight.apply(
                        "convert cons_product BQ tableRow to Row",
                        ParDo.of(new TableRowToGenericRecordConverterFn(iiSchema)))
                .setCoder(org.apache.beam.sdk.extensions.avro.coders.AvroCoder.of(iiSchema));

        PCollection<GenericRecord> piiDecryptedPCollection1 = insightGeneric
                .apply("DECRYPT PII FIELDS", ParDo.of(new PiiDecryptUtil(options.getBqPiiDekPath(),
                        options.getBqPiiGroupId())))
                .setCoder(AvroCoder.of(iiSchema));

        PCollection<Row> insightRow = piiDecryptedPCollection1.
                apply("Generic Record to Row", ParDo.of(new GenericRecordToRowFn(schema)))
                .setCoder(RowCoder.of(schema));


         StringBuffer query = new StringBuffer();
        query.append("SELECT ")
                .append("a.equifaxcompanyref, a.companynumber, a.typeofcompany, a.payprofhistory, a.lastpayprofentry, a.currentstatus, a.worststatus, a.nameformatind, ")
                .append("a.houseident, a.clienttype, a.accounttype, a.clientno, a.paymentfreq, a.updatedate, a.amendid, a.accountno, a.posttowncode, a.absolutehseid, a.startdate, ")
                .append("a.enddate, a.creditlimit, a.currentbalance, a.defaultbalance, a.startbalance, a.creditterms, a.repaymentperiod, a.indicators, a.clsbdate,  ")
                .append("a.clientsowninfo, a.addressmatchedind, a.companymatchedind, a.addressline1, a.addressline2, a.addressline3, a.addressline4, a.addressline5, ")
                .append("a.addressline6, a.loaddate, a.companyname, a.tradingname, a.scalingfactor, a.indemnityindicator, a.initialdeposit, a.terminalpayment, a.closedusergroup,  ")
                .append("a.rundate, a.runno, a.jobnumber, a.linenumber, a.procflag, a.matchtype, a.birthdate, a.ncsc, a.jobid, a.companyname_hash, a.birthdate_hash, a.accountno_hash,  ")
                .append("a.posttowncode_hash, a.addressline1_hash, a.addressline2_hash, a.addressline3_hash, a.addressline4_hash, a.addressline5_hash, a.addressline6_hash, ")
                .append("b.company, b.ibmclienttype, b.ibmaccounttype, b.ibmclientno, b.ltd, b.tapesrc, b.m_date, b.m_user, b.taperef, b.matchstatus, b.transactiontype,  ")
                .append("b.commencementdate, b.termsamount, b.termsoverinto, b.termsmonths, b.outstandingbalance, b.agreementnumber, b.newrevised, b.compnameaddrchange,  ")
                .append("b.comphousename, b.comphousenumber, b.compstreetname, b.compstreettype, b.compdistrict, b.compposttown, b.compcounty, b.comppostcode, b.comptelephone,  ")
                .append("b.compregistrationno, b.comptype, b.vatnumber, b.othertradingstyle, b.siccode, b.bankchangeflag, b.bankhousename, b.bankhousenumber, b.bankstreetname,  ")
                .append("b.bankstreettype, b.bankdistrict, b.bankposttown, b.bankcounty, b.bankpostcode, b.bankname, b.banksortcode, b.propchangeflag, b.prophousename,  ")
                .append("b.prophousenumber, b.propstreetname, b.propstreettype, b.propdistrict, b.propposttown, b.propcounty, b.proppostcode, b.propname, b.acno, b.matchref,  ")
                .append("b.yearsinbusiness,  b.firstdefaultdate, b.latestdefaultdate, b.sparedate, b.sparechar,   b.comphousename_hash, b.bankhousename_hash, b.bankname_hash,  ")
                .append("b.prophousename_hash, b.propname_hash, b.tradingname_hash, b.comphousenumber_hash, b.comppostcode_hash, b.bankhousenumber_hash, b.bankpostcode_hash,  ")
                .append("b.prophousenumber_hash, b.proppostcode_hash ")
                .append("FROM  ")
                .append("`" + options.getInsightCMTableName() +
                        "` as a JOIN `" + options.getInsigtInsightTableName() +
                        "` as b on a.clientno = b.ibmclientno and a.accountno_hash = b.accountno_hash ");


        PCollection<Row> result = PCollectionTuple.of(
                        new TupleTag<>(options.getInsightCMTableName()), insightCommRow)
                .and(new TupleTag<>(options.getInsigtInsightTableName()), insightRow)
                .apply(SqlTransform
                        .query((query.toString())));


        PCollection<GenericRecord> genericRecordPCollection  = result
                .apply("CONVERT TABLEROW TO GENERIC RECORD",
                        ParDo.of(new RowToGenericRecordConverterFn(mergedSchema)))
                .setCoder(org.apache.beam.sdk.extensions.avro.coders.AvroCoder.of(mergedSchema));

        PCollection<GenericRecord> genericRecordPCollectionEncrypt = SecurityUtil
                .performPiiEncryption(options, genericRecordPCollection, pipeline, mergedSchema);

        return genericRecordPCollectionEncrypt;

    }
}
