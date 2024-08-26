package com.ignite.transformationbqs;




import com.equifax.fabric.uk.ingestion.ccdsaccount.rawfields.RawFields;
import com.equifax.fabric.uk.ingestion.ccdsaccount.standardisedfields.StandardisedFields;
import com.equifax.fabric.uk.ingestion.ccdsaccount.standardisedfields.entity.commercial.commercialFields;
import com.equifax.fabric.uk.ingestion.ccdsaccount.standardisedfields.entity.commercial.discoverydata.discoveryDataFields;
import com.equifax.fabric.uk.ingestion.ccdsaccount.standardisedfields.entity.commercial.identifiers.identifierFields;
import com.equifax.fabric.uk.ingestion.ccdsaccount.standardisedfields.entity.commercial.legacyids.legacyIdFields;
import com.equifax.fabric.uk.ingestion.ccdsaccount.standardisedfields.entity.entityFields;
import com.equifax.fabric.uk.purposing.companies.PURP_COMMERCIAL_CREDIT_COMPANIES_VIEW;
import com.equifax.fabric.uk.purposing.companies.ccdsaccount.CcdsAccount;
import com.equifax.fabric.uk.purposing.companies.ccdsaccount.Latest;
import com.equifax.fabric.uk.purposing.companies.ccdsaccount.header.HeaderFields;
import com.equifax.fabric.uk.purposing.companies.paymentprofile.PaymentProfileFull;
import com.equifax.fabric.uk.purposing.companies.paymentprofile.Profile;
import com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader;
import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.transforms.DoFn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.*;

public class CCDSTransformation extends DoFn<GenericRecord, GenericRecord> implements Serializable {
    private static final Logger LOGGER = LoggerFactory.getLogger(TransformationBQ.class);
    @ProcessElement
    public void processElement(@Element GenericRecord genericRecord, ProcessContext processContext) {
        LOGGER.error("genericRecord >>>>> " + genericRecord);
        LOGGER.error("processContext >>>>> " + processContext);
        PURP_COMMERCIAL_CREDIT_COMPANIES_VIEW companiesView = new PURP_COMMERCIAL_CREDIT_COMPANIES_VIEW();
        companiesView.setPurposingHeader(TransformationBQ.getPurposingHeader(genericRecord));
        CcdsAccount ccdsAccount = new CcdsAccount();
        List<Latest> latest = new ArrayList<>();
        latest.add(getLatest(genericRecord));
        ccdsAccount.setLatest(latest);
        companiesView.setCCDSACCOUNT(ccdsAccount);
        processContext.output(companiesView);
    }

    public Latest getLatest(GenericRecord genericRecord) {
        Latest latest = new Latest();
        latest.setPurposingHeader(getPurposingHeader(genericRecord));
        latest.setRawfields(getRawFields(genericRecord));
        latest.setStandardised(getStandardisedFields(genericRecord));
        latest.setHeader(getHeaderFields(genericRecord));
        latest.setProfile(getProfile(genericRecord));
        latest.setPreviousFacilityNumbers(List.of("NA"));
        return latest;
    }

    public PurposingHeader getPurposingHeader(GenericRecord genericRecord) {
        PurposingHeader purposingHeader = new PurposingHeader();
        //List<additionalInfo> additionalInfos = new ArrayList<>();
        purposingHeader.setAdditionalInfo(Map.of("NA","NA"));
        purposingHeader.setDateReported(null);
        purposingHeader.setMatchKey(null);
        purposingHeader.setRecordUuid(null);
        return purposingHeader;
    }
   /* public additionalInfo getAdditionalInfo(GenericRecord genericRecord) {
        additionalInfo additionalInfo = new additionalInfo();
        additionalInfo.setKey("NA");
        additionalInfo.setValue("NA");
        return additionalInfo;
    }*/

