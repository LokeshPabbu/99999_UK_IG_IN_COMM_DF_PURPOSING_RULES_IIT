package com.ignite.transformationbqs;


import com.equifax.fabric.uk.ingestion.insightaccount.rawfields.RawFields;
import com.equifax.fabric.uk.ingestion.insightaccount.standardisedfields.StandardisedFields;
import com.equifax.fabric.uk.ingestion.insightaccount.standardisedfields.entity.commercial.commercialFields;
import com.equifax.fabric.uk.ingestion.insightaccount.standardisedfields.entity.commercial.discoverydata.discoveryDataFields;
import com.equifax.fabric.uk.ingestion.insightaccount.standardisedfields.entity.commercial.identifiers.identifierFields;
import com.equifax.fabric.uk.ingestion.insightaccount.standardisedfields.entity.commercial.legacyids.legacyIdFields;
import com.equifax.fabric.uk.ingestion.insightaccount.standardisedfields.entity.entityFields;
import com.equifax.fabric.uk.purposing.companies.PURP_COMMERCIAL_CREDIT_COMPANIES_VIEW;
import com.equifax.fabric.uk.purposing.companies.insightaccount.InsightAccount;
import com.equifax.fabric.uk.purposing.companies.insightaccount.header.HeaderFields;
import com.equifax.fabric.uk.purposing.companies.paymentprofile.PaymentProfileFull;
import com.equifax.fabric.uk.purposing.companies.paymentprofile.Profile;
import com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader;
import org.apache.avro.generic.GenericRecord;
import com.equifax.fabric.uk.purposing.companies.insightaccount.Latest;
import org.apache.beam.sdk.transforms.DoFn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InsightTransformation extends DoFn<GenericRecord, GenericRecord> implements Serializable  {
    private static final Logger LOGGER = LoggerFactory.getLogger(InsightTransformation.class);
    @ProcessElement
    public void processElement(@Element GenericRecord genericRecord, ProcessContext processContext) {
        // LOGGER.error("genericRecord :::: " + genericRecord);
        PURP_COMMERCIAL_CREDIT_COMPANIES_VIEW companiesView = new PURP_COMMERCIAL_CREDIT_COMPANIES_VIEW();
        companiesView.setPurposingHeader(TransformationBQ.getPurposingHeader(genericRecord));
        LOGGER.error("genericRecord :::" + genericRecord);
        InsightAccount insightAccount = new InsightAccount();
        List<Latest> latest = new ArrayList<>();
        latest.add(getLatest(genericRecord));
        insightAccount.setLatest(latest);
        companiesView.setINSIGHTACCOUNT(insightAccount);
        processContext.output(companiesView);
    }


    public Latest getLatest(GenericRecord genericRecord) {
        Latest latest = new Latest();

        latest.setPurposingHeader(getPurposingHeader(genericRecord));
        latest.setRawfields(getRawFields(genericRecord));
//        latest.setRawfields(null);
        latest.setStandardised(getStandardisedFields(genericRecord));
        latest.setHeader(getHeaderFields(genericRecord));
        latest.setProfile(getProfile(genericRecord));


        return latest;
    }


    public RawFields getRawFields(GenericRecord genericRecord) {
        RawFields rawFields = new RawFields();
        rawFields.setRECORDTYPE("NA");
        rawFields.setACCOUNTNUMBER("NA");

        if (genericRecord.get("accountno") != null) {
            rawFields.setBUSINESSNAME((genericRecord.get("accountno") != "") ? genericRecord.get("accountno").toString() : "NA");
        } else {
            rawFields.setBUSINESSNAME("NA");
        }
        rawFields.setACCOUNTNUMBERHASH((genericRecord.get("accountno_hash") != null) ? genericRecord.get("accountno_hash").toString() : "NA");
        rawFields.setLEGALENTITYTYPE("NA");
        if (genericRecord.get("companyname") != null) {
            rawFields.setBUSINESSNAME((genericRecord.get("companyname") != "") ? genericRecord.get("companyname").toString() : "NA");
        } else {
            rawFields.setBUSINESSNAME("NA");
        }
        if (genericRecord.get("addressline1") != null) {
            rawFields.setADDRESSLINE1((genericRecord.get("addressline1") != "") ? genericRecord.get("addressline1").toString() : "NA");
        } else {
            rawFields.setADDRESSLINE1("NA");
        }
        if (genericRecord.get("addressline2") != null) {
            rawFields.setADDRESSLINE2((genericRecord.get("addressline2") != "") ? genericRecord.get("addressline2").toString() : "NA");
        } else {
            rawFields.setADDRESSLINE2("NA");
        }
        if (genericRecord.get("addressline3") != null) {
            rawFields.setADDRESSLINE3((genericRecord.get("addressline3") != "") ? genericRecord.get("addressline3").toString() : "NA");
        } else {
            rawFields.setADDRESSLINE3("NA");
            LOGGER.error("add 3 :::");
        }
        if (genericRecord.get("addressline4") != null) {
            rawFields.setADDRESSLINE4((genericRecord.get("addressline4") != "") ? genericRecord.get("addressline4").toString() : "NA");
        } else {
            rawFields.setADDRESSLINE4("NA");
        }
        if (genericRecord.get("addressline5") != null) {
            rawFields.setADDRESSLINE5((genericRecord.get("addressline5") != "") ? genericRecord.get("addressline5").toString() : "NA");
        } else {
            LOGGER.error("add 5 :::");
            rawFields.setADDRESSLINE5("NA");
        }
        if (genericRecord.get("addressline6") != null) {
            rawFields.setADDRESSLINE6((genericRecord.get("addressline6") != "") ? genericRecord.get("addressline6").toString() : "NA");
        } else {
            LOGGER.error("add 6 :::");
            rawFields.setADDRESSLINE6("NA");
        }

        rawFields.setPOSTCODE("NA");
        rawFields.setADDITIONALTRADINGSTYLE((genericRecord.get("tradingname") != null) ? genericRecord.get("tradingname").toString() : "NA");
        rawFields.setBUSINESSTELEPHONENUMBER("NA");
        rawFields.setCOMPANYREGISTEREDNUMBER("NA");
        rawFields.setVATNUMBER("NA");
        rawFields.setSPECIALINSTRUCTIONIND("NA");
        rawFields.setACCOUNTTYPE((genericRecord.get("accounttype") != null) ? genericRecord.get("accounttype").toString() : "NA");
        rawFields.setSTARTDATE((genericRecord.get("startdate") != null) ? genericRecord.get("startdate").toString() : "NA");
        rawFields.setCLOSEDATE((genericRecord.get("enddate") != null) ? genericRecord.get("enddate").toString() : "NA");
        rawFields.setCURRENTBALANCE((genericRecord.get("currentbalance") != null) ? genericRecord.get("currentbalance").toString() : "NA");
        rawFields.setCURRENTBALANCECREDITIND("NA");
        rawFields.setACCOUNTSTATUS((genericRecord.get("currentstatus") != null) ? genericRecord.get("currentstatus").toString() : "NA");
        rawFields.setORIGINALDEFAULTBALANCE((genericRecord.get("defaultbalance") != null) ? genericRecord.get("defaultbalance").toString() : "NA");
        rawFields.setDEFAULTSATISFACTIONDATE("NA");
        rawFields.setCREDITLIMIT((genericRecord.get("creditlimit") != null) ? genericRecord.get("creditlimit").toString() : "NA");
        rawFields.setFLAGSETTINGS("NA");
        rawFields.setREPAYMENTPERIOD((genericRecord.get("repaymentperiod") != null) ? genericRecord.get("repaymentperiod").toString() : "NA");
        rawFields.setMONTHLYPAYMENT((genericRecord.get("creditterms") != null) ? genericRecord.get("creditterms").toString() : "NA");
        rawFields.setPAYMENTFREQUENCY((genericRecord.get("paymentfreq") != null) ? genericRecord.get("paymentfreq").toString() : "NA");
        rawFields.setNUMBEROFCASHADVANCES("NA");
        rawFields.setVALUEOFCASHADVANCES("NA");
        rawFields.setCREDITTURNOVER("NA");
        rawFields.setREJECTIONFLAG("NA");
        rawFields.setNEWACCOUNTNUMBER("NA");
        rawFields.setBANKSORTCODE("NA");
        rawFields.setDIRECTORNUMBER("NA");
        rawFields.setADDRESSTYPE("NA");
        rawFields.setNAMECHANGEIND("NA");
        rawFields.setSICCODE("NA");
        rawFields.setYEARBUSINESSSTARTED("NA");
        rawFields.setBUSINESSWEBSITE("NA");
        rawFields.setPOINTOFCONTACTNAME("NA");
        rawFields.setPOINTOFCONTACTEMAIL("NA");
        rawFields.setPOINTOFCONTACTTELEPHONENUM("NA");
        rawFields.setPOINTOFCONTACTJOBTITLE("NA");
        rawFields.setPARENTCOMPANYNAME("NA");
        rawFields.setPARENTCOMPANYADDRESSLINE1("NA");
        rawFields.setPARENTCOMPANYADDRESSLINE2("NA");
        rawFields.setPARENTCOMPANYADDRESSLINE3("NA");
        rawFields.setPARENTCOMPANYADDRESSLINE4("NA");
        rawFields.setPARENTCOMPANYADDRESSPOSTCODE("NA");
        rawFields.setPARENTCOMPANYREGISTEREDNUMBER("NA");
        rawFields.setPARENTCOMPANYTELEPHONENUM("NA");
        rawFields.setPARENTCOMPANYVATNUMBER("NA");
        rawFields.setPREVIOUSCOMPANYNAME("NA");
        rawFields.setPREVIOUSCOMPANYADDRESSLINE1("NA");
        rawFields.setPREVIOUSCOMPANYADDRESSLINE2("NA");
        rawFields.setPREVIOUSCOMPANYADDRESSLINE3("NA");
        rawFields.setPREVIOUSCOMPANYADDRESSLINE4("NA");
        rawFields.setPREVIOUSCOMPANYPOSTCODE("NA");
        rawFields.setEXPINCUSTOMERPIN("NA");
        rawFields.setSIGNATORYTYPE("NA");
        rawFields.setSIGNATORYONACCOUNT("NA");
        rawFields.setSHAREHOLDERTYPEFLAG("NA");
        rawFields.setCOUNTRYOFREGISTRATION("NA");
        if (genericRecord.get("birthdate") != null) {
            rawFields.setDATEOFBIRTH((genericRecord.get("birthdate") != "") ? genericRecord.get("birthdate").toString() : "NA");
        } else {
            rawFields.setDATEOFBIRTH("NA");
        }
        rawFields.setDIRECTORSGUARANTEE("NA");
        rawFields.setDIRECTORSGUARANTEECANCELLED("NA");
        rawFields.setPAYMENTAMOUNT("NA");
        rawFields.setDEBENTUREFLAG("NA");
        rawFields.setMORTGAGEFLAG("NA");
        rawFields.setAIRTIMESTATUSFLAG("NA");
        rawFields.setTRANSFERTOCOLLECTIONACCOUNTFLAG("NA");
        rawFields.setBALANCETYPE("NA");
        rawFields.setPRIMARYACCOUNTIND("NA");
        rawFields.setNUMBEROFCREDITCARDSISSUED("NA");
        rawFields.setPAYMENTCREDITIND("NA");
        rawFields.setPREVIOUSSTATEMENTBALANCE("NA");
        rawFields.setPREVIOUSSTATEMENTBALANCEIND("NA");
        rawFields.setPAYMENTCODE("NA");
        rawFields.setPROMOTIONACTIVITYFLAG("NA");
        rawFields.setPAYMENTTYPE("NA");
        rawFields.setNEWDIRECTORNUMBER("NA");
        rawFields.setBANKADDRESSLINE1("NA");
        rawFields.setBANKADDRESSLINE2("NA");
        rawFields.setBANKADDRESSLINE3("NA");
        rawFields.setBANKADDRESSLINE4("NA");
        rawFields.setBANKADDRESSLINE5("NA");
        rawFields.setBANKADDRESSLINE6("NA");
        rawFields.setBANKCHANGEIND("NA");
        rawFields.setBANKNAME("NA");
        rawFields.setBANKPOSTCODE("NA");
        rawFields.setBANKSTREETTYPE("NA");
        rawFields.setINDEMNITYIND((genericRecord.get("indemnityindicator") != null) ? genericRecord.get("indemnityindicator").toString() : "NA");
        rawFields.setINITIALDEPOSIT((genericRecord.get("initialdeposit") != null) ? genericRecord.get("initialdeposit").toString() : "NA");
        rawFields.setUPDATEDATE((genericRecord.get("updatedate") != null) ? genericRecord.get("updatedate").toString() : "NA");
        rawFields.setNAMEADDRESSCHANGEIND("NA");
        rawFields.setNEWREVISEDUPGRADEDIND("NA");
        rawFields.setOVER("NA");
        rawFields.setSTREETTYPE("NA");
        rawFields.setTERMINALPAYMENT((genericRecord.get("terminalpayment") != null) ? genericRecord.get("terminalpayment").toString() : "NA");
        rawFields.setTRANSACTIONTYPE("NA");
        rawFields.setYEARSINBUSINESS("NA");
        rawFields.setPIB("NA");
        rawFields.setREJECTEDPAYMENTS("NA");
        rawFields.setBUSINESSOWNERCHANGEIND("NA");
        rawFields.setBUSINESSOWNERNAME("NA");
        rawFields.setBUSINESSOWNERADDRESSCHANGEFLAG("NA");
        rawFields.setBUSINESSOWNERADDRESSLINE1("NA");
        rawFields.setBUSINESSOWNERADDRESSLINE2("NA");
        rawFields.setBUSINESSOWNERADDRESSLINE3("NA");
        rawFields.setBUSINESSOWNERSTREETTYPE("NA");
        rawFields.setBUSINESSOWNERADDRESSLINE4("NA");
        rawFields.setBUSINESSOWNERADDRESSLINE5("NA");
        rawFields.setBUSINESSOWNERADDRESSLINE6("NA");
        rawFields.setBUSINESSOWNERPOSTCODE("NA");
        rawFields.setFILLERPOS073("NA");
        rawFields.setFILLERPOS083("NA");
        rawFields.setFILLERPOS253("NA");
        rawFields.setFILLERPOS291("NA");
        rawFields.setFILLERPOS544("NA");
        rawFields.setFILLERPOS723("NA");
        rawFields.setFILLERPOS727("NA");
        rawFields.setFILLERPOS852("NA");
        rawFields.setFILLERPOS794("NA");
        rawFields.setFILLERPOS1129("NA");
        rawFields.setFILENAME("NA");
        rawFields.setEQUIFAXCOMPANYREFERENCE((genericRecord.get("equifaxcompanyref") != null) ? genericRecord.get("equifaxcompanyref").toString() : "NA");
        rawFields.setMATCHEDCOMPANYNUMBER((genericRecord.get("companynumber") != null) ? genericRecord.get("companynumber").toString() : "NA");
        rawFields.setTYPEOFCOMPANY((genericRecord.get("typeofcompany") != null) ? genericRecord.get("typeofcompany").toString() : "NA");
        rawFields.setPAYMENTPROFILEHISTORY((genericRecord.get("payprofhistory") != null) ? genericRecord.get("payprofhistory").toString() : "NA");
        rawFields.setLASTPAYMENTPROFILEENTRY((genericRecord.get("lastpayprofentry") != null) ? genericRecord.get("lastpayprofentry").toString() : "NA");
        rawFields.setWORSTSTATUS((genericRecord.get("worststatus") != null) ? genericRecord.get("worststatus").toString() : "NA");
        rawFields.setNAMEFORMATIND((genericRecord.get("nameformatind") != null) ? genericRecord.get("nameformatind").toString() : "NA");
        rawFields.setHOUSEIDENTIFIER((genericRecord.get("houseident") != null) ? genericRecord.get("houseident").toString() : "NA");
        rawFields.setCLIENTTYPE((genericRecord.get("clienttype") != null) ? genericRecord.get("clienttype").toString() : "NA");
        rawFields.setCLIENTNUMBER((genericRecord.get("clientno") != null) ? genericRecord.get("clientno").toString() : "NA");
        rawFields.setAMENDIND((genericRecord.get("amendid") != null) ? genericRecord.get("amendid").toString() : "NA");
        if (genericRecord.get("posttowncode") != null) {
            rawFields.setPOSTTOWNCODE((genericRecord.get("posttowncode") != "") ? genericRecord.get("posttowncode").toString() : "NA");
        } else {
            LOGGER.error("setPOSTTOWNCODE ::::: ");
            rawFields.setPOSTTOWNCODE("NA");
        }
        rawFields.setPOSTTOWNCODE("NA");
        rawFields.setABSOLUTEHOUSEID((genericRecord.get("absolutehseid") != null) ? genericRecord.get("absolutehseid").toString() : "NA");
        rawFields.setSTARTBALANCE((genericRecord.get("startbalance") != null) ? genericRecord.get("startbalance").toString() : "NA");
        rawFields.setCLSBDATE((genericRecord.get("clsbdate") != null) ? genericRecord.get("clsbdate").toString() : "NA");
        rawFields.setCLIENTSOWNINFO((genericRecord.get("clientsowninfo") != null) ? genericRecord.get("clientsowninfo").toString() : "NA");
        rawFields.setADDRESSMATCHEDIND((genericRecord.get("addressmatchedind") != null) ? genericRecord.get("addressmatchedind").toString() : "NA");
        rawFields.setCOMPANYMATCHEDIND((genericRecord.get("companymatchedind") != null) ? genericRecord.get("companymatchedind").toString() : "NA");
        rawFields.setLOADDATE((genericRecord.get("loaddate") != null) ? genericRecord.get("loaddate").toString() : "NA");
        rawFields.setSCALINGFACTOR((genericRecord.get("scalingfactor") != null) ? genericRecord.get("scalingfactor").toString() : "NA");
        rawFields.setCLOSEDUSERGROUP(List.of((genericRecord.get("closedusergroup") != null) ? genericRecord.get("closedusergroup").toString() : "NA"));
        rawFields.setRUNDATE((genericRecord.get("rundate") != null) ? genericRecord.get("rundate").toString() : "NA");
        rawFields.setRUNNUMBER((genericRecord.get("runno") != null) ? genericRecord.get("runno").toString() : "NA");
        rawFields.setJOBNUMBER((genericRecord.get("jobnumber") != null) ? genericRecord.get("jobnumber").toString() : "NA");
        rawFields.setLINENUMBER((genericRecord.get("linenumber") != null) ? genericRecord.get("linenumber").toString() : "NA");
        rawFields.setPROCESSFLAG((genericRecord.get("procflag") != null) ? genericRecord.get("procflag").toString() : "NA");
        rawFields.setMATCHTYPE((genericRecord.get("matchtype") != null) ? genericRecord.get("matchtype").toString() : "NA");
        rawFields.setNCSCFLAG((genericRecord.get("ncsc") != null) ? genericRecord.get("ncsc").toString() : "NA");
        rawFields.setJOBID((genericRecord.get("jobid") != null) ? genericRecord.get("jobid").toString() : "NA");


        return rawFields;
    }

    public StandardisedFields getStandardisedFields(GenericRecord genericRecord) {
        StandardisedFields standardisedFields = new StandardisedFields();
        standardisedFields.setBUSINESSNAME("NA");
        standardisedFields.setBUSINESSPOSTCODE("NA");
        standardisedFields.setADDITIONALTRADINGSTYLE("NA");
        standardisedFields.setCOMPANYREGISTEREDNUMBER("NA");
        standardisedFields.setBUSINESSTELEPHONENUMBER("NA");
        standardisedFields.setPROCESSINGDATE("NA");
        standardisedFields.setSUPPLIEDCLIENTNUMBER("NA");
        standardisedFields.setMAPPEDCLIENTNUMBER("NA");
        standardisedFields.setFORMATOFSUPPLY("NA");
        standardisedFields.setMIGRATIONFLAG("NA");
        standardisedFields.setMAPPEDSOURCECODE("NA");
        standardisedFields.setACCOUNTTYPE((genericRecord.get("accounttype") != null) ? genericRecord.get("accounttype").toString() : "NA");
        standardisedFields.setTRANSACTIONTYPE("NA");
        standardisedFields.setACCOUNTSTATUS((genericRecord.get("currentstatus") != null) ? genericRecord.get("currentstatus").toString() : "NA");
        standardisedFields.setREPAYMENTPERIOD("NA");
        standardisedFields.setCURRENTBALANCE((genericRecord.get("currentbalance") != null) ? genericRecord.get("currentbalance").toString() : "NA");
        standardisedFields.setCURRENTBALANCECREDITIND("NA");
        standardisedFields.setPREVIOUSSTATEMENTBALANCE("NA");
        standardisedFields.setPREVIOUSSTATEMENTBALANCEIND("NA");
        standardisedFields.setPAYMENTAMOUNT("NA");
        standardisedFields.setPAYMENTCREDITIND("NA");
        standardisedFields.setMONTHLYPAYMENT("NA");
        standardisedFields.setSTARTDATE("NA");
        standardisedFields.setCLOSEDATE("NA");
        standardisedFields.setUPDATEDATE("NA");
        standardisedFields.setDEFAULTSATISFACTIONDATE("NA");
        standardisedFields.setHDATEINHEADER("NA");
        standardisedFields.setEntity(getEntityFields(genericRecord));

        return standardisedFields;
    }

    public entityFields getEntityFields(GenericRecord genericRecord) {
        entityFields entityFields = new entityFields();
        entityFields.setCommercial(getCommercialFields(getHeaderFields(genericRecord)));
        return entityFields;
    }

    public commercialFields getCommercialFields(GenericRecord genericRecord) {
        commercialFields commercialFields = new commercialFields();
        commercialFields.setDiscoveryData(getDiscoveryDataFields(genericRecord));
        commercialFields.setIdentifiers(getIdentifierFields(genericRecord));
        commercialFields.setLegacyIds(getLegacyIdFields(genericRecord));
        commercialFields.setAddresses(new HashMap<>());
        commercialFields.setPhones(new HashMap<>());
        commercialFields.setWebsite(new HashMap<>());
        commercialFields.setNames(new HashMap<>());
        return commercialFields;
    }

    public discoveryDataFields getDiscoveryDataFields(GenericRecord genericRecord) {
        discoveryDataFields discoveryDataFields = new discoveryDataFields();
        discoveryDataFields.setDISCOVERYCLIENTNUMBER("NA");
        discoveryDataFields.setDISCOVERYFACILITYNUMBER("NA");
        discoveryDataFields.setDISCOVERYDEFENDENTID("NA");
        discoveryDataFields.setDISCOVERYDRCID("NA");
        discoveryDataFields.setDISCOVERYURN("NA");
        discoveryDataFields.setDISCOVERYCASEID("NA");
        discoveryDataFields.setDISCOVERYCLNBUSINESSNAME("NA");
        discoveryDataFields.setDISCOVERYACCOUNTNUMBER("NA");


        return discoveryDataFields;
    }

    public identifierFields getIdentifierFields(GenericRecord genericRecord) {
        identifierFields identifierFields = new identifierFields();
        identifierFields.setNAMEBUSINESSCOMPANYTYPE("NA");
        identifierFields.setIDENTIFIERBUSINESSVAT("NA");
        identifierFields.setIDENTIFIERBUSINESSEMAIL("NA");
        identifierFields.setIDENTIFIERDISSOLVEDDATE("NA");
        identifierFields.setIDENTIFIERINCORPORATIONDATE("NA");
        identifierFields.setIDENTIFIERUPDATEDATE("NA");
        identifierFields.setIDENTIFIERDATASOURCE("NA");
        return identifierFields;
    }

    public legacyIdFields getLegacyIdFields(GenericRecord genericRecord) {
        legacyIdFields legacyIdFields = new legacyIdFields();
        legacyIdFields.setLEGACYIDCOMPANYREGISTEREDNUMBER("NA");
        return legacyIdFields;
    }

    public HeaderFields getHeaderFields(GenericRecord genericRecord) {
        HeaderFields headerFields = new HeaderFields();
        headerFields.setHDATEINHEADER("NA");
        headerFields.setHSUPPLIEDSOURCECODE("NA");
        return headerFields;
    }

    public Profile getProfile(GenericRecord genericRecord) {
        Profile profile= new Profile();
        profile.setFACILITYNUMBER("NA");
        profile.setSUPPLIEDCLIENTNUMBER("NA");
        profile.setPAYMENTPROFILE((genericRecord.get("payprofhistory") != null) ? genericRecord.get("payprofhistory").toString() : "NA");
        List<PaymentProfileFull> paymentProfileFulls = new ArrayList<>();
        paymentProfileFulls.add(getPaymentProfileFull(genericRecord));
        profile.setPAYMENTPROFILEFULL(paymentProfileFulls);
        return profile;
    }

    public PaymentProfileFull getPaymentProfileFull(GenericRecord genericRecord) {
        PaymentProfileFull paymentProfileFull = new PaymentProfileFull();
        paymentProfileFull.setDATE("NA");
        paymentProfileFull.setFLAG("NA");
        paymentProfileFull.setCURRENTBALANCE("NA");
        paymentProfileFull.setORIGINALDEFAULTBALANCE("NA");
        paymentProfileFull.setCREDITLIMIT("NA");
        paymentProfileFull.setPAYMENTAMOUNT("NA");
        paymentProfileFull.setPREVIOUSSTATEMENTBALANCE("NA");
        paymentProfileFull.setPAYMENTCREDITIND("NA");
        paymentProfileFull.setPROMOTIONACTIVITYFLAG("NA");
        paymentProfileFull.setVALUEOFCASHADVANCES("NA");
        paymentProfileFull.setNUMBEROFCASHADVANCES("NA");
        paymentProfileFull.setAVERAGEBALANCE("NA");
        paymentProfileFull.setMINIMUMBALANCE("NA");
        paymentProfileFull.setMAXIMUMBALANCE("NA");
        paymentProfileFull.setCREDITTURNOVER("NA");
        paymentProfileFull.setDEBITTURNOVER("NA");
        paymentProfileFull.setREJECTEDPAYMENTS("NA");
        paymentProfileFull.setMAXDURATIONOFEXCESS("NA");
/*        paymentProfileFull.setCURRENTBALANCECREDITIND("NA");
        paymentProfileFull.setAVERAGEBALANCECREDITIND("NA");
        paymentProfileFull.setMINIMUMBALANCECREDITIND("NA");
        paymentProfileFull.setMAXIMUMBALANCECREDITIND("NA");
        paymentProfileFull.setCREDITTURNOVERNETGROSS("NA");
        paymentProfileFull.setDEBITTURNOVERNETGROSS("NA");*/
        return paymentProfileFull;
    }

    public PurposingHeader getPurposingHeader(GenericRecord genericRecord) {
        PurposingHeader purposingHeader = new PurposingHeader();

        Map<CharSequence,CharSequence> additionalInfos = new HashMap<>();
        purposingHeader.setAdditionalInfo(Map.of("NA","NA"));
        purposingHeader.setDateReported(null);
        purposingHeader.setMatchKey(null);
        purposingHeader.setRecordUuid(null);
        return purposingHeader;
    }

}
