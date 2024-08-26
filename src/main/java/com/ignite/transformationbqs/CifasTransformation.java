package com.ignite.transformationbqs;

import com.equifax.fabric.uk.ingestion.companycifas.rawfields.RawFields;
import com.equifax.fabric.uk.ingestion.companycifas.rawfields.cifascase.*;
import com.equifax.fabric.uk.ingestion.companycifas.standardisedfields.StandardisedFields;
import com.equifax.fabric.uk.ingestion.companycifas.standardisedfields.entity.commercial.commercialFields;
import com.equifax.fabric.uk.ingestion.companycifas.standardisedfields.entity.commercial.discoverydata.discoveryDataFields;
import com.equifax.fabric.uk.ingestion.companycifas.standardisedfields.entity.commercial.identifiers.identifierFields;
import com.equifax.fabric.uk.ingestion.companycifas.standardisedfields.entity.commercial.legacyids.legacyIdFields;
import com.equifax.fabric.uk.ingestion.companycifas.standardisedfields.entity.entityFields;
import com.equifax.fabric.uk.purposing.companies.PURP_COMMERCIAL_CREDIT_COMPANIES_VIEW;
import com.equifax.fabric.uk.purposing.companies.companycifas.CompanyCifas;
import com.equifax.fabric.uk.purposing.companies.companycifas.Latest;
import com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader;
import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.transforms.DoFn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CifasTransformation extends DoFn<GenericRecord, GenericRecord> implements Serializable {
    private static final Logger LOGGER = LoggerFactory.getLogger(CifasTransformation.class);
    @ProcessElement
    public void processElement(@Element GenericRecord genericRecord, ProcessContext processContext) {
        LOGGER.error("genericRecord :::: " + genericRecord);
        PURP_COMMERCIAL_CREDIT_COMPANIES_VIEW companiesView = new PURP_COMMERCIAL_CREDIT_COMPANIES_VIEW();
        companiesView.setPurposingHeader(TransformationBQ.getPurposingHeader(genericRecord));
        CompanyCifas cifas = new CompanyCifas();
        List<Latest> latest = new ArrayList<>();
        latest.add(getLatest(genericRecord));
        cifas.setLatest(latest);
        companiesView.setCOMPANYCIFAS(cifas);
        processContext.output(companiesView);
    }

    public Latest getLatest(GenericRecord genericRecord) {
        Latest latest = new Latest();

        latest.setPurposingHeader(getPurposingHeader(genericRecord));
        latest.setRawfields(getRawFields(genericRecord));
        latest.setStandardised(getStandardisedFields(genericRecord));

        return latest;
    }

    public PurposingHeader getPurposingHeader(GenericRecord genericRecord)
    {
        PurposingHeader purposingHeader = new PurposingHeader();

        Map<CharSequence, CharSequence> value = new HashMap<>();
        value.put("NA","NA");
        purposingHeader.setAdditionalInfo(Map.of("NA","NA"));
        purposingHeader.setDateReported(0L);
        purposingHeader.setMatchKey("NA");
        purposingHeader.setRecordUuid("NA");

        return purposingHeader;
    }
    /*public List<additionalInfo> getAdditionalInfo(GenericRecord genericRecord) {
        additionalInfo additionalInfo = new additionalInfo();
        additionalInfo.setKey("NA");
        additionalInfo.setValue("NA");
        List<additionalInfo> list = new ArrayList<>();
        list.add(additionalInfo);
        return list;
    }*/
    public RawFields getRawFields(GenericRecord genericRecord) {
        RawFields rawFields = new RawFields();

        rawFields.setFILENAME("NA");
        rawFields.setDateLoaded((genericRecord.get("dateloaded") != null) ? genericRecord.get("dateloaded").toString() : "NA");
        rawFields.setJobNumber("NA");
        rawFields.setLineNumber("NA");
        rawFields.setMatchedCompanyName((genericRecord.get("companyname") != null) ? genericRecord.get("companyname").toString() : "NA");
        rawFields.setMatchedCompanyNumber((genericRecord.get("company") != null) ? genericRecord.get("company").toString() : "NA");
        rawFields.setOperatorId((genericRecord.get("operatorid") != null) ? genericRecord.get("operatorid").toString() : "NA");
        rawFields.setRunDate("NA");
        rawFields.setRunNo("NA");

        rawFields.setCIFAScase(getCifasCase(genericRecord));

        return rawFields;
    }

    public StandardisedFields getStandardisedFields(GenericRecord genericRecord) {
        StandardisedFields standardisedFields = new StandardisedFields();
        standardisedFields.setBUSINESSMOBILENUMBER("NA");
        standardisedFields.setBUSINESSNAME("NA");
        standardisedFields.setBUSINESSTELEPHONENUMBER("NA");
        standardisedFields.setPROCESSINGDATE("NA");
        standardisedFields.setCOMPANYREGISTEREDNUMBER("NA");
        standardisedFields.setFORMATOFSUPPLY("NA");
        standardisedFields.setMIGRATIONFLAG("NA");

        standardisedFields.setEntity(getEntityFields(genericRecord));

        return standardisedFields;
    }

    public CifasCase getCifasCase(GenericRecord genericRecord) {
        CifasCase cifasCase = new CifasCase();
        cifasCase.setCaseId(genericRecord.get("caseid").toString());
        cifasCase.setTransactionType("NA");
        cifasCase.setTransactionSequence("NA");

        cifasCase.setCaseData(getCaseData(genericRecord));

        return cifasCase;
    }

    public CaseDataCIFAScaseFraudDataTransferResponse getCaseData(GenericRecord genericRecord) {
        CaseDataCIFAScaseFraudDataTransferResponse caseData = new CaseDataCIFAScaseFraudDataTransferResponse();
        caseData.setOwningMemberNumber((genericRecord.get("owningmembernumber") != null) ? genericRecord.get("owningmembernumber").toString() : "NA");
        caseData.setManagingMemberNumber((genericRecord.get("cifasidnumber") != null) ? genericRecord.get("cifasidnumber").toString() : "NA");
        caseData.setMembersSearchReference((genericRecord.get("membersearchreference") != null) ? genericRecord.get("membersearchreference").toString() : "NA");
        caseData.setCaseType((genericRecord.get("casetype") != null) ? genericRecord.get("casetype").toString() : "NA");
        caseData.setProduct((genericRecord.get("product") != null) ? genericRecord.get("product").toString() : "NA");
        caseData.setFacility((genericRecord.get("facility") != null) ? genericRecord.get("facility").toString() : "NA");
        caseData.setSupplyDate((genericRecord.get("frauddate") != null) ? genericRecord.get("frauddate").toString() : "NA");
        caseData.setExpiryDate((genericRecord.get("archivedate") != null) ? genericRecord.get("archivedate").toString() : "NA");
        caseData.setDestructionDate((genericRecord.get("destructiondate") != null) ? genericRecord.get("destructiondate").toString() : "NA");
        caseData.setApplicationDate((genericRecord.get("applicationdate") != null) ? genericRecord.get("applicationdate").toString() : "NA");
        caseData.setFilingReason(List.of((genericRecord.get("filingreason") != null) ? genericRecord.get("filingreason").toString() : "NA"));
        caseData.setAvailableForMatching((genericRecord.get("availableformatching") != null) ? genericRecord.get("availableformatching").toString() : "NA");

        caseData.setSubjectData(getSubjectData(genericRecord));

        return caseData;
    }

    public SubjectDataCaseDataCIFAScaseFraudDataTransferResponse getSubjectData(GenericRecord genericRecord) {
        SubjectDataCaseDataCIFAScaseFraudDataTransferResponse subjectData = new SubjectDataCaseDataCIFAScaseFraudDataTransferResponse();

        subjectData.setCompany(getCompany(genericRecord));
        subjectData.setHomeTelephone((genericRecord.get("hometelephone") != null) ? genericRecord.get("hometelephone").toString() : "NA");
        subjectData.setMobileTelephone((genericRecord.get("mobiletelephone") != null) ? genericRecord.get("mobiletelephone").toString() : "NA");
        subjectData.setEmailAddress((genericRecord.get("email") != null) ? genericRecord.get("email").toString() : "NA");
        subjectData.setSubjectRole((genericRecord.get("subjectrole") != null) ? genericRecord.get("subjectrole").toString() : "NA");
        subjectData.setSubjectRoleQualifier((genericRecord.get("subjectrolequalifier") != null) ? genericRecord.get("subjectrolequalifier").toString() : "NA");
        subjectData.setShowOnConsumerFiles((genericRecord.get("showonconsumerfiles") != null) ? genericRecord.get("showonconsumerfiles").toString() : "NA");
        subjectData.setCIFAScategory((genericRecord.get("fraudcategory") != null) ? genericRecord.get("fraudcategory").toString() : "NA");

        subjectData.setAddressData(getAddressData(genericRecord));
        return subjectData;
    }

    public AddressDataSubjectDataCaseDataCIFAScaseFraudDataTransferResponse getAddressData(GenericRecord genericRecord) {
        AddressDataSubjectDataCaseDataCIFAScaseFraudDataTransferResponse addressData = new AddressDataSubjectDataCaseDataCIFAScaseFraudDataTransferResponse();
        addressData.setAddressType((genericRecord.get("addresstype") != null) ? genericRecord.get("addresstype").toString() : "NA");

        addressData.setTimeAtAddress(getTimeAtAddress(genericRecord));
        addressData.setAddress(getAddress(genericRecord));

        addressData.setURN((genericRecord.get("casenumber") != null) ? genericRecord.get("casenumber").toString() : "NA");

        return addressData;
    }


    public AddressAddressDataSubjectDataCaseDataCIFAScaseFraudDataTransferResponse getAddress(GenericRecord genericRecord) {

        AddressAddressDataSubjectDataCaseDataCIFAScaseFraudDataTransferResponse address = new AddressAddressDataSubjectDataCaseDataCIFAScaseFraudDataTransferResponse();

        address.setFlatOrUnit((genericRecord.get("origaddrline1") != null) ? genericRecord.get("origaddrline1").toString() : "NA");
        address.setHouseName("NA");
        address.setHouseNumber("NA");
        address.setStreet((genericRecord.get("origaddrline2") != null) ? genericRecord.get("origaddrline2").toString() : "NA");
        address.setDistrict((genericRecord.get("origaddrline3") != null) ? genericRecord.get("origaddrline3").toString() : "NA");
        address.setTown((genericRecord.get("origaddrline4") != null) ? genericRecord.get("origaddrline4").toString() : "NA");
        address.setCounty((genericRecord.get("origaddrline5") != null) ? genericRecord.get("origaddrline5").toString() : "NA");
        address.setPostcode((genericRecord.get("origpostcode") != null) ? genericRecord.get("origpostcode").toString() : "NA");

        return address;

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

    public discoveryDataFields getDiscoveryDataFields(GenericRecord genericRecord) {

        discoveryDataFields discoveryDataFields = new discoveryDataFields();

        discoveryDataFields.setDISCOVERYACCOUNTNUMBER("NA");
        discoveryDataFields.setDISCOVERYCLIENTNUMBER("NA");
        discoveryDataFields.setDISCOVERYFACILITYNUMBER("NA");
        discoveryDataFields.setDISCOVERYDEFENDENTID("NA");
        discoveryDataFields.setDISCOVERYDRCID("NA");
        discoveryDataFields.setDISCOVERYURN("NA");
        discoveryDataFields.setDISCOVERYCASEID("NA");
        discoveryDataFields.setDISCOVERYCLNBUSINESSNAME("NA");

        return discoveryDataFields;

    }

    public legacyIdFields getLegacyIdFields(GenericRecord genericRecord) {

        legacyIdFields legacyIdFields = new legacyIdFields();
        legacyIdFields.setLEGACYIDCOMPANYREGISTEREDNUMBER("NA");
        return legacyIdFields;
    }

    public commercialFields getCommercialFields(GenericRecord genericRecord) {
        commercialFields commercialFields = new commercialFields();

        commercialFields.setLegacyIds(getLegacyIdFields(genericRecord));

        commercialFields.setIdentifiers(getIdentifierFields(genericRecord));
        commercialFields.setWebsite(Map.of("NA", "NA"));
        commercialFields.setPhones(Map.of("NA", "NA"));
        commercialFields.setNames(Map.of("NA", "NA"));
        commercialFields.setAddresses(Map.of("NA", "NA"));

        commercialFields.setDiscoveryData(getDiscoveryDataFields(genericRecord));

        return commercialFields;
    }

    public TimeAtAddressAddressDataSubjectDataCaseDataCIFAScaseFraudDataTransferResponse getTimeAtAddress(GenericRecord genericRecord) {
        TimeAtAddressAddressDataSubjectDataCaseDataCIFAScaseFraudDataTransferResponse timeAtAddress = new TimeAtAddressAddressDataSubjectDataCaseDataCIFAScaseFraudDataTransferResponse();
        timeAtAddress.setFormat((genericRecord.get("timeataddress") != null) ? genericRecord.get("timeataddress").toString() : "NA");
        timeAtAddress.setYearPart("NA");
        timeAtAddress.setMonthPart("NA");

        return timeAtAddress;
    }


    public CompanySubjectDataCaseDataCIFAScaseFraudDataTransferResponse getCompany(GenericRecord genericRecord) {
        CompanySubjectDataCaseDataCIFAScaseFraudDataTransferResponse company = new CompanySubjectDataCaseDataCIFAScaseFraudDataTransferResponse();
        company.setCompanyName((genericRecord.get("suppliedcompanyname") != null) ? genericRecord.get("suppliedcompanyname").toString() : "NA");
        company.setCompanyNumber((genericRecord.get("suppliedcompanynumber") != null) ? genericRecord.get("suppliedcompanynumber").toString() : "NA");
        return company;

    }


    public entityFields getEntityFields(GenericRecord genericRecord) {
        entityFields entityFields = new entityFields();

        entityFields.setCommercial(getCommercialFields(genericRecord));

        return entityFields;

    }



}