    public RawFields getRawFields(GenericRecord genericRecord) {
        RawFields rawFields = new RawFields();
        rawFields.setFACILITYNUMBER((genericRecord.get("facilitynumber") != null) ? genericRecord.get("facilitynumber").toString() : "NA");
        rawFields.setFACILITYNUMBERHASH("NA");
        rawFields.setLEGALENTITYTYPE((genericRecord.get("companytypeindicator") != null) ? genericRecord.get("companytypeindicator").toString() : "NA");
        if(genericRecord.get("businessname") != null) {
            rawFields.setBUSINESSNAME((genericRecord.get("businessname") != "") ? genericRecord.get("businessname").toString() : "NA");
        } else {
            rawFields.setBUSINESSNAME("NA");
        }
        if(genericRecord.get("addressline1") != null) {
            rawFields.setADDRESSLINE1((genericRecord.get("addressline1") != "") ? genericRecord.get("addressline1").toString() : "NA");
        } else {
            rawFields.setADDRESSLINE1("NA");
        }
        if(genericRecord.get("addressline2") != null) {
            rawFields.setADDRESSLINE2((genericRecord.get("addressline2") != "") ? genericRecord.get("addressline2").toString() : "NA");
        } else {
            rawFields.setADDRESSLINE2("NA");
        }
        if(genericRecord.get("addressline3") != null) {
            rawFields.setADDRESSLINE3((genericRecord.get("addressline3") != "") ? genericRecord.get("addressline3").toString() : "NA");
        } else {
            rawFields.setADDRESSLINE3("NA");
        }
        if(genericRecord.get("addressline4") != null) {
            rawFields.setADDRESSLINE4((genericRecord.get("addressline4") != "") ? genericRecord.get("addressline4").toString() : "NA");
        } else {
            rawFields.setADDRESSLINE4("NA");
        }
        if(genericRecord.get("addressline5") != null) {
            rawFields.setADDRESSLINE5((genericRecord.get("addressline5") != "") ? genericRecord.get("addressline5").toString() : "NA");
        } else {
            rawFields.setADDRESSLINE5("NA");
        }
        if(genericRecord.get("addressline6") != null) {
            rawFields.setADDRESSLINE6((genericRecord.get("addressline6") != "") ? genericRecord.get("addressline6").toString() : "NA");
        } else {
            rawFields.setADDRESSLINE6("NA");
        }
        if(genericRecord.get("postcode") != null) {
            rawFields.setPOSTCODE((genericRecord.get("postcode") != "") ? genericRecord.get("postcode").toString() : "NA");
        } else {
            rawFields.setPOSTCODE("NA");
        }
        rawFields.setADDITIONALTRADINGSTYLE((genericRecord.get("additionaltradingstyle") != null) ? genericRecord.get("additionaltradingstyle").toString() : "NA");
        rawFields.setBUSINESSTELEPHONENUMBER((genericRecord.get("businesstelephonenumber") != null) ? genericRecord.get("businesstelephonenumber").toString() : "NA");
        rawFields.setCOMPANYREGISTEREDNUMBER((genericRecord.get("companyregisterednumber") != null) ? genericRecord.get("companyregisterednumber").toString() : "NA");
        rawFields.setVATNUMBER((genericRecord.get("vatnumber") != null) ? genericRecord.get("vatnumber").toString() : "NA");
        rawFields.setSPECIALINSTRUCTIONIND((genericRecord.get("specialinstructionindicator") != null) ? genericRecord.get("specialinstructionindicator").toString() : "NA");
        rawFields.setFACILITYTYPE((genericRecord.get("facilitytype") != null) ? genericRecord.get("facilitytype").toString() : "NA");
        rawFields.setSTARTDATE((genericRecord.get("startdateofagreement") != null) ? genericRecord.get("startdateofagreement").toString() : "NA");
        rawFields.setCLOSEDATE((genericRecord.get("closedateofagreement") != null) ? genericRecord.get("closedateofagreement").toString() : "NA");
        rawFields.setCURRENTBALANCE((genericRecord.get("currentbalance") != null) ? genericRecord.get("currentbalance").toString() : "NA");
        rawFields.setCURRENTBALANCECREDITIND((genericRecord.get("currentbalancecreditindicator") != null) ? genericRecord.get("currentbalancecreditindicator").toString() : "NA");
        rawFields.setFACILITYSTATUS((genericRecord.get("facilitystatus") != null) ? genericRecord.get("facilitystatus").toString() : "NA");
        rawFields.setORIGINALDEFAULTBALANCE((genericRecord.get("originaldefaultbalance") != null) ? genericRecord.get("originaldefaultbalance").toString() : "NA");
        rawFields.setDEFAULTSATISFACTIONDATE((genericRecord.get("defaultsatisfactiondate") != null) ? genericRecord.get("defaultsatisfactiondate").toString() : "NA");
        rawFields.setCREDITLIMIT((genericRecord.get("creditoverdraftlimit") != null) ? genericRecord.get("creditoverdraftlimit").toString() : "NA");
        rawFields.setFLAGSETTINGS((genericRecord.get("flagsetting") != null) ? genericRecord.get("flagsetting").toString() : "NA");
        rawFields.setTRFTOCONSOLIDATEDDEBTACNT((genericRecord.get("transfrdtoconsldtddebtaccnt") != null) ? genericRecord.get("transfrdtoconsldtddebtaccnt").toString() : "NA");
        rawFields.setREPAYMENTPERIOD((genericRecord.get("repaymentperiod") != null) ? genericRecord.get("repaymentperiod").toString() : "NA");
        rawFields.setPAYMENTAMOUNT((genericRecord.get("paymentamount") != null) ? genericRecord.get("paymentamount").toString() : "NA");
        rawFields.setPAYMENTFREQUENCY((genericRecord.get("paymentfrequency") != null) ? genericRecord.get("paymentfrequency").toString() : "NA");
        rawFields.setNUMBEROFCASHADVANCES((genericRecord.get("numberofcashadvances") != null) ? genericRecord.get("numberofcashadvances").toString() : "NA");
        rawFields.setVALUEOFCASHADVANCES((genericRecord.get("valueofcashadvances") != null) ? genericRecord.get("valueofcashadvances").toString() : "NA");
        rawFields.setMINIMUMBALANCE((genericRecord.get("minimumbalance") != null) ? genericRecord.get("minimumbalance").toString() : "NA");
        rawFields.setMINIMUMBALANCECREDITIND((genericRecord.get("minimumbalancecreditindicator") != null) ? genericRecord.get("minimumbalancecreditindicator").toString() : "NA");
        rawFields.setMAXIMUMBALANCE((genericRecord.get("maximumbalance") != null) ? genericRecord.get("maximumbalance").toString() : "NA");
        rawFields.setMAXIMUMBALANCECREDITIND((genericRecord.get("maximumbalancecreditindicator") != null) ? genericRecord.get("maximumbalancecreditindicator").toString() : "NA");
        rawFields.setAVERAGEBALANCE((genericRecord.get("averagebalance") != null) ? genericRecord.get("averagebalance").toString() : "NA");
        rawFields.setAVERAGEBALANCECREDITIND((genericRecord.get("averagebalancecreditindicator") != null) ? genericRecord.get("averagebalancecreditindicator").toString() : "NA");
        rawFields.setCREDITTURNOVER((genericRecord.get("creditturnover") != null) ? genericRecord.get("creditturnover").toString() : "NA");
        rawFields.setCREDITTURNOVERNETGROSS((genericRecord.get("creditturnovernetgross") != null) ? genericRecord.get("creditturnovernetgross").toString() : "NA");
        rawFields.setDEBITTURNOVER((genericRecord.get("debitturnover") != null) ? genericRecord.get("debitturnover").toString() : "NA");
        rawFields.setDEBITTURNOVERNETGROSS((genericRecord.get("debitturnovernetgross") != null) ? genericRecord.get("debitturnovernetgross").toString() : "NA");
        rawFields.setREJECTEDPAYMENTS((genericRecord.get("rejectedpayments") != null) ? genericRecord.get("rejectedpayments").toString() : "NA");
        rawFields.setMAXDURATIONOFEXCESS((genericRecord.get("maximumdurationofexcess") != null) ? genericRecord.get("maximumdurationofexcess").toString() : "NA");
        rawFields.setFILLERPOS794((genericRecord.get("filler") != null) ? genericRecord.get("filler").toString() : "NA");
        rawFields.setCHANGEDFACILITYNUMBER((genericRecord.get("changedfacilitynumber") != null) ? genericRecord.get("changedfacilitynumber").toString() : "NA");
        rawFields.setBANKSORTCODE((genericRecord.get("banksortcode") != null) ? genericRecord.get("banksortcode").toString() : "NA");
        rawFields.setBANKACCOUNTNUMBER((genericRecord.get("bankaccountnumber") != null) ? genericRecord.get("bankaccountnumber").toString() : "NA");
        rawFields.setBANKACCOUNTIBAN((genericRecord.get("bankaccountiban") != null) ? genericRecord.get("bankaccountiban").toString() : "NA");
        rawFields.setCURRACNTREPORTINGLEVELIND((genericRecord.get("curraccreportinglevelindicator") != null) ? genericRecord.get("curraccreportinglevelindicator").toString() : "NA");
        rawFields.setPIB((genericRecord.get("pib") != null) ? genericRecord.get("pib").toString() : "NA");
        rawFields.setMONTHLYPAYMENT("NA");
        rawFields.setREJECTIONFLAG("NA");
        rawFields.setPOINTOFCONTACTEMAIL("NA");
        rawFields.setBUSINESSWEBSITE("NA");
        rawFields.setFILENAME("NA");
        rawFields.setDATASUPPLIERCODE((genericRecord.get("datasuppliercode") != null) ? genericRecord.get("datasuppliercode").toString() : "NA");
        rawFields.setDATASUPPLIERID((genericRecord.get("datasupplierid") != null) ? genericRecord.get("datasupplierid").toString() : "NA");
        rawFields.setDATASUPPLIERNAME((genericRecord.get("datasuppliername") != null) ? genericRecord.get("datasuppliername").toString() : "NA");
        rawFields.setFILECREATIONDATE((genericRecord.get("filecreationdate") != null) ? genericRecord.get("filecreationdate").toString() : "NA");
        rawFields.setUSABLESTATUSID((genericRecord.get("usablestatusid") != null) ? genericRecord.get("usablestatusid").toString() : "NA");
        rawFields.setDATEOFGHOSTING((genericRecord.get("dateofghosting") != null) ? genericRecord.get("dateofghosting").toString() : "NA");
        rawFields.setDATEOFUNGHOSTING((genericRecord.get("dateofunghosting") != null) ? genericRecord.get("dateofunghosting").toString() : "NA");
        rawFields.setMASTERFACILITYNUMBER((genericRecord.get("masterfacilitynumber") != null) ? genericRecord.get("masterfacilitynumber").toString() : "NA");
        rawFields.setMATCHEDCOMPANYNUMBER((genericRecord.get("matchedcompanynumber") != null) ? genericRecord.get("matchedcompanynumber").toString() : "NA");
        rawFields.setMATCHEDCOMPANYNUMBERLATEST((genericRecord.get("matchedcompanynumberlatest") != null) ? genericRecord.get("matchedcompanynumberlatest").toString() : "NA");
        rawFields.setMATCHSTATUS((genericRecord.get("matchstatus") != null) ? genericRecord.get("matchstatus").toString() : "NA");
        rawFields.setSUBMISSIONDATE((genericRecord.get("submissiondate") != null) ? genericRecord.get("submissiondate").toString() : "NA");
        rawFields.setGHOSTREQUESTID((genericRecord.get("ghostrequestid") != null) ? genericRecord.get("ghostrequestid").toString() : "NA");
        rawFields.setMASTERGHOSTINGREFERENCENUMBER((genericRecord.get("masterghostingreferencenumber") != null) ? genericRecord.get("masterghostingreferencenumber").toString() : "NA");
        rawFields.setUNGHOSTREQUESTID((genericRecord.get("unghostrequestid") != null) ? genericRecord.get("unghostrequestid").toString() : "NA");
        rawFields.setERRORCODES(List.of("NA"));

        return rawFields;
    }

