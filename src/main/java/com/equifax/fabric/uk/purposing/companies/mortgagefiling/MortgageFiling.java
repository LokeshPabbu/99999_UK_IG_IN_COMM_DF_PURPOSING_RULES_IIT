/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.equifax.fabric.uk.purposing.companies.mortgagefiling;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class MortgageFiling extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MortgageFiling\",\"namespace\":\"com.equifax.fabric.uk.purposing.companies.mortgagefiling\",\"fields\":[{\"name\":\"latest\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Latest\",\"fields\":[{\"name\":\"purposingHeader\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"PurposingHeader\",\"namespace\":\"com.equifax.fabric.uk.purposing.wizzards.header\",\"fields\":[{\"name\":\"dateReported\",\"type\":[\"null\",\"long\"],\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"recordUuid\",\"type\":[\"null\",\"string\"],\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"matchKey\",\"type\":[\"null\",\"string\"],\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"additionalInfo\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}],\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null},{\"name\":\"rawfields\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"RawFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields\",\"fields\":[{\"name\":\"data\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Data\",\"namespace\":\"com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data\",\"fields\":[{\"name\":\"acquired_on\",\"type\":[\"null\",\"string\"],\"doc\":\"The company charges resource data. The date the property or undertaking was acquired on\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"assests_ceased_released\",\"type\":[\"null\",\"string\"],\"doc\":\"Cease/release information about the charge. For enumeration descriptions see assets-ceased-released section in the enumeration mappings  Possible values are:  property-ceased-to-belong  part-property-release-and-ceased-to-belong  part-property-released  part-property-ceased-to-belong  whole-property-released  multiple-filings  whole-property-released-and-ceased-to-belong\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"charge_code\",\"type\":[\"null\",\"string\"],\"doc\":\"The charge code is a replacement of the mortgage description\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"charge_number\",\"type\":[\"null\",\"string\"],\"doc\":\"The charge number is used to reference an individual charge\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"classification\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Classification\",\"namespace\":\"com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.classification\",\"fields\":[{\"name\":\"description\",\"type\":[\"null\",\"string\"],\"doc\":\"Details of the charge classification\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"type\",\"type\":[\"null\",\"string\"],\"doc\":\"The type of charge classication. For enumeration descriptions see classificationDesc section in the enumeration mappings  Possible values are:  charge-description  nature-of-charge\",\"default\":null,\"dataClassification\":\"3\"}]}],\"doc\":\"Classification information\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"covering_instrument_date\",\"type\":[\"null\",\"string\"],\"doc\":\"The date by which the series of debentures were created\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"created_on\",\"type\":[\"null\",\"string\"],\"doc\":\"The date the charge was created\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"delivered_on\",\"type\":[\"null\",\"string\"],\"doc\":\"The date the charge was submitted to Companies House\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"etag\",\"type\":[\"null\",\"string\"],\"doc\":\"etag\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"doc\":\"The id of the charge\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"insolvency_cases\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"InsolvencyCases\",\"namespace\":\"com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.insolvencycases\",\"fields\":[{\"name\":\"case_number\",\"type\":[\"null\",\"string\"],\"doc\":\"The number of this insolvency case\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"links\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Links\",\"namespace\":\"com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.insolvencycases.links\",\"fields\":[{\"name\":\"case\",\"type\":[\"null\",\"string\"],\"doc\":\"Link to the insolvency case data\",\"default\":null,\"dataClassification\":\"3\"}]}],\"doc\":\"The resources related to this insolvency case\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"transaction_id\",\"type\":[\"null\",\"string\"],\"doc\":\"The id of the insolvency filing\",\"default\":null,\"dataClassification\":\"3\"}]}}],\"doc\":\"Transactions that have been filed for the charge.\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"links\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Links\",\"namespace\":\"com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.links\",\"fields\":[{\"name\":\"self\",\"type\":[\"null\",\"string\"],\"doc\":\"Link to the this charge data\",\"default\":null,\"dataClassification\":\"3\"}]}],\"doc\":\"The resources related to this charge\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"more_than_four_persons_entitled\",\"type\":[\"null\",\"string\"],\"doc\":\"Charge has more than four person entitled\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"particulars\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Particulars\",\"namespace\":\"com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.particulars\",\"fields\":[{\"name\":\"chargor_acting_as_bare_trustee\",\"type\":[\"null\",\"string\"],\"doc\":\"The chargor is acting as a bare trustee for the property\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"contains_fixed_charge\",\"type\":[\"null\",\"string\"],\"doc\":\"The charge contains a fixed charge\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"contains_floating_charge\",\"type\":[\"null\",\"string\"],\"doc\":\"The charge contains a floating charge\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"contains_negative_pledge\",\"type\":[\"null\",\"string\"],\"doc\":\"The charge contains a negative pledge\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"],\"doc\":\"Details of charge particulars\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"floating_charge_covers_all\",\"type\":[\"null\",\"string\"],\"doc\":\"The floating charge covers all the property or undertaking or the company\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"type\",\"type\":[\"null\",\"string\"],\"doc\":\"The type of charge particulars. For enumeration descriptions see particular-description section in the enumeration mappings Possible values are:short-particulars charged-property-description charged-property-or-undertaking-description  brief-description\",\"default\":null,\"dataClassification\":\"3\"}]}],\"doc\":\"Details of charge or undertaking\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"persons_entitled\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"PersonsEntitled\",\"namespace\":\"com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.personsentitled\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"doc\":\"The name of the person entitled.\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"}]}}],\"doc\":\"People that are entitled to the charge\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"resolved_on\",\"type\":[\"null\",\"string\"],\"doc\":\"The date the issue was resolved on\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"satisfied_on\",\"type\":[\"null\",\"string\"],\"doc\":\"The date the charge was satisfied\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"scottish_alterations\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ScottishAlterations\",\"namespace\":\"com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.scottishalterations\",\"fields\":[{\"name\":\"description\",\"type\":[\"null\",\"string\"],\"doc\":\"Alteration descriptions for Scottish companies\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"has_alterations_to_order\",\"type\":[\"null\",\"string\"],\"doc\":\"The charge has alterations to order\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"has_alterations_to_prohibitions\",\"type\":[\"null\",\"string\"],\"doc\":\"The charge has alterations to prohibitions\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"has_alterations_to_provisions\",\"type\":[\"null\",\"string\"],\"doc\":\"The charge has provisions restricting the creation of further charges\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"type\",\"type\":[\"null\",\"string\"],\"doc\":\"Type of alteration details for Scottish companies\",\"default\":null,\"dataClassification\":\"3\"}]}],\"doc\":\"Information about alterations for Scottish companies\",\"default\":null,\"dataClassifica","tion\":\"3\"},{\"name\":\"secured_details\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"SecuredDetails\",\"namespace\":\"com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.secureddetails\",\"fields\":[{\"name\":\"description\",\"type\":[\"null\",\"string\"],\"doc\":\"Details of the amount or obligation secured by the charge\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"type\",\"type\":[\"null\",\"string\"],\"doc\":\"The type of secured details. For enumeration descriptions see secured-details-description section in the enumeration mappings. Possible values are:amount-secured obligations-secured\",\"default\":null,\"dataClassification\":\"3\"}]}],\"doc\":\"Information about what is secured against this charge\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"status\",\"type\":[\"null\",\"string\"],\"doc\":\"The status of the charge. For enumeration descriptions see status section in the enumeration mappings Possible values are: outstanding fully-satisfied part-satisfied satisfied\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"transactions\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Transactions\",\"namespace\":\"com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.transactions\",\"fields\":[{\"name\":\"delivered_on\",\"type\":[\"null\",\"string\"],\"doc\":\"The date the filing was submitted to Companies House\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"filing_type\",\"type\":[\"null\",\"string\"],\"doc\":\"Filing type which created, updated or satisfied the charge\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"insolvency_case_number\",\"type\":[\"null\",\"string\"],\"doc\":\"The insolvency case related to this filing\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"links\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Links\",\"namespace\":\"com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.transactionid.links\",\"fields\":[{\"name\":\"filing\",\"type\":[\"null\",\"string\"],\"doc\":\"Link to the charge filing data\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"insolvency_case\",\"type\":[\"null\",\"string\"],\"doc\":\"Link to the insolvency case related to this filing\",\"default\":null,\"dataClassification\":\"3\"}]}],\"doc\":\"The resources related to this filing\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"transaction_id\",\"type\":[\"null\",\"string\"],\"doc\":\"The id of the filing\",\"default\":null,\"dataClassification\":\"3\"}]}}],\"doc\":\"Transactions that have been filed for the charge.\",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null},{\"name\":\"event\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Event\",\"namespace\":\"com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.event\",\"fields\":[{\"name\":\"fields_changed\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"Array of fields that have been changed by this event. Nested fields are referenced by dot notation e.g. links.document_metadata\",\"default\":[],\"dataClassification\":\"3\"},{\"name\":\"published_at\",\"type\":[\"null\",\"string\"],\"doc\":\"The date and time the data notification was raised\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"timepoint\",\"type\":[\"null\",\"string\"],\"doc\":\"The point-in-time identifier for this stream document. Use to re-establish a connection to the stream at this point.\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"type\",\"type\":[\"null\",\"string\"],\"doc\":\"The type of event denoted by this stream document. Possible values are: changed deleted\",\"default\":null,\"dataClassification\":\"3\"}]}],\"doc\":\"Link to the related resource\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"resource_id\",\"type\":[\"null\",\"string\"],\"doc\":\"The ID of the resource.\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"resource_kind\",\"type\":[\"null\",\"string\"],\"doc\":\"The type of resource contained within the stream document. Possible values are: company-profile#company-profile filing-history#filing-history\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"resource_uri\",\"type\":[\"null\",\"string\"],\"doc\":\"The URI of the resource.\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"FILE_NAME\",\"type\":[\"null\",\"string\"],\"doc\":\"Supplied file name\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"etag\",\"type\":[\"null\",\"string\"],\"doc\":\"The ETag of the resource.\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"part_satisfied_count\",\"type\":[\"null\",\"string\"],\"doc\":\"Number of satisfied charges\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"satisfied_count\",\"type\":[\"null\",\"string\"],\"doc\":\"Number of satisfied charges\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"total_count\",\"type\":[\"null\",\"string\"],\"doc\":\"Total number of charges returned by the API (filtering applies).\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"unfiletered_count\",\"type\":[\"null\",\"string\"],\"doc\":\"Number of satisfied charges\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"companyRegisteredNumber\",\"type\":[\"null\",\"string\"],\"doc\":\"Company Number\",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null},{\"name\":\"standardised\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"StandardisedFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.mortgagefiling.standardisedfields\",\"fields\":[{\"name\":\"stdCompanyRegisteredNumber_DER\",\"type\":[\"null\",\"string\"],\"doc\":\"Standarized Company Number\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"stdProcessingDate\",\"type\":[\"null\",\"string\"],\"doc\":\"Date on which data loaded on Data Fabric\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"stdFormatOfSupply\",\"type\":[\"null\",\"string\"],\"doc\":\"Indicates format of supplied file\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"stdMigrationFlag\",\"type\":[\"null\",\"string\"],\"doc\":\"Indicates whether data is from live or Historical feed, H Indicates historical and <blank> Indicates live\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"entity\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"entityFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.mortgagefiling.standardisedfields.entity\",\"fields\":[{\"name\":\"commercial\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"commercialFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.mortgagefiling.standardisedfields.entity.commercial\",\"fields\":[{\"name\":\"legacyIds\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"legacyIdFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.mortgagefiling.standardisedfields.entity.commercial.legacyids\",\"fields\":[{\"name\":\"LEGACY_ID_COMPANY_REGISTERED_NUMBER\",\"type\":[\"null\",\"string\"],\"doc\":\"Supplied Company Number\",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null},{\"name\":\"identifiers\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"identifierFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.mortgagefiling.standardisedfields.entity.commercial.identifiers\",\"fields\":[{\"name\":\"NAME_BUSINESS_COMPANY_TYPE\",\"type\":[\"null\",\"string\"],\"doc\":\"Type of company - L for Limited\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_BUSINESS_VAT\",\"type\":[\"null\",\"string\"],\"doc\":\"VAT number field\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_BUSINESS_EMAIL\",\"type\":[\"null\",\"string\"],\"doc\":\"EMAIL ID field\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_DISSOLVED_DATE\",\"type\":[\"null\",\"string\"],\"doc\":\"Dissolution Date field\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_INCORPORATION_DATE\",\"type\":[\"null\",\"string\"],\"doc\":\"Date of incorporation in CCYYMMDD format\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_UPDATE_DATE\",\"type\":[\"null\",\"string\"],\"doc\":\"This is load date and will be a system date \",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_DATA_SOURCE\",\"type\":[\"null\",\"string\"],\"doc\":\"Indicates source of data\",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null},{\"name\":\"website\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"Supplied Websites\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"phones\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"Supplied Phone number\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"names\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"Standardised Company Names as per Keying & Linking inputs\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"addresses\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"Standardised postcode as per Keying & Linking inputs\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"discoveryData\",\"type\":[\"null\",{\"type\":\"r","ecord\",\"name\":\"discoveryDataFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.mortgagefiling.standardisedfields.entity.commercial.discoverydata\",\"fields\":[{\"name\":\"DISCOVERY_ACCOUNT_NUMBER\",\"type\":[\"null\",\"string\"],\"doc\":\"Supplied Account Number for INSIGHT_ACCOUNT\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_CLIENT_NUMBER\",\"type\":[\"null\",\"string\"],\"doc\":\"Supplied Client Number for INSIGHT_ACCOUNT and CCDS_ACCOUNT asset\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_FACILITY_NUMBER\",\"type\":[\"null\",\"string\"],\"doc\":\"Supplied Facility Number for CCDS_ACCOUNT\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_DEFENDENT_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"Defendent ID for COURT_JUDGMENT\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_DRC_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"DRC_ID for NONLIMITED_REGISTER\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_URN\",\"type\":[\"null\",\"string\"],\"doc\":\"Unique reference number of COMPANY_CIFAS\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_CASE_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"Case ID of COMPANY_CIFAS\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_CLN_BUSINESS_NAME\",\"type\":[\"null\",\"string\"],\"doc\":\"Cleansed business name \",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null}]}],\"default\":null}]}],\"default\":null}]}],\"default\":null}]}}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.List<com.equifax.fabric.uk.purposing.companies.mortgagefiling.Latest> latest;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public MortgageFiling() {}

  /**
   * All-args constructor.
   */
  public MortgageFiling(java.util.List<com.equifax.fabric.uk.purposing.companies.mortgagefiling.Latest> latest) {
    this.latest = latest;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return latest;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: latest = (java.util.List<com.equifax.fabric.uk.purposing.companies.mortgagefiling.Latest>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'latest' field.
   */
  public java.util.List<com.equifax.fabric.uk.purposing.companies.mortgagefiling.Latest> getLatest() {
    return latest;
  }

  /**
   * Sets the value of the 'latest' field.
   * @param value the value to set.
   */
  public void setLatest(java.util.List<com.equifax.fabric.uk.purposing.companies.mortgagefiling.Latest> value) {
    this.latest = value;
  }

  /** Creates a new MortgageFiling RecordBuilder */
  public static com.equifax.fabric.uk.purposing.companies.mortgagefiling.MortgageFiling.Builder newBuilder() {
    return new com.equifax.fabric.uk.purposing.companies.mortgagefiling.MortgageFiling.Builder();
  }
  
  /** Creates a new MortgageFiling RecordBuilder by copying an existing Builder */
  public static com.equifax.fabric.uk.purposing.companies.mortgagefiling.MortgageFiling.Builder newBuilder(com.equifax.fabric.uk.purposing.companies.mortgagefiling.MortgageFiling.Builder other) {
    return new com.equifax.fabric.uk.purposing.companies.mortgagefiling.MortgageFiling.Builder(other);
  }
  
  /** Creates a new MortgageFiling RecordBuilder by copying an existing MortgageFiling instance */
  public static com.equifax.fabric.uk.purposing.companies.mortgagefiling.MortgageFiling.Builder newBuilder(com.equifax.fabric.uk.purposing.companies.mortgagefiling.MortgageFiling other) {
    return new com.equifax.fabric.uk.purposing.companies.mortgagefiling.MortgageFiling.Builder(other);
  }
  
  /**
   * RecordBuilder for MortgageFiling instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MortgageFiling>
    implements org.apache.avro.data.RecordBuilder<MortgageFiling> {

    private java.util.List<com.equifax.fabric.uk.purposing.companies.mortgagefiling.Latest> latest;

    /** Creates a new Builder */
    private Builder() {
      super(com.equifax.fabric.uk.purposing.companies.mortgagefiling.MortgageFiling.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.equifax.fabric.uk.purposing.companies.mortgagefiling.MortgageFiling.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.latest)) {
        this.latest = data().deepCopy(fields()[0].schema(), other.latest);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing MortgageFiling instance */
    private Builder(com.equifax.fabric.uk.purposing.companies.mortgagefiling.MortgageFiling other) {
            super(com.equifax.fabric.uk.purposing.companies.mortgagefiling.MortgageFiling.SCHEMA$);
      if (isValidValue(fields()[0], other.latest)) {
        this.latest = data().deepCopy(fields()[0].schema(), other.latest);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'latest' field */
    public java.util.List<com.equifax.fabric.uk.purposing.companies.mortgagefiling.Latest> getLatest() {
      return latest;
    }
    
    /** Sets the value of the 'latest' field */
    public com.equifax.fabric.uk.purposing.companies.mortgagefiling.MortgageFiling.Builder setLatest(java.util.List<com.equifax.fabric.uk.purposing.companies.mortgagefiling.Latest> value) {
      validate(fields()[0], value);
      this.latest = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'latest' field has been set */
    public boolean hasLatest() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'latest' field */
    public com.equifax.fabric.uk.purposing.companies.mortgagefiling.MortgageFiling.Builder clearLatest() {
      latest = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public MortgageFiling build() {
      try {
        MortgageFiling record = new MortgageFiling();
        record.latest = fieldSetFlags()[0] ? this.latest : (java.util.List<com.equifax.fabric.uk.purposing.companies.mortgagefiling.Latest>) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
