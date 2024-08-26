/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class identifierFields extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"identifierFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers\",\"fields\":[{\"name\":\"NAME_BUSINESS_COMPANY_TYPE\",\"type\":[\"null\",\"string\"],\"doc\":\"Type of company - L for Limited\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_BUSINESS_VAT\",\"type\":[\"null\",\"string\"],\"doc\":\"VAT number field\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_BUSINESS_EMAIL\",\"type\":[\"null\",\"string\"],\"doc\":\"EMAIL ID field\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_DISSOLVED_DATE\",\"type\":[\"null\",\"string\"],\"doc\":\"Dissolution Date field\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_INCORPORATION_DATE\",\"type\":[\"null\",\"string\"],\"doc\":\"Date of incorporation in CCYYMMDD format\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_UPDATE_DATE\",\"type\":[\"null\",\"string\"],\"doc\":\"This is load date and will be a system date\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_DATA_SOURCE\",\"type\":[\"null\",\"string\"],\"doc\":\"Indicates source of data\",\"default\":null,\"dataClassification\":\"3\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Type of company - L for Limited */
  @Deprecated public java.lang.CharSequence NAME_BUSINESS_COMPANY_TYPE;
  /** VAT number field */
  @Deprecated public java.lang.CharSequence IDENTIFIER_BUSINESS_VAT;
  /** EMAIL ID field */
  @Deprecated public java.lang.CharSequence IDENTIFIER_BUSINESS_EMAIL;
  /** Dissolution Date field */
  @Deprecated public java.lang.CharSequence IDENTIFIER_DISSOLVED_DATE;
  /** Date of incorporation in CCYYMMDD format */
  @Deprecated public java.lang.CharSequence IDENTIFIER_INCORPORATION_DATE;
  /** This is load date and will be a system date */
  @Deprecated public java.lang.CharSequence IDENTIFIER_UPDATE_DATE;
  /** Indicates source of data */
  @Deprecated public java.lang.CharSequence IDENTIFIER_DATA_SOURCE;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public identifierFields() {}

  /**
   * All-args constructor.
   */
  public identifierFields(java.lang.CharSequence NAME_BUSINESS_COMPANY_TYPE, java.lang.CharSequence IDENTIFIER_BUSINESS_VAT, java.lang.CharSequence IDENTIFIER_BUSINESS_EMAIL, java.lang.CharSequence IDENTIFIER_DISSOLVED_DATE, java.lang.CharSequence IDENTIFIER_INCORPORATION_DATE, java.lang.CharSequence IDENTIFIER_UPDATE_DATE, java.lang.CharSequence IDENTIFIER_DATA_SOURCE) {
    this.NAME_BUSINESS_COMPANY_TYPE = NAME_BUSINESS_COMPANY_TYPE;
    this.IDENTIFIER_BUSINESS_VAT = IDENTIFIER_BUSINESS_VAT;
    this.IDENTIFIER_BUSINESS_EMAIL = IDENTIFIER_BUSINESS_EMAIL;
    this.IDENTIFIER_DISSOLVED_DATE = IDENTIFIER_DISSOLVED_DATE;
    this.IDENTIFIER_INCORPORATION_DATE = IDENTIFIER_INCORPORATION_DATE;
    this.IDENTIFIER_UPDATE_DATE = IDENTIFIER_UPDATE_DATE;
    this.IDENTIFIER_DATA_SOURCE = IDENTIFIER_DATA_SOURCE;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return NAME_BUSINESS_COMPANY_TYPE;
    case 1: return IDENTIFIER_BUSINESS_VAT;
    case 2: return IDENTIFIER_BUSINESS_EMAIL;
    case 3: return IDENTIFIER_DISSOLVED_DATE;
    case 4: return IDENTIFIER_INCORPORATION_DATE;
    case 5: return IDENTIFIER_UPDATE_DATE;
    case 6: return IDENTIFIER_DATA_SOURCE;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: NAME_BUSINESS_COMPANY_TYPE = (java.lang.CharSequence)value$; break;
    case 1: IDENTIFIER_BUSINESS_VAT = (java.lang.CharSequence)value$; break;
    case 2: IDENTIFIER_BUSINESS_EMAIL = (java.lang.CharSequence)value$; break;
    case 3: IDENTIFIER_DISSOLVED_DATE = (java.lang.CharSequence)value$; break;
    case 4: IDENTIFIER_INCORPORATION_DATE = (java.lang.CharSequence)value$; break;
    case 5: IDENTIFIER_UPDATE_DATE = (java.lang.CharSequence)value$; break;
    case 6: IDENTIFIER_DATA_SOURCE = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'NAME_BUSINESS_COMPANY_TYPE' field.
   * Type of company - L for Limited   */
  public java.lang.CharSequence getNAMEBUSINESSCOMPANYTYPE() {
    return NAME_BUSINESS_COMPANY_TYPE;
  }

  /**
   * Sets the value of the 'NAME_BUSINESS_COMPANY_TYPE' field.
   * Type of company - L for Limited   * @param value the value to set.
   */
  public void setNAMEBUSINESSCOMPANYTYPE(java.lang.CharSequence value) {
    this.NAME_BUSINESS_COMPANY_TYPE = value;
  }

  /**
   * Gets the value of the 'IDENTIFIER_BUSINESS_VAT' field.
   * VAT number field   */
  public java.lang.CharSequence getIDENTIFIERBUSINESSVAT() {
    return IDENTIFIER_BUSINESS_VAT;
  }

  /**
   * Sets the value of the 'IDENTIFIER_BUSINESS_VAT' field.
   * VAT number field   * @param value the value to set.
   */
  public void setIDENTIFIERBUSINESSVAT(java.lang.CharSequence value) {
    this.IDENTIFIER_BUSINESS_VAT = value;
  }

  /**
   * Gets the value of the 'IDENTIFIER_BUSINESS_EMAIL' field.
   * EMAIL ID field   */
  public java.lang.CharSequence getIDENTIFIERBUSINESSEMAIL() {
    return IDENTIFIER_BUSINESS_EMAIL;
  }

  /**
   * Sets the value of the 'IDENTIFIER_BUSINESS_EMAIL' field.
   * EMAIL ID field   * @param value the value to set.
   */
  public void setIDENTIFIERBUSINESSEMAIL(java.lang.CharSequence value) {
    this.IDENTIFIER_BUSINESS_EMAIL = value;
  }

  /**
   * Gets the value of the 'IDENTIFIER_DISSOLVED_DATE' field.
   * Dissolution Date field   */
  public java.lang.CharSequence getIDENTIFIERDISSOLVEDDATE() {
    return IDENTIFIER_DISSOLVED_DATE;
  }

  /**
   * Sets the value of the 'IDENTIFIER_DISSOLVED_DATE' field.
   * Dissolution Date field   * @param value the value to set.
   */
  public void setIDENTIFIERDISSOLVEDDATE(java.lang.CharSequence value) {
    this.IDENTIFIER_DISSOLVED_DATE = value;
  }

  /**
   * Gets the value of the 'IDENTIFIER_INCORPORATION_DATE' field.
   * Date of incorporation in CCYYMMDD format   */
  public java.lang.CharSequence getIDENTIFIERINCORPORATIONDATE() {
    return IDENTIFIER_INCORPORATION_DATE;
  }

  /**
   * Sets the value of the 'IDENTIFIER_INCORPORATION_DATE' field.
   * Date of incorporation in CCYYMMDD format   * @param value the value to set.
   */
  public void setIDENTIFIERINCORPORATIONDATE(java.lang.CharSequence value) {
    this.IDENTIFIER_INCORPORATION_DATE = value;
  }

  /**
   * Gets the value of the 'IDENTIFIER_UPDATE_DATE' field.
   * This is load date and will be a system date   */
  public java.lang.CharSequence getIDENTIFIERUPDATEDATE() {
    return IDENTIFIER_UPDATE_DATE;
  }

  /**
   * Sets the value of the 'IDENTIFIER_UPDATE_DATE' field.
   * This is load date and will be a system date   * @param value the value to set.
   */
  public void setIDENTIFIERUPDATEDATE(java.lang.CharSequence value) {
    this.IDENTIFIER_UPDATE_DATE = value;
  }

  /**
   * Gets the value of the 'IDENTIFIER_DATA_SOURCE' field.
   * Indicates source of data   */
  public java.lang.CharSequence getIDENTIFIERDATASOURCE() {
    return IDENTIFIER_DATA_SOURCE;
  }

  /**
   * Sets the value of the 'IDENTIFIER_DATA_SOURCE' field.
   * Indicates source of data   * @param value the value to set.
   */
  public void setIDENTIFIERDATASOURCE(java.lang.CharSequence value) {
    this.IDENTIFIER_DATA_SOURCE = value;
  }

  /** Creates a new identifierFields RecordBuilder */
  public static com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.Builder newBuilder() {
    return new com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.Builder();
  }
  
  /** Creates a new identifierFields RecordBuilder by copying an existing Builder */
  public static com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.Builder newBuilder(com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.Builder other) {
    return new com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.Builder(other);
  }
  
  /** Creates a new identifierFields RecordBuilder by copying an existing identifierFields instance */
  public static com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.Builder newBuilder(com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields other) {
    return new com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.Builder(other);
  }
  
  /**
   * RecordBuilder for identifierFields instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<identifierFields>
    implements org.apache.avro.data.RecordBuilder<identifierFields> {

    private java.lang.CharSequence NAME_BUSINESS_COMPANY_TYPE;
    private java.lang.CharSequence IDENTIFIER_BUSINESS_VAT;
    private java.lang.CharSequence IDENTIFIER_BUSINESS_EMAIL;
    private java.lang.CharSequence IDENTIFIER_DISSOLVED_DATE;
    private java.lang.CharSequence IDENTIFIER_INCORPORATION_DATE;
    private java.lang.CharSequence IDENTIFIER_UPDATE_DATE;
    private java.lang.CharSequence IDENTIFIER_DATA_SOURCE;

    /** Creates a new Builder */
    private Builder() {
      super(com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.NAME_BUSINESS_COMPANY_TYPE)) {
        this.NAME_BUSINESS_COMPANY_TYPE = data().deepCopy(fields()[0].schema(), other.NAME_BUSINESS_COMPANY_TYPE);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.IDENTIFIER_BUSINESS_VAT)) {
        this.IDENTIFIER_BUSINESS_VAT = data().deepCopy(fields()[1].schema(), other.IDENTIFIER_BUSINESS_VAT);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.IDENTIFIER_BUSINESS_EMAIL)) {
        this.IDENTIFIER_BUSINESS_EMAIL = data().deepCopy(fields()[2].schema(), other.IDENTIFIER_BUSINESS_EMAIL);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.IDENTIFIER_DISSOLVED_DATE)) {
        this.IDENTIFIER_DISSOLVED_DATE = data().deepCopy(fields()[3].schema(), other.IDENTIFIER_DISSOLVED_DATE);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.IDENTIFIER_INCORPORATION_DATE)) {
        this.IDENTIFIER_INCORPORATION_DATE = data().deepCopy(fields()[4].schema(), other.IDENTIFIER_INCORPORATION_DATE);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.IDENTIFIER_UPDATE_DATE)) {
        this.IDENTIFIER_UPDATE_DATE = data().deepCopy(fields()[5].schema(), other.IDENTIFIER_UPDATE_DATE);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.IDENTIFIER_DATA_SOURCE)) {
        this.IDENTIFIER_DATA_SOURCE = data().deepCopy(fields()[6].schema(), other.IDENTIFIER_DATA_SOURCE);
        fieldSetFlags()[6] = true;
      }
    }
    
    /** Creates a Builder by copying an existing identifierFields instance */
    private Builder(com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields other) {
            super(com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.SCHEMA$);
      if (isValidValue(fields()[0], other.NAME_BUSINESS_COMPANY_TYPE)) {
        this.NAME_BUSINESS_COMPANY_TYPE = data().deepCopy(fields()[0].schema(), other.NAME_BUSINESS_COMPANY_TYPE);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.IDENTIFIER_BUSINESS_VAT)) {
        this.IDENTIFIER_BUSINESS_VAT = data().deepCopy(fields()[1].schema(), other.IDENTIFIER_BUSINESS_VAT);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.IDENTIFIER_BUSINESS_EMAIL)) {
        this.IDENTIFIER_BUSINESS_EMAIL = data().deepCopy(fields()[2].schema(), other.IDENTIFIER_BUSINESS_EMAIL);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.IDENTIFIER_DISSOLVED_DATE)) {
        this.IDENTIFIER_DISSOLVED_DATE = data().deepCopy(fields()[3].schema(), other.IDENTIFIER_DISSOLVED_DATE);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.IDENTIFIER_INCORPORATION_DATE)) {
        this.IDENTIFIER_INCORPORATION_DATE = data().deepCopy(fields()[4].schema(), other.IDENTIFIER_INCORPORATION_DATE);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.IDENTIFIER_UPDATE_DATE)) {
        this.IDENTIFIER_UPDATE_DATE = data().deepCopy(fields()[5].schema(), other.IDENTIFIER_UPDATE_DATE);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.IDENTIFIER_DATA_SOURCE)) {
        this.IDENTIFIER_DATA_SOURCE = data().deepCopy(fields()[6].schema(), other.IDENTIFIER_DATA_SOURCE);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'NAME_BUSINESS_COMPANY_TYPE' field */
    public java.lang.CharSequence getNAMEBUSINESSCOMPANYTYPE() {
      return NAME_BUSINESS_COMPANY_TYPE;
    }
    
    /** Sets the value of the 'NAME_BUSINESS_COMPANY_TYPE' field */
    public com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.Builder setNAMEBUSINESSCOMPANYTYPE(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.NAME_BUSINESS_COMPANY_TYPE = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'NAME_BUSINESS_COMPANY_TYPE' field has been set */
    public boolean hasNAMEBUSINESSCOMPANYTYPE() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'NAME_BUSINESS_COMPANY_TYPE' field */
    public com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.Builder clearNAMEBUSINESSCOMPANYTYPE() {
      NAME_BUSINESS_COMPANY_TYPE = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'IDENTIFIER_BUSINESS_VAT' field */
    public java.lang.CharSequence getIDENTIFIERBUSINESSVAT() {
      return IDENTIFIER_BUSINESS_VAT;
    }
    
    /** Sets the value of the 'IDENTIFIER_BUSINESS_VAT' field */
    public com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.Builder setIDENTIFIERBUSINESSVAT(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.IDENTIFIER_BUSINESS_VAT = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'IDENTIFIER_BUSINESS_VAT' field has been set */
    public boolean hasIDENTIFIERBUSINESSVAT() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'IDENTIFIER_BUSINESS_VAT' field */
    public com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.Builder clearIDENTIFIERBUSINESSVAT() {
      IDENTIFIER_BUSINESS_VAT = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'IDENTIFIER_BUSINESS_EMAIL' field */
    public java.lang.CharSequence getIDENTIFIERBUSINESSEMAIL() {
      return IDENTIFIER_BUSINESS_EMAIL;
    }
    
    /** Sets the value of the 'IDENTIFIER_BUSINESS_EMAIL' field */
    public com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.Builder setIDENTIFIERBUSINESSEMAIL(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.IDENTIFIER_BUSINESS_EMAIL = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'IDENTIFIER_BUSINESS_EMAIL' field has been set */
    public boolean hasIDENTIFIERBUSINESSEMAIL() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'IDENTIFIER_BUSINESS_EMAIL' field */
    public com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.Builder clearIDENTIFIERBUSINESSEMAIL() {
      IDENTIFIER_BUSINESS_EMAIL = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'IDENTIFIER_DISSOLVED_DATE' field */
    public java.lang.CharSequence getIDENTIFIERDISSOLVEDDATE() {
      return IDENTIFIER_DISSOLVED_DATE;
    }
    
    /** Sets the value of the 'IDENTIFIER_DISSOLVED_DATE' field */
    public com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.Builder setIDENTIFIERDISSOLVEDDATE(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.IDENTIFIER_DISSOLVED_DATE = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'IDENTIFIER_DISSOLVED_DATE' field has been set */
    public boolean hasIDENTIFIERDISSOLVEDDATE() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'IDENTIFIER_DISSOLVED_DATE' field */
    public com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.Builder clearIDENTIFIERDISSOLVEDDATE() {
      IDENTIFIER_DISSOLVED_DATE = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'IDENTIFIER_INCORPORATION_DATE' field */
    public java.lang.CharSequence getIDENTIFIERINCORPORATIONDATE() {
      return IDENTIFIER_INCORPORATION_DATE;
    }
    
    /** Sets the value of the 'IDENTIFIER_INCORPORATION_DATE' field */
    public com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.Builder setIDENTIFIERINCORPORATIONDATE(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.IDENTIFIER_INCORPORATION_DATE = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'IDENTIFIER_INCORPORATION_DATE' field has been set */
    public boolean hasIDENTIFIERINCORPORATIONDATE() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'IDENTIFIER_INCORPORATION_DATE' field */
    public com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.Builder clearIDENTIFIERINCORPORATIONDATE() {
      IDENTIFIER_INCORPORATION_DATE = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'IDENTIFIER_UPDATE_DATE' field */
    public java.lang.CharSequence getIDENTIFIERUPDATEDATE() {
      return IDENTIFIER_UPDATE_DATE;
    }
    
    /** Sets the value of the 'IDENTIFIER_UPDATE_DATE' field */
    public com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.Builder setIDENTIFIERUPDATEDATE(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.IDENTIFIER_UPDATE_DATE = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'IDENTIFIER_UPDATE_DATE' field has been set */
    public boolean hasIDENTIFIERUPDATEDATE() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'IDENTIFIER_UPDATE_DATE' field */
    public com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.Builder clearIDENTIFIERUPDATEDATE() {
      IDENTIFIER_UPDATE_DATE = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'IDENTIFIER_DATA_SOURCE' field */
    public java.lang.CharSequence getIDENTIFIERDATASOURCE() {
      return IDENTIFIER_DATA_SOURCE;
    }
    
    /** Sets the value of the 'IDENTIFIER_DATA_SOURCE' field */
    public com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.Builder setIDENTIFIERDATASOURCE(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.IDENTIFIER_DATA_SOURCE = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'IDENTIFIER_DATA_SOURCE' field has been set */
    public boolean hasIDENTIFIERDATASOURCE() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'IDENTIFIER_DATA_SOURCE' field */
    public com.equifax.fabric.uk.ingestion.courtjudgment.standardisedfields.entity.commercial.identifiers.identifierFields.Builder clearIDENTIFIERDATASOURCE() {
      IDENTIFIER_DATA_SOURCE = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public identifierFields build() {
      try {
        identifierFields record = new identifierFields();
        record.NAME_BUSINESS_COMPANY_TYPE = fieldSetFlags()[0] ? this.NAME_BUSINESS_COMPANY_TYPE : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.IDENTIFIER_BUSINESS_VAT = fieldSetFlags()[1] ? this.IDENTIFIER_BUSINESS_VAT : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.IDENTIFIER_BUSINESS_EMAIL = fieldSetFlags()[2] ? this.IDENTIFIER_BUSINESS_EMAIL : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.IDENTIFIER_DISSOLVED_DATE = fieldSetFlags()[3] ? this.IDENTIFIER_DISSOLVED_DATE : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.IDENTIFIER_INCORPORATION_DATE = fieldSetFlags()[4] ? this.IDENTIFIER_INCORPORATION_DATE : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.IDENTIFIER_UPDATE_DATE = fieldSetFlags()[5] ? this.IDENTIFIER_UPDATE_DATE : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.IDENTIFIER_DATA_SOURCE = fieldSetFlags()[6] ? this.IDENTIFIER_DATA_SOURCE : (java.lang.CharSequence) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