    public StandardisedFields getStandardisedFields(GenericRecord genericRecord) {
        StandardisedFields standardisedFields = new StandardisedFields();
        if(genericRecord.get("businessname") != null) {
            standardisedFields.setBUSINESSNAME((genericRecord.get("businessname") != "") ? genericRecord.get("businessname").toString() : "NA");
        } else {
            standardisedFields.setBUSINESSNAME("NA");
        }
        standardisedFields.setBUSINESSPOSTCODE("NA");
        if(genericRecord.get("additionaltradingstyle") != null) {
            standardisedFields.setADDITIONALTRADINGSTYLE((genericRecord.get("additionaltradingstyle") != "") ? genericRecord.get("additionaltradingstyle").toString() : "NA");
        } else {
            standardisedFields.setADDITIONALTRADINGSTYLE("NA");
        }
        standardisedFields.setCOMPANYREGISTEREDNUMBER((genericRecord.get("companyregisterednumber") != null) ? genericRecord.get("companyregisterednumber").toString() : "NA");
        standardisedFields.setBUSINESSTELEPHONENUMBER((genericRecord.get("businesstelephonenumber") != null) ? genericRecord.get("businesstelephonenumber").toString() : "NA");
        standardisedFields.setPROCESSINGDATE("NA");
        standardisedFields.setSUPPLIEDCLIENTNUMBER("NA");
        standardisedFields.setMAPPEDCLIENTNUMBER("NA");
        standardisedFields.setFORMATOFSUPPLY("NA");
        standardisedFields.setMIGRATIONFLAG("NA");
        standardisedFields.setMAPPEDSOURCECODE("NA");
        standardisedFields.setCURRENTBALANCE("NA");
        standardisedFields.setCURRENTBALANCECREDITIND("NA");
        standardisedFields.setMINIMUMBALANCE("NA");
        standardisedFields.setMINIMUMBALANCECREDITIND("NA");
        standardisedFields.setMAXIMUMBALANCE("NA");
        standardisedFields.setMAXIMUMBALANCECREDITIND("NA");
        standardisedFields.setAVERAGEBALANCE("NA");
        standardisedFields.setAVERAGEBALANCECREDITIND("NA");
        standardisedFields.setPAYMENTAMOUNT("NA");
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
        commercialFields.setAddresses(Map.of("NA","NA"));
        commercialFields.setPhones(Map.of("NA","NA"));
        commercialFields.setWebsite(Map.of("NA","NA"));
        commercialFields.setNames(Map.of("NA","NA"));
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
        Profile profile = new Profile();
        profile.setFACILITYNUMBER((genericRecord.get("facilitynumber") != null) ? genericRecord.get("facilitynumber").toString() : "NA");
        profile.setSUPPLIEDCLIENTNUMBER("NA");
        profile.setPAYMENTPROFILE("NA");
        List<PaymentProfileFull> paymentProfileFulls = new ArrayList<>();
        paymentProfileFulls.add(getPaymentProfileFull(genericRecord));
        profile.setPAYMENTPROFILEFULL(paymentProfileFulls);
        return profile;
    }

