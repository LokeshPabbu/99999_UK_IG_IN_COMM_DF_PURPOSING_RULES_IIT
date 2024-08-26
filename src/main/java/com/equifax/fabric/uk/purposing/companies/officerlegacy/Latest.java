/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.equifax.fabric.uk.purposing.companies.officerlegacy;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Latest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Latest\",\"namespace\":\"com.equifax.fabric.uk.purposing.companies.officerlegacy\",\"fields\":[{\"name\":\"PERSON_NUMBER_PREFIX\",\"type\":[\"null\",\"string\"],\"dataClassification\":\"3\"},{\"name\":\"rawfields\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"RawFields\",\"namespace\":\"com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.rawfields\",\"fields\":[{\"name\":\"PERSON_NEW_POSTCODE\",\"type\":[\"null\",\"string\"],\"doc\":\"New Postcode\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"PERSON_DATE_OF_BIRTH\",\"type\":[\"null\",\"string\"],\"doc\":\"Full Date of birth\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"PERSON_PARTIAL_DATE_OF_BIRTH\",\"type\":[\"null\",\"string\"],\"doc\":\"Partial Date of birth\",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null},{\"name\":\"standardised\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"StandardisedFields\",\"namespace\":\"com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.standardisedfields\",\"fields\":[{\"name\":\"PERSON_TITLE\",\"type\":[\"null\",\"string\"],\"doc\":\"Standarized person title\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"PERSON_FIRST_NAME\",\"type\":[\"null\",\"string\"],\"doc\":\"Standarized old person first name\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"PERSON_SURNAME\",\"type\":[\"null\",\"string\"],\"doc\":\"Standardised  person surname\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"PERSON_HONOURS\",\"type\":[\"null\",\"string\"],\"doc\":\"Standardised  person honours\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"PERSON_NATIONALITY\",\"type\":[\"null\",\"string\"],\"doc\":\"Standardised  person address nationality\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"PERSON_OCCUPATION\",\"type\":[\"null\",\"string\"],\"doc\":\"Standardised  person occupation\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"PERSON_OLD_ADDRESS_LINE1\",\"type\":[\"null\",\"string\"],\"doc\":\"Standardised  old person address line1\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"PERSON_OLD_ADDRESS_LINE2\",\"type\":[\"null\",\"string\"],\"doc\":\"Standardised  old person address line2\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"PERSON_POSTTOWN\",\"type\":[\"null\",\"string\"],\"doc\":\"Standardised  person address posttown\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"PERSON_COUNTY\",\"type\":[\"null\",\"string\"],\"doc\":\"Standardised  person address county\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"PERSON_COUNTRY\",\"type\":[\"null\",\"string\"],\"doc\":\"Standardised  person address country\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"}]}],\"default\":null},{\"name\":\"appointments\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Appointments\",\"fields\":[{\"name\":\"PERSON_APPOINTMENT_DATE\",\"type\":[\"null\",\"string\"],\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"PERSON_NEW_APPOINTMENT_TYPE\",\"type\":[\"null\",\"string\"],\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"PERSON_OCCUPATION\",\"type\":[\"null\",\"string\"],\"default\":null,\"dataClassification\":\"5\",\"protect\":\"true\"},{\"name\":\"PERSON_RESIGNATION_DATE\",\"type\":[\"null\",\"string\"],\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"STATUS\",\"type\":[\"null\",\"string\"],\"default\":null,\"dataClassification\":\"3\"}]}}],\"default\":null},{\"name\":\"COMPANIES\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Companies\",\"namespace\":\"com.equifax.fabric.uk.purposing.officercompanygazette.companies\",\"fields\":[{\"name\":\"COMPANY_REGISTERED_NUMBER\",\"type\":[\"null\",\"string\"],\"dataClassification\":\"3\"},{\"name\":\"COMPANY_GAZETTES\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"CompanyGazettes\",\"namespace\":\"com.equifax.fabric.uk.purposing.officercompanygazette.companies.companygazzette\",\"fields\":[{\"name\":\"movementType\",\"type\":[\"null\",\"string\"],\"dataClassification\":\"3\"},{\"name\":\"actionDate\",\"type\":[\"null\",\"string\"],\"dataClassification\":\"3\"}]}}],\"default\":null}]}}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence PERSON_NUMBER_PREFIX;
  @Deprecated public com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.rawfields.RawFields rawfields;
  @Deprecated public com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.standardisedfields.StandardisedFields standardised;
  @Deprecated public java.util.List<com.equifax.fabric.uk.purposing.companies.officerlegacy.Appointments> appointments;
  @Deprecated public java.util.List<com.equifax.fabric.uk.purposing.officercompanygazette.companies.Companies> COMPANIES;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Latest() {}

  /**
   * All-args constructor.
   */
  public Latest(java.lang.CharSequence PERSON_NUMBER_PREFIX, com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.rawfields.RawFields rawfields, com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.standardisedfields.StandardisedFields standardised, java.util.List<com.equifax.fabric.uk.purposing.companies.officerlegacy.Appointments> appointments, java.util.List<com.equifax.fabric.uk.purposing.officercompanygazette.companies.Companies> COMPANIES) {
    this.PERSON_NUMBER_PREFIX = PERSON_NUMBER_PREFIX;
    this.rawfields = rawfields;
    this.standardised = standardised;
    this.appointments = appointments;
    this.COMPANIES = COMPANIES;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return PERSON_NUMBER_PREFIX;
    case 1: return rawfields;
    case 2: return standardised;
    case 3: return appointments;
    case 4: return COMPANIES;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: PERSON_NUMBER_PREFIX = (java.lang.CharSequence)value$; break;
    case 1: rawfields = (com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.rawfields.RawFields)value$; break;
    case 2: standardised = (com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.standardisedfields.StandardisedFields)value$; break;
    case 3: appointments = (java.util.List<com.equifax.fabric.uk.purposing.companies.officerlegacy.Appointments>)value$; break;
    case 4: COMPANIES = (java.util.List<com.equifax.fabric.uk.purposing.officercompanygazette.companies.Companies>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'PERSON_NUMBER_PREFIX' field.
   */
  public java.lang.CharSequence getPERSONNUMBERPREFIX() {
    return PERSON_NUMBER_PREFIX;
  }

  /**
   * Sets the value of the 'PERSON_NUMBER_PREFIX' field.
   * @param value the value to set.
   */
  public void setPERSONNUMBERPREFIX(java.lang.CharSequence value) {
    this.PERSON_NUMBER_PREFIX = value;
  }

  /**
   * Gets the value of the 'rawfields' field.
   */
  public com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.rawfields.RawFields getRawfields() {
    return rawfields;
  }

  /**
   * Sets the value of the 'rawfields' field.
   * @param value the value to set.
   */
  public void setRawfields(com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.rawfields.RawFields value) {
    this.rawfields = value;
  }

  /**
   * Gets the value of the 'standardised' field.
   */
  public com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.standardisedfields.StandardisedFields getStandardised() {
    return standardised;
  }

  /**
   * Sets the value of the 'standardised' field.
   * @param value the value to set.
   */
  public void setStandardised(com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.standardisedfields.StandardisedFields value) {
    this.standardised = value;
  }

  /**
   * Gets the value of the 'appointments' field.
   */
  public java.util.List<com.equifax.fabric.uk.purposing.companies.officerlegacy.Appointments> getAppointments() {
    return appointments;
  }

  /**
   * Sets the value of the 'appointments' field.
   * @param value the value to set.
   */
  public void setAppointments(java.util.List<com.equifax.fabric.uk.purposing.companies.officerlegacy.Appointments> value) {
    this.appointments = value;
  }

  /**
   * Gets the value of the 'COMPANIES' field.
   */
  public java.util.List<com.equifax.fabric.uk.purposing.officercompanygazette.companies.Companies> getCOMPANIES() {
    return COMPANIES;
  }

  /**
   * Sets the value of the 'COMPANIES' field.
   * @param value the value to set.
   */
  public void setCOMPANIES(java.util.List<com.equifax.fabric.uk.purposing.officercompanygazette.companies.Companies> value) {
    this.COMPANIES = value;
  }

  /** Creates a new Latest RecordBuilder */
  public static com.equifax.fabric.uk.purposing.companies.officerlegacy.Latest.Builder newBuilder() {
    return new com.equifax.fabric.uk.purposing.companies.officerlegacy.Latest.Builder();
  }
  
  /** Creates a new Latest RecordBuilder by copying an existing Builder */
  public static com.equifax.fabric.uk.purposing.companies.officerlegacy.Latest.Builder newBuilder(com.equifax.fabric.uk.purposing.companies.officerlegacy.Latest.Builder other) {
    return new com.equifax.fabric.uk.purposing.companies.officerlegacy.Latest.Builder(other);
  }
  
  /** Creates a new Latest RecordBuilder by copying an existing Latest instance */
  public static com.equifax.fabric.uk.purposing.companies.officerlegacy.Latest.Builder newBuilder(com.equifax.fabric.uk.purposing.companies.officerlegacy.Latest other) {
    return new com.equifax.fabric.uk.purposing.companies.officerlegacy.Latest.Builder(other);
  }
  
  /**
   * RecordBuilder for Latest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Latest>
    implements org.apache.avro.data.RecordBuilder<Latest> {

    private java.lang.CharSequence PERSON_NUMBER_PREFIX;
    private com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.rawfields.RawFields rawfields;
    private com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.standardisedfields.StandardisedFields standardised;
    private java.util.List<com.equifax.fabric.uk.purposing.companies.officerlegacy.Appointments> appointments;
    private java.util.List<com.equifax.fabric.uk.purposing.officercompanygazette.companies.Companies> COMPANIES;

    /** Creates a new Builder */
    private Builder() {
      super(com.equifax.fabric.uk.purposing.companies.officerlegacy.Latest.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.equifax.fabric.uk.purposing.companies.officerlegacy.Latest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.PERSON_NUMBER_PREFIX)) {
        this.PERSON_NUMBER_PREFIX = data().deepCopy(fields()[0].schema(), other.PERSON_NUMBER_PREFIX);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.rawfields)) {
        this.rawfields = data().deepCopy(fields()[1].schema(), other.rawfields);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.standardised)) {
        this.standardised = data().deepCopy(fields()[2].schema(), other.standardised);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.appointments)) {
        this.appointments = data().deepCopy(fields()[3].schema(), other.appointments);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.COMPANIES)) {
        this.COMPANIES = data().deepCopy(fields()[4].schema(), other.COMPANIES);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Latest instance */
    private Builder(com.equifax.fabric.uk.purposing.companies.officerlegacy.Latest other) {
            super(com.equifax.fabric.uk.purposing.companies.officerlegacy.Latest.SCHEMA$);
      if (isValidValue(fields()[0], other.PERSON_NUMBER_PREFIX)) {
        this.PERSON_NUMBER_PREFIX = data().deepCopy(fields()[0].schema(), other.PERSON_NUMBER_PREFIX);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.rawfields)) {
        this.rawfields = data().deepCopy(fields()[1].schema(), other.rawfields);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.standardised)) {
        this.standardised = data().deepCopy(fields()[2].schema(), other.standardised);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.appointments)) {
        this.appointments = data().deepCopy(fields()[3].schema(), other.appointments);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.COMPANIES)) {
        this.COMPANIES = data().deepCopy(fields()[4].schema(), other.COMPANIES);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'PERSON_NUMBER_PREFIX' field */
    public java.lang.CharSequence getPERSONNUMBERPREFIX() {
      return PERSON_NUMBER_PREFIX;
    }
    
    /** Sets the value of the 'PERSON_NUMBER_PREFIX' field */
    public com.equifax.fabric.uk.purposing.companies.officerlegacy.Latest.Builder setPERSONNUMBERPREFIX(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.PERSON_NUMBER_PREFIX = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'PERSON_NUMBER_PREFIX' field has been set */
    public boolean hasPERSONNUMBERPREFIX() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'PERSON_NUMBER_PREFIX' field */
    public com.equifax.fabric.uk.purposing.companies.officerlegacy.Latest.Builder clearPERSONNUMBERPREFIX() {
      PERSON_NUMBER_PREFIX = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'rawfields' field */
    public com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.rawfields.RawFields getRawfields() {
      return rawfields;
    }
    
    /** Sets the value of the 'rawfields' field */
    public com.equifax.fabric.uk.purposing.companies.officerlegacy.Latest.Builder setRawfields(com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.rawfields.RawFields value) {
      validate(fields()[1], value);
      this.rawfields = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'rawfields' field has been set */
    public boolean hasRawfields() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'rawfields' field */
    public com.equifax.fabric.uk.purposing.companies.officerlegacy.Latest.Builder clearRawfields() {
      rawfields = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'standardised' field */
    public com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.standardisedfields.StandardisedFields getStandardised() {
      return standardised;
    }
    
    /** Sets the value of the 'standardised' field */
    public com.equifax.fabric.uk.purposing.companies.officerlegacy.Latest.Builder setStandardised(com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.standardisedfields.StandardisedFields value) {
      validate(fields()[2], value);
      this.standardised = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'standardised' field has been set */
    public boolean hasStandardised() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'standardised' field */
    public com.equifax.fabric.uk.purposing.companies.officerlegacy.Latest.Builder clearStandardised() {
      standardised = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'appointments' field */
    public java.util.List<com.equifax.fabric.uk.purposing.companies.officerlegacy.Appointments> getAppointments() {
      return appointments;
    }
    
    /** Sets the value of the 'appointments' field */
    public com.equifax.fabric.uk.purposing.companies.officerlegacy.Latest.Builder setAppointments(java.util.List<com.equifax.fabric.uk.purposing.companies.officerlegacy.Appointments> value) {
      validate(fields()[3], value);
      this.appointments = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'appointments' field has been set */
    public boolean hasAppointments() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'appointments' field */
    public com.equifax.fabric.uk.purposing.companies.officerlegacy.Latest.Builder clearAppointments() {
      appointments = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'COMPANIES' field */
    public java.util.List<com.equifax.fabric.uk.purposing.officercompanygazette.companies.Companies> getCOMPANIES() {
      return COMPANIES;
    }
    
    /** Sets the value of the 'COMPANIES' field */
    public com.equifax.fabric.uk.purposing.companies.officerlegacy.Latest.Builder setCOMPANIES(java.util.List<com.equifax.fabric.uk.purposing.officercompanygazette.companies.Companies> value) {
      validate(fields()[4], value);
      this.COMPANIES = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'COMPANIES' field has been set */
    public boolean hasCOMPANIES() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'COMPANIES' field */
    public com.equifax.fabric.uk.purposing.companies.officerlegacy.Latest.Builder clearCOMPANIES() {
      COMPANIES = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public Latest build() {
      try {
        Latest record = new Latest();
        record.PERSON_NUMBER_PREFIX = fieldSetFlags()[0] ? this.PERSON_NUMBER_PREFIX : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.rawfields = fieldSetFlags()[1] ? this.rawfields : (com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.rawfields.RawFields) defaultValue(fields()[1]);
        record.standardised = fieldSetFlags()[2] ? this.standardised : (com.equifax.fabric.uk.purposing.companies.officerlegacy.latest.standardisedfields.StandardisedFields) defaultValue(fields()[2]);
        record.appointments = fieldSetFlags()[3] ? this.appointments : (java.util.List<com.equifax.fabric.uk.purposing.companies.officerlegacy.Appointments>) defaultValue(fields()[3]);
        record.COMPANIES = fieldSetFlags()[4] ? this.COMPANIES : (java.util.List<com.equifax.fabric.uk.purposing.officercompanygazette.companies.Companies>) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
