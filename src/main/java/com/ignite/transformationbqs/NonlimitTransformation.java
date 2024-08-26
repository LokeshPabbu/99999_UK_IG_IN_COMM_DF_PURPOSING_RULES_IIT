package com.ignite.transformationbqs;

import com.equifax.fabric.uk.ingestion.nonlimitedregister.header.headerFields;
import com.equifax.fabric.uk.ingestion.nonlimitedregister.rawfields.RawFields;
import com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.StandardisedFields;
import com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields;
import com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields;
import com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.identifiers.identifierFields;
import com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.legacyids.legacyIdFields;
import com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.entityFields;
import com.equifax.fabric.uk.purposing.companies.PURP_COMMERCIAL_CREDIT_COMPANIES_VIEW;
import com.equifax.fabric.uk.purposing.companies.nonlimitedregister.History;
import com.equifax.fabric.uk.purposing.companies.nonlimitedregister.Latest;
import com.equifax.fabric.uk.purposing.companies.nonlimitedregister.NonlimitedRegister;
import com.equifax.fabric.uk.purposing.companies.nonlimitedregister.bnumber.BNumber;
import com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader;
import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.transforms.DoFn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NonlimitTransformation  extends DoFn<GenericRecord, GenericRecord> implements Serializable {
    private static final Logger LOGGER = LoggerFactory.getLogger(NonlimitTransformation.class);

    @ProcessElement
    public void processElement(@Element GenericRecord genericRecord, ProcessContext processContext) {
        LOGGER.error("genericRecord >>>>> " + genericRecord);
        LOGGER.error("processContext >>>>> " + processContext);
        PURP_COMMERCIAL_CREDIT_COMPANIES_VIEW companiesView = new PURP_COMMERCIAL_CREDIT_COMPANIES_VIEW();
        companiesView.setPurposingHeader(TransformationBQ.getPurposingHeader(genericRecord));
        List<Latest> latest = new ArrayList<>();
        latest.add(getLatest(genericRecord));

        List<History> history = new ArrayList<>();
        history.add(getHistory(genericRecord));

        NonlimitedRegister nonlimitedregister = new NonlimitedRegister();
        nonlimitedregister.setLatest(latest);
        nonlimitedregister.setHistory(history);
        nonlimitedregister.setBNUMBER(getBnumber(genericRecord));
        companiesView.setNONLIMITEDREGISTER(nonlimitedregister);
        processContext.output(companiesView);
    }

    public BNumber getBnumber(GenericRecord genericRecord) {
        BNumber bnumbers = new BNumber();
        bnumbers.setValue((genericRecord.get("company") != null) ? genericRecord.get("company").toString() : "NA");
        return bnumbers;
    }


    public Latest getLatest(GenericRecord genericRecord) {
        Latest latest = new Latest();
        LOGGER.error("getLatest Fun >>>>> " + genericRecord);
        latest.setPurposingHeader(getPurposingHeader(genericRecord));
        latest.setRawfields(getRawFields(genericRecord));
        latest.setStandardised(getStandardisedFields(genericRecord));
        latest.setHeader(getHeaderFields(genericRecord));
        return latest;
    }
    public History getHistory(GenericRecord genericRecord) {
        History history = new History();
        history.setPurposingHeader(gethistoryPurposingHeader(genericRecord));
        history.setRawfields(getHistoryRawFields(genericRecord));
        history.setHeader(getHeaderFields(genericRecord));
        return history;
    }
    public PurposingHeader gethistoryPurposingHeader(GenericRecord genericRecord) {
        PurposingHeader purposingHeader = new PurposingHeader();
        purposingHeader.setAdditionalInfo(Map.of("NA","NA"));
        purposingHeader.setDateReported(null);
        purposingHeader.setMatchKey(null);
        purposingHeader.setRecordUuid(null);
        return purposingHeader;
    }
    public RawFields getRawFields(GenericRecord genericRecord) {
        RawFields rawFields = new RawFields();
        rawFields.setRECORDTYPE("NA");
        rawFields.setDRCID("NA");
        rawFields.setTHOMSONID("NA");
        rawFields.setUPDATEINDICATOR((genericRecord.get("updateind") != null) ? genericRecord.get("updateind").toString() : "NA");
        if(genericRecord.get("name") != null) {
            rawFields.setBUSINESSNAME((genericRecord.get("name") != "") ? genericRecord.get("name").toString() : "NA");
        } else {
            rawFields.setBUSINESSNAME("NA");
        }

        if(genericRecord.get("addressraw") != null) {
            rawFields.setADDRESS((genericRecord.get("addressraw") != "") ? genericRecord.get("addressraw").toString() : "NA");
        } else {
            rawFields.setADDRESS("NA");
        }

        rawFields.setLOCALITY((genericRecord.get("locality") != null) ? genericRecord.get("locality").toString() : "NA");
        rawFields.setTOWN((genericRecord.get("town") != null) ? genericRecord.get("town").toString() : "NA");
        rawFields.setCOUNTY((genericRecord.get("county") != null) ? genericRecord.get("county").toString() : "NA");
        if(genericRecord.get("postcode") != null) {
            rawFields.setPOSTCODE((genericRecord.get("postcode") != "") ? genericRecord.get("postcode").toString() : "NA");
        } else {
            rawFields.setPOSTCODE("NA");
        }
        rawFields.setLOCATIONTYPE((genericRecord.get("loctype") != null) ? genericRecord.get("loctype").toString() : "NA");
        rawFields.setEASYSECTOR((genericRecord.get("sector") != null) ? genericRecord.get("sector").toString() : "NA");
        rawFields.setEASYSECTORDESCRIPTION((genericRecord.get("sectordesc") != null) ? genericRecord.get("sectordesc").toString() : "NA");
        rawFields.setTELEPHONENO((genericRecord.get("telno") != null) ? genericRecord.get("telno").toString() : "NA");
        rawFields.setMAINNUMBERINDICATOR((genericRecord.get("telnomain") != null) ? genericRecord.get("telnomain").toString() : "NA");
        rawFields.setWEBADDRESS((genericRecord.get("webaddr") != null) ? genericRecord.get("webaddr").toString() : "NA");
        //rawFields.setCREATEDDATE((genericRecord.get("suppliercreated") != null) ? genericRecord.get("suppliercreated").toString() : "NA");
        rawFields.setESTABLISHEDMONTH((genericRecord.get("estmonth") != null) ? genericRecord.get("estmonth").toString() : "NA");
        rawFields.setEMPLOYEES((genericRecord.get("employees") != null) ? genericRecord.get("employees").toString() : "NA");
        rawFields.setMODELLEDTURNOVER((genericRecord.get("modturnover") != null) ? genericRecord.get("modturnover").toString() : "NA");
        if(genericRecord.get("fax") != null) {
            rawFields.setFAX((genericRecord.get("fax") != "") ? genericRecord.get("fax").toString() : "NA");
        } else {
            rawFields.setFAX("NA");
        }
        rawFields.setPREMISESTYPECODE((genericRecord.get("premisetype") != null) ? genericRecord.get("premisetype").toString() : "NA");
        rawFields.setSENIORDECISIONMAKERTITLE((genericRecord.get("sdmtitle") != null) ? genericRecord.get("sdmtitle").toString() : "NA");
        if(genericRecord.get("sdmfname") != null) {
            rawFields.setSENIORDECISIONMAKERFIRSTNAME((genericRecord.get("sdmfname") != "") ? genericRecord.get("sdmfname").toString() : "NA");
        } else {
            rawFields.setSENIORDECISIONMAKERFIRSTNAME("NA");
        }
        if(genericRecord.get("sdmsname") != null) {
            rawFields.setSENIORDECISIONMAKERSURNAME((genericRecord.get("sdmsname") != "") ? genericRecord.get("sdmsname").toString() : "NA");
        } else {
            rawFields.setSENIORDECISIONMAKERSURNAME("NA");
        }
        rawFields.setSENIORDECISIONMAKERPOSITION((genericRecord.get("sdmposn") != null) ? genericRecord.get("sdmposn").toString() : "NA");
        rawFields.setTELEPHONEPREFERENCEIND((genericRecord.get("tpspref") != null) ? genericRecord.get("tpspref").toString() : "NA");
        rawFields.setFAXPREFERENCEIND((genericRecord.get("faxpref") != null) ? genericRecord.get("faxpref").toString() : "NA");
        rawFields.setSIC03((genericRecord.get("sic03") != null) ? genericRecord.get("sic03").toString() : "NA");
        rawFields.setSIC07((genericRecord.get("sic07") != null) ? genericRecord.get("sic07").toString() : "NA");
       // rawFields.setLASTSCREENINGRESULTDATE((genericRecord.get("lastscreendate") != null) ? genericRecord.get("lastscreendate").toString() : "NA");
        rawFields.setLASTSCREENINGRESULTCODE((genericRecord.get("lastscreencode") != null) ? genericRecord.get("lastscreencode").toString() : "NA");
        rawFields.setCONTACTTITLE("NA");
        rawFields.setCONTACTFIRSTNAME("NA");

        rawFields.setCONTACTSURNAME("NA");
        rawFields.setCONTACTPOSITION("NA");
        rawFields.setSENIORDECISIONMAKERIND("NA");
        rawFields.setFINANCEIND("NA");
        rawFields.setBUYERIND("NA");
        rawFields.setITIND("NA");
        rawFields.setHRIND("NA");
        rawFields.setMARKETINGIND("NA");
        rawFields.setFLEETIND("NA");
        rawFields.setTELEPHONYIND("NA");
        rawFields.setMANUFACTURINGIND("NA");
        rawFields.setSALESIND("NA");
        rawFields.setNONEXECIND("NA");
        rawFields.setMATCHEDCOMPANYNUMBER((genericRecord.get("company") != null) ? genericRecord.get("company").toString() : "NA");
        rawFields.setFILENAME((genericRecord.get("fileno") != null) ? genericRecord.get("fileno").toString() : "NA");
        rawFields.setBUSINESSINDEXID((genericRecord.get("drcid") != null) ? genericRecord.get("drcid").toString() : "NA");
        return rawFields;
    }
    public StandardisedFields getStandardisedFields(GenericRecord genericRecord) {
        StandardisedFields standardisedFields = new StandardisedFields();
        standardisedFields.setBUSINESSINDEXID((genericRecord.get("drcid") != null) ? genericRecord.get("drcid").toString() : "NA");
        if(genericRecord.get("name") != null) {
            standardisedFields.setBUSINESSNAME((genericRecord.get("name") != "") ? genericRecord.get("name").toString() : "NA");
        } else {
            standardisedFields.setBUSINESSNAME("NA");
        }
        standardisedFields.setPROCESSINGDATE((genericRecord.get("loaddate") != null) ? genericRecord.get("loaddate").toString() : "NA");
        standardisedFields.setFORMATOFSUPPLY("NA");
        standardisedFields.setMIGRATIONFLAG("NA");
        return standardisedFields;
    }
    public entityFields getEntityFields(GenericRecord genericRecord) {
        entityFields entityFields = new entityFields();
        entityFields.setCommercial(getCommercialFields(genericRecord));
        return entityFields;
    }
    public commercialFields getCommercialFields(GenericRecord genericRecord) {
        commercialFields commercialFields = new commercialFields();
        commercialFields.setDiscoveryData(getDiscoveryDataFields(genericRecord));
        commercialFields.setIdentifiers(getIdentifierFields(genericRecord));
        commercialFields.setLegacyIds(getLegacyIdFields(genericRecord));
        commercialFields.setWebsite(Map.of("NA","NA"));
        commercialFields.setPhones(Map.of("NA","NA"));
        commercialFields.setAddresses(Map.of("NA","NA"));
        commercialFields.setNames(Map.of("NA","NA"));
        return commercialFields;
    }
    public discoveryDataFields getDiscoveryDataFields(GenericRecord genericRecord) {
        discoveryDataFields discoveryDataFields = new discoveryDataFields();
        discoveryDataFields.setDISCOVERYCLIENTNUMBER("NA");
        discoveryDataFields.setDISCOVERYACCOUNTNUMBER("NA");
        discoveryDataFields.setDISCOVERYFACILITYNUMBER("NA");
        discoveryDataFields.setDISCOVERYDEFENDENTID("NA");
        discoveryDataFields.setDISCOVERYDRCID("NA");
        discoveryDataFields.setDISCOVERYURN("NA");
        discoveryDataFields.setDISCOVERYCASEID("NA");
        discoveryDataFields.setDISCOVERYCLNBUSINESSNAME("NA");
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
    public headerFields getHeaderFields(GenericRecord genericRecord) {
        headerFields headerFields = new headerFields();
        headerFields.setRUNNUMBER("NA");
        headerFields.setDATECREATED("NA");
        headerFields.setTIMECREATED("NA");
        return headerFields;
    }
    public legacyIdFields getLegacyIdFields(GenericRecord genericRecord) {
        legacyIdFields legacyIdFields = new legacyIdFields();
        legacyIdFields.setLEGACYIDCOMPANYREGISTEREDNUMBER("NA");
        return legacyIdFields;
    }
    public com.equifax.fabric.uk.purposing.companies.nonlimitedregister.history.RawFields getHistoryRawFields(GenericRecord genericRecord) {
        com.equifax.fabric.uk.purposing.companies.nonlimitedregister.history.RawFields rawFields = new com.equifax.fabric.uk.purposing.companies.nonlimitedregister.history.RawFields();
        rawFields.setBUSINESSNAME((genericRecord.get("name") != null) ? genericRecord.get("name").toString() : "NA");
        if(genericRecord.get("addressraw") != null) {
            rawFields.setADDRESS((genericRecord.get("addressraw") != "") ? genericRecord.get("addressraw").toString() : "NA");
        } else {
            rawFields.setADDRESS("NA");
        }
        rawFields.setLOCALITY((genericRecord.get("locality") != null) ? genericRecord.get("locality").toString() : "NA");
        rawFields.setTOWN((genericRecord.get("town") != null) ? genericRecord.get("town").toString() : "NA");
        rawFields.setCOUNTY((genericRecord.get("county") != null) ? genericRecord.get("county").toString() : "NA");
        if(genericRecord.get("postcode") != null) {
            rawFields.setPOSTCODE((genericRecord.get("postcode") != "") ? genericRecord.get("postcode").toString() : "NA");
        } else {
            rawFields.setPOSTCODE("NA");
        }
        return rawFields;
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

}