    public PaymentProfileFull getPaymentProfileFull(GenericRecord genericRecord) {
        PaymentProfileFull paymentProfileFull = new PaymentProfileFull();
        paymentProfileFull.setDATE("NA");
        paymentProfileFull.setFLAG("NA");
        paymentProfileFull.setCURRENTBALANCE((genericRecord.get("currentbalance") != null) ? genericRecord.get("currentbalance").toString() : "NA");
       /* if(genericRecord.get("currentbalancecreditindicator") != null) {
            paymentProfileFull.setCURRENTBALANCECREDITIND((genericRecord.get("currentbalancecreditindicator") != "") ? genericRecord.get("currentbalancecreditindicator").toString() : "NA");
        } else {
            paymentProfileFull.setCURRENTBALANCECREDITIND("NA");
        }*/

        paymentProfileFull.setCURRENTBALANCECREDITIND("NA");
        paymentProfileFull.setORIGINALDEFAULTBALANCE((genericRecord.get("originaldefaultbalance") != null) ? genericRecord.get("originaldefaultbalance").toString() : "NA");
        paymentProfileFull.setCREDITLIMIT((genericRecord.get("creditoverdraftlimit") != null) ? genericRecord.get("creditoverdraftlimit").toString() : "NA");
        paymentProfileFull.setPAYMENTAMOUNT((genericRecord.get("paymentamount") != null) ? genericRecord.get("paymentamount").toString() : "NA");
        paymentProfileFull.setPREVIOUSSTATEMENTBALANCE("NA");
        paymentProfileFull.setPAYMENTCREDITIND("NA");
        paymentProfileFull.setPROMOTIONACTIVITYFLAG("NA");
        paymentProfileFull.setVALUEOFCASHADVANCES((genericRecord.get("valueofcashadvances") != null) ? genericRecord.get("valueofcashadvances").toString() : "NA");
        paymentProfileFull.setNUMBEROFCASHADVANCES((genericRecord.get("numberofcashadvances") != null) ? genericRecord.get("numberofcashadvances").toString() : "NA");
        paymentProfileFull.setAVERAGEBALANCE((genericRecord.get("averagebalance") != null) ? genericRecord.get("averagebalance").toString() : "NA");
        /*if(genericRecord.get("averagebalancecreditindicator") != null) {
            paymentProfileFull.setAVERAGEBALANCECREDITIND((genericRecord.get("averagebalancecreditindicator") != "") ? genericRecord.get("averagebalancecreditindicator").toString() : "NA");
        } else {
            paymentProfileFull.setAVERAGEBALANCECREDITIND("NA");
        }*/
        paymentProfileFull.setAVERAGEBALANCECREDITIND("NA");
        paymentProfileFull.setMINIMUMBALANCE((genericRecord.get("minimumbalance") != null) ? genericRecord.get("minimumbalance").toString() : "NA");
       /* if(genericRecord.get("minimumbalancecreditindicator") != null) {
            paymentProfileFull.setMINIMUMBALANCECREDITIND((genericRecord.get("minimumbalancecreditindicator") != "") ? genericRecord.get("minimumbalancecreditindicator").toString() : "NA");
        } else {
            paymentProfileFull.setMINIMUMBALANCECREDITIND("NA");
        }*/
        paymentProfileFull.setMINIMUMBALANCECREDITIND("NA");
        paymentProfileFull.setMAXIMUMBALANCE((genericRecord.get("maximumbalance") != null) ? genericRecord.get("maximumbalance").toString() : "NA");
        /*if(genericRecord.get("maximumbalancecreditindicator") != null) {
            paymentProfileFull.setMAXIMUMBALANCECREDITIND((genericRecord.get("maximumbalancecreditindicator") != "") ? genericRecord.get("maximumbalancecreditindicator").toString() : "NA");
        } else {
            paymentProfileFull.setMAXIMUMBALANCECREDITIND("NA");
        }*/
        paymentProfileFull.setMAXIMUMBALANCECREDITIND("NA");
        paymentProfileFull.setCREDITTURNOVER((genericRecord.get("creditturnover") != null) ? genericRecord.get("creditturnover").toString() : "NA");
        paymentProfileFull.setCREDITTURNOVERNETGROSS((genericRecord.get("creditturnovernetgross") != null) ? genericRecord.get("creditturnovernetgross").toString() : "NA");
        paymentProfileFull.setDEBITTURNOVER((genericRecord.get("debitturnover") != null) ? genericRecord.get("debitturnover").toString() : "NA");
        paymentProfileFull.setDEBITTURNOVERNETGROSS((genericRecord.get("debitturnovernetgross") != null) ? genericRecord.get("debitturnovernetgross").toString() : "NA");
        paymentProfileFull.setREJECTEDPAYMENTS((genericRecord.get("rejectedpayments") != null) ? genericRecord.get("rejectedpayments").toString() : "NA");
        paymentProfileFull.setMAXDURATIONOFEXCESS((genericRecord.get("maximumdurationofexcess") != null) ? genericRecord.get("maximumdurationofexcess").toString() : "NA");
        paymentProfileFull.setSPECIALINSTRUCTIONIND("NA");
        paymentProfileFull.setACCOUNTTYPE("NA");
        paymentProfileFull.setCLOSEDATE("NA");
        paymentProfileFull.setDEFAULTSATISFACTIONDATE("NA");
        paymentProfileFull.setFLAGSETTINGS("NA");
        paymentProfileFull.setTRFTOCONSOLIDATEDDEBTACNT("NA");
        paymentProfileFull.setREPAYMENTPERIOD("NA");
        paymentProfileFull.setMONTHLYPAYMENT("NA");
        paymentProfileFull.setPAYMENTFREQUENCY("NA");
        paymentProfileFull.setFILECREATIONDATE("NA");
        paymentProfileFull.setUSABLESTATUSID("NA");
        paymentProfileFull.setREJECTIONFLAG("NA");
        paymentProfileFull.setPREVIOUSSTATEMENTBALANCEIND("NA");
        paymentProfileFull.setRUNDATE("NA");

        return paymentProfileFull;
    }

    public static class IgniteTransformationException extends RuntimeException {
        public IgniteTransformationException(String message, Throwable cause) {
            super(message, cause);
        }
    }

}





