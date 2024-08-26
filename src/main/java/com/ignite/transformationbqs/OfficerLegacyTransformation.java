package com.ignite.transformationbqs;

import com.equifax.fabric.uk.ingestion.officerlegacy.rawFields.RawFields;
import com.equifax.fabric.uk.ingestion.officerlegacy.standardisedfields.StandardisedFields;
import com.equifax.fabric.uk.purposing.companies.PURP_COMMERCIAL_CREDIT_COMPANIES_VIEW;
import com.equifax.fabric.uk.purposing.companies.officerlegacy.History;
import com.equifax.fabric.uk.purposing.companies.officerlegacy.Latest;
import com.equifax.fabric.uk.purposing.companies.officerlegacy.OfficerLegacy;
import com.equifax.fabric.uk.purposing.officercompanygazette.companies.Companies;
import com.equifax.fabric.uk.purposing.officercompanygazette.companies.companygazzette.CompanyGazettes;
import com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader;
import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.transforms.DoFn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OfficerLegacyTransformation extends DoFn<GenericRecord, GenericRecord> implements Serializable {
    private static final Logger LOGGER = LoggerFactory.getLogger(TransformationBQ.class);
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

        OfficerLegacy officerlegacy = new OfficerLegacy();
        officerlegacy.setLatest(latest);
        officerlegacy.setHistory(history);


        companiesView.setOFFICERLEGACY(officerlegacy);
        processContext.output(companiesView);
    }


    public Latest getLatest(GenericRecord genericRecord) {
        Latest latest = new Latest();

        latest.setPERSONNUMBERPREFIX("NA");
        List<Companies> companies = new ArrayList<>();
        companies.add(getCOMPANIES(genericRecord));
        latest.setCOMPANIES(companies);
        latest.setRawfields(getLetestRawFields(genericRecord));
        latest.setStandardised(getLetestStandardisedFields(genericRecord));
        latest.setAppointments(getLetestAppointmentFields(genericRecord));
        return latest;
    }

    public Companies getCOMPANIES(GenericRecord genericRecord) {
        Companies companies = new Companies();

        companies.setCOMPANYREGISTEREDNUMBER("NA");
        List<CompanyGazettes> companyGazettes = new ArrayList<>();
        companyGazettes.add(getCOMPANYGAZETTES(genericRecord));
        companies.setCOMPANYGAZETTES(companyGazettes);
        return companies;
    }

    public CompanyGazettes getCOMPANYGAZETTES(GenericRecord genericRecord) {
        CompanyGazettes companyGazettes = new CompanyGazettes();

        companyGazettes.setActionDate("NA");
        companyGazettes.setMovementType("NA");

        return companyGazettes;
    }

    public com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.rawfields.RawFields getLetestRawFields(GenericRecord genericRecord) {
        com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.rawfields.RawFields rawFields = new com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.rawfields.RawFields();
        rawFields.setPERSONDATEOFBIRTH("NA");
        rawFields.setPERSONNEWPOSTCODE("NA");
        rawFields.setPERSONPARTIALDATEOFBIRTH("NA");
        return rawFields;
    }

    public com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.standardisedfields.StandardisedFields getLetestStandardisedFields(GenericRecord genericRecord) {
        com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.standardisedfields.StandardisedFields standardisedFields = new com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.standardisedfields.StandardisedFields();
        standardisedFields.setPERSONTITLE("NA");
        standardisedFields.setPERSONFIRSTNAME("NA");
        standardisedFields.setPERSONSURNAME("NA");
        standardisedFields.setPERSONHONOURS("NA");
        standardisedFields.setPERSONNATIONALITY("NA");
        standardisedFields.setPERSONOCCUPATION("NA");
        standardisedFields.setPERSONOLDADDRESSLINE1("NA");
        standardisedFields.setPERSONOLDADDRESSLINE2("NA");
        standardisedFields.setPERSONPOSTTOWN("NA");
        standardisedFields.setPERSONCOUNTRY("NA");
        standardisedFields.setPERSONCOUNTY("NA");
        return standardisedFields;
    }
    public List<com.equifax.fabric.uk.purposing.companies.officerlegacy.Appointments> getLetestAppointmentFields(GenericRecord genericRecord) {
        com.equifax.fabric.uk.purposing.companies.officerlegacy.Appointments appointments = new com.equifax.fabric.uk.purposing.companies.officerlegacy.Appointments();
        List<com.equifax.fabric.uk.purposing.companies.officerlegacy.Appointments> appointmentsList = new ArrayList<>();
        appointments.setPERSONAPPOINTMENTDATE("NA");
        appointments.setPERSONNEWAPPOINTMENTTYPE("NA");
        appointments.setPERSONOCCUPATION("NA");
        appointments.setPERSONRESIGNATIONDATE("NA");
        appointments.setSTATUS("NA");
        appointmentsList.add(appointments);
        return appointmentsList;
    }




    public History getHistory(GenericRecord genericRecord) {
        History history = new History();

        history.setPurposingHeader(getPurposingHeader(genericRecord));
        history.setRawfields(getRawFields(genericRecord));
        history.setStandardised(getStandardisedFields(genericRecord));
        return history;
    }

    public PurposingHeader getPurposingHeader(GenericRecord genericRecord) {
        PurposingHeader purposingHeader = new PurposingHeader();
        purposingHeader.setAdditionalInfo(Map.of("NA","NA"));
        purposingHeader.setDateReported(null);
        purposingHeader.setMatchKey(null);
        purposingHeader.setRecordUuid(null);
        return purposingHeader;
    }

    public RawFields getRawFields(GenericRecord genericRecord) {
        RawFields rawFields = new RawFields();
        rawFields.setCOMPANYREGISTEREDNUMBER((genericRecord.get("company") != null) ? genericRecord.get("company").toString() : "NA");
        rawFields.setPERSONRECORDTYPE("NA");
        rawFields.setPERSONAPPOINTMENTDATEORIGIN("NA");
        rawFields.setPERSONRESIGNATIONDATEORIGIN("NA");
        rawFields.setPERSONCORRECTIONINDICATOR("NA");
        rawFields.setPERSONCORPORATEINDICATOR("NA");
        rawFields.setPERSONFILLERPOS14("NA");
        rawFields.setPERSONOLDAPPOINTMENTTYPE("NA");
        rawFields.setPERSONNEWAPPOINTMENTTYPE((genericRecord.get("appttype") != null) ? genericRecord.get("appttype").toString() : "NA");
        rawFields.setPERSONOLDPERSONNUMBER("NA");
        String persno = (genericRecord.get("persno") != null) ? genericRecord.get("persno").toString() : "NA";
        String perssuf = (genericRecord.get("perssuf") != null) ? genericRecord.get("perssuf").toString() : "NA";
        StringBuffer personnumber = new StringBuffer();

        if (!persno.equalsIgnoreCase("NA") && !persno.equalsIgnoreCase("") )
        {
            personnumber.append(persno);
        }

        if (!perssuf.equalsIgnoreCase("NA") && !perssuf.equalsIgnoreCase("") )
        {
            personnumber.append(perssuf);
        }
        String prnumber = personnumber.toString();
        if (prnumber== null && prnumber.equals("")){
            prnumber = "NA";
        }
       /*if (prnumber != null && !prnumber.equals("")){
           if (prnumber.endsWith(",")) {
            prnumber = prnumber.substring(0, prnumber.length() - 1);
           }
       } else{
           prnumber = "NA";
       }*/

        rawFields.setPERSONNEWPERSONNUMBER(prnumber);

//        rawFields.setPERSONPARTIALDATEOFBIRTH((genericRecord.get("partialdob") != null) ? genericRecord.get("partialdob").toString() : "NA");
        if(genericRecord.get("partialdob") != null) {
            rawFields.setPERSONPARTIALDATEOFBIRTH((genericRecord.get("partialdob") != "") ? genericRecord.get("partialdob").toString() : "NA");
        } else {
            rawFields.setPERSONPARTIALDATEOFBIRTH("NA");
        }

//        rawFields.setPERSONDATEOFBIRTH((genericRecord.get("birthdate") != null) ? genericRecord.get("birthdate").toString() : "NA");

        if(genericRecord.get("birthdate") != null) {
            rawFields.setPERSONDATEOFBIRTH((genericRecord.get("birthdate") != "") ? genericRecord.get("birthdate").toString() : "NA");
        } else {
            rawFields.setPERSONDATEOFBIRTH("NA");
        }

        rawFields.setPERSONOLDPOSTCODE("NA");


//        rawFields.setPERSONNEWPOSTCODE((genericRecord.get("postcode") != null) ? genericRecord.get("postcode").toString() : "NA");
        if(genericRecord.get("postcode") != null) {
            rawFields.setPERSONNEWPOSTCODE((genericRecord.get("postcode") != "") ? genericRecord.get("postcode").toString() : "NA");
        } else {
            rawFields.setPERSONNEWPOSTCODE("NA");
        }
        rawFields.setPERSONAPPOINTMENTDATE((genericRecord.get("apptdate") != null) ? genericRecord.get("apptdate").toString() : "NA");
        rawFields.setPERSONRESIGNATIONDATE((genericRecord.get("resigdate") != null) ? genericRecord.get("resigdate").toString() : "NA");
        rawFields.setPERSONCHANGEDATE("NA");
        rawFields.setPERSONUPDATEDATE("NA");
        rawFields.setPERSONVARIABLEDATALENGTH("NA");

        rawFields.setCOMPANYRECORDTYPE("NA");
        rawFields.setCOMPANYSTATUS("NA");
        rawFields.setCOMPANYFILLERPOS11("NA");
        rawFields.setCOMPANYNUMBEROFOFFICERS("NA");
        rawFields.setCOMPANYNAMELENGTH("NA");
        rawFields.setCOMPANYNAME("NA");
        rawFields.setFILENAME("NA");

        String title = (genericRecord.get("titles") != null) ? genericRecord.get("titles").toString() : "NA";
        String fname = (genericRecord.get("fname") != null) ? genericRecord.get("fname").toString() : "NA";
        String sname = (genericRecord.get("sname") != null) ? genericRecord.get("sname").toString() : "NA";
        String hons = (genericRecord.get("hons") != null) ? genericRecord.get("hons").toString() : "NA";
        String careof = (genericRecord.get("careof") != null) ? genericRecord.get("careof").toString() : "NA";
        String pobox = (genericRecord.get("pobox") != null) ? genericRecord.get("pobox").toString() : "NA";
        String addr1 = (genericRecord.get("addr1") != null) ? genericRecord.get("addr1").toString() : "NA";
        String addr2 = (genericRecord.get("addr2") != null) ? genericRecord.get("addr2").toString() : "NA";
        String town = (genericRecord.get("town") != null) ? genericRecord.get("town").toString() : "NA";
        String county = (genericRecord.get("county") != null) ? genericRecord.get("county").toString() : "NA";
        String countrycd = (genericRecord.get("countrycd") != null) ? genericRecord.get("countrycd").toString() : "NA";
        String occupation = (genericRecord.get("occupation") != null) ? genericRecord.get("occupation").toString() : "NA";
        String nationality = (genericRecord.get("nationality") != null) ? genericRecord.get("nationality").toString() : "NA";

        StringBuffer persondetails = new StringBuffer();

        if (!title.equalsIgnoreCase("NA") && !title.equalsIgnoreCase("")){
            persondetails.append(title);

        } else{
            persondetails.append(" ");
        }
        persondetails.append(",");

        if (!fname.equalsIgnoreCase("NA") && !fname.equalsIgnoreCase("")){
            persondetails.append(fname);

        } else{
            persondetails.append(" ");
        }
        persondetails.append(",");

        if (!sname.equalsIgnoreCase("NA") && !sname.equalsIgnoreCase("")){
            persondetails.append(sname);

        } else{
            persondetails.append(" ");
        }
        persondetails.append(",");

        if (!hons.equalsIgnoreCase("NA") && !hons.equalsIgnoreCase("")){
            persondetails.append(hons);

        } else{
            persondetails.append(" ");
        }
        persondetails.append(",");

        if (!careof.equalsIgnoreCase("NA") && !careof.equalsIgnoreCase("")){
            persondetails.append(careof);

        } else{
            persondetails.append(" ");
        }
        persondetails.append(",");

        if (!pobox.equalsIgnoreCase("NA") && !pobox.equalsIgnoreCase("")){
            persondetails.append(pobox);

        } else{
            persondetails.append(" ");
        }
        persondetails.append(",");

        if (!addr1.equalsIgnoreCase("NA") && !addr1.equalsIgnoreCase("")){
            persondetails.append(addr1);

        } else{
            persondetails.append(" ");
        }
        persondetails.append(",");

        if (!addr2.equalsIgnoreCase("NA") && !addr2.equalsIgnoreCase("")){
            persondetails.append(addr2);

        } else{
            persondetails.append(" ");
        }
        persondetails.append(",");

        if (!town.equalsIgnoreCase("NA") && !town.equalsIgnoreCase("")){
            persondetails.append(town);

        } else{
            persondetails.append(" ");
        }
        persondetails.append(",");

        if (!county.equalsIgnoreCase("NA") && !county.equalsIgnoreCase("")){
            persondetails.append(county);

        } else{
            persondetails.append(" ");
        }
        persondetails.append(",");

        if (!countrycd.equalsIgnoreCase("NA") && !countrycd.equalsIgnoreCase("")){
            persondetails.append(countrycd);

        } else{
            persondetails.append(" ");
        }
        persondetails.append(",");

        if (!occupation.equalsIgnoreCase("NA") && !occupation.equalsIgnoreCase("")){
            persondetails.append(occupation);

        } else{
            persondetails.append(" ");
        }
        persondetails.append(",");

        if (!nationality.equalsIgnoreCase("NA") && !nationality.equalsIgnoreCase("")){
            persondetails.append(nationality);

        } else{
            persondetails.append(" ");
        }

        rawFields.setPERSONDETAILSSTRING(persondetails);


        return rawFields;

    }

    public StandardisedFields getStandardisedFields(GenericRecord genericRecord) {
        StandardisedFields standardisedFields = new StandardisedFields();

        standardisedFields.setNEWPERSONNUMBERPREFIX((genericRecord.get("persno") != null) ? genericRecord.get("persno").toString() : "NA");
        standardisedFields.setNEWPERSONNUMBERSUFFIX("NA");
        standardisedFields.setOLDPERSONNUMBERPREFIX("NA");
        standardisedFields.setOLDPERSONNUMBERSUFFIX("NA");
        standardisedFields.setPROCESSINGDATE("NA");
        standardisedFields.setFORMATOFSUPPLY("NA");
        standardisedFields.setMIGRATIONFLAG("NA");
        standardisedFields.setTAPEREFERENCENUMBER((genericRecord.get("taperef") != null) ? genericRecord.get("taperef").toString() : "NA");
        standardisedFields.setPERSONTITLE("NA");
        standardisedFields.setPERSONFIRSTNAME("NA");
        standardisedFields.setPERSONSURNAME("NA");
        standardisedFields.setPERSONHONOURS("NA");
        standardisedFields.setPERSONCAREOF("NA");
        standardisedFields.setPERSONPOBOX("NA");
        standardisedFields.setPERSONADDRESSLINE1("NA");
        standardisedFields.setPERSONADDRESSLINE2("NA");
        standardisedFields.setPERSONPOSTTOWN("NA");
        standardisedFields.setPERSONCOUNTY("NA");
        standardisedFields.setPERSONCOUNTRY("NA");
        standardisedFields.setPERSONOCCUPATION("NA");
        standardisedFields.setPERSONNATIONALITY("NA");
        standardisedFields.setPERSONRESIDENTIALCOUNTRY("NA");
        standardisedFields.setPERSONOLDTITLE("NA");
        standardisedFields.setPERSONOLDFIRSTNAME("NA");
        standardisedFields.setPERSONOLDSURNAME("NA");
        standardisedFields.setPERSONOLDHONOURS("NA");
        standardisedFields.setPERSONOLDCAREOF("NA");
        standardisedFields.setPERSONOLDPOBOX("NA");
        standardisedFields.setPERSONOLDADDRESSLINE1("NA");
        standardisedFields.setPERSONOLDADDRESSLINE2("NA");
        standardisedFields.setPERSONOLDPOSTTOWN("NA");
        standardisedFields.setPERSONOLDCOUNTY("NA");
        standardisedFields.setPERSONOLDCOUNTRY("NA");
        standardisedFields.setPERSONOLDNATIONALITY("NA");
        standardisedFields.setPERSONOLDRESIDENTIALCOUNTRY("NA");
        standardisedFields.setOFFICERKEY("NA");

        standardisedFields.setEntity(getentityFields(genericRecord));

        return standardisedFields;

    }


    public com.equifax.fabric.uk.ingestion.officerlegacy.standardisedfields.entity.entityFields getentityFields(GenericRecord genericRecord) {
        com.equifax.fabric.uk.ingestion.officerlegacy.standardisedfields.entity.entityFields entityFields = new com.equifax.fabric.uk.ingestion.officerlegacy.standardisedfields.entity.entityFields();
        entityFields.setCommercial(getcommercialFields(genericRecord));

        return entityFields;

    }
    public com.equifax.fabric.uk.ingestion.officerlegacy.standardisedfields.entity.commercial.commercialFields getcommercialFields(GenericRecord genericRecord) {
        com.equifax.fabric.uk.ingestion.officerlegacy.standardisedfields.entity.commercial.commercialFields commercialFields = new  com.equifax.fabric.uk.ingestion.officerlegacy.standardisedfields.entity.commercial.commercialFields();

        commercialFields.setLegacyIds(getLegacyIdFields(genericRecord));
        commercialFields.setIdentifiers(getIdentifierFields(genericRecord));
        commercialFields.setAddresses(Map.of("NA","NA"));
        commercialFields.setPhones(Map.of("NA","NA"));
        commercialFields.setWebsite(Map.of("NA","NA"));
        commercialFields.setNames(Map.of("NA","NA"));
        commercialFields.setDiscoveryData(getDiscoveryDataFields(genericRecord));

        return commercialFields;
    }


    public com.equifax.fabric.uk.ingestion.officerlegacy.standardisedfields.entity.commercial.legacyIds.legacyIdFields getLegacyIdFields(GenericRecord genericRecord) {
        com.equifax.fabric.uk.ingestion.officerlegacy.standardisedfields.entity.commercial.legacyIds.legacyIdFields legacyIdFields = new com.equifax.fabric.uk.ingestion.officerlegacy.standardisedfields.entity.commercial.legacyIds.legacyIdFields();

        legacyIdFields.setLEGACYIDCOMPANYREGISTEREDNUMBER("NA");
        return legacyIdFields;
    }

    public com.equifax.fabric.uk.ingestion.officerlegacy.standardisedfields.entity.commercial.identifiers.identifierFields getIdentifierFields(GenericRecord genericRecord) {
        com.equifax.fabric.uk.ingestion.officerlegacy.standardisedfields.entity.commercial.identifiers.identifierFields identifierFields = new com.equifax.fabric.uk.ingestion.officerlegacy.standardisedfields.entity.commercial.identifiers.identifierFields();

        identifierFields.setNAMEBUSINESSCOMPANYTYPE("NA");
        identifierFields.setIDENTIFIERBUSINESSVAT("NA");
        identifierFields.setIDENTIFIERBUSINESSEMAIL("NA");
        identifierFields.setIDENTIFIERDISSOLVEDDATE("NA");
        identifierFields.setIDENTIFIERINCORPORATIONDATE("NA");
        identifierFields.setIDENTIFIERUPDATEDATE((genericRecord.get("tapedate") != null) ? genericRecord.get("tapedate").toString() : "NA");
        identifierFields.setIDENTIFIERDATASOURCE("NA");

        return identifierFields;

    }

    public com.equifax.fabric.uk.ingestion.companyregisterlegacy.standardisedfields.entity.commercial.discoveryData.discoveryDataFields getDiscoveryDataFields(GenericRecord genericRecord) {
        com.equifax.fabric.uk.ingestion.companyregisterlegacy.standardisedfields.entity.commercial.discoveryData.discoveryDataFields discoveryDataFields = new com.equifax.fabric.uk.ingestion.companyregisterlegacy.standardisedfields.entity.commercial.discoveryData.discoveryDataFields();
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

}
