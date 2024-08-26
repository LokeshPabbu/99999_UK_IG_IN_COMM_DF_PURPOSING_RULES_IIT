/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.previouscompanynames;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PreviousCompanyNames extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PreviousCompanyNames\",\"namespace\":\"com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.previouscompanynames\",\"fields\":[{\"name\":\"ceased_on\",\"type\":[\"null\",\"string\"],\"doc\":\"Previous Company Name Ceased On\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"effective_from\",\"type\":[\"null\",\"string\"],\"doc\":\"Previous Company Name Effective From\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"doc\":\"Previous Company Name\",\"default\":null,\"dataClassification\":\"3\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Previous Company Name Ceased On */
  @Deprecated public java.lang.CharSequence ceased_on;
  /** Previous Company Name Effective From */
  @Deprecated public java.lang.CharSequence effective_from;
  /** Previous Company Name */
  @Deprecated public java.lang.CharSequence name;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public PreviousCompanyNames() {}

  /**
   * All-args constructor.
   */
  public PreviousCompanyNames(java.lang.CharSequence ceased_on, java.lang.CharSequence effective_from, java.lang.CharSequence name) {
    this.ceased_on = ceased_on;
    this.effective_from = effective_from;
    this.name = name;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ceased_on;
    case 1: return effective_from;
    case 2: return name;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ceased_on = (java.lang.CharSequence)value$; break;
    case 1: effective_from = (java.lang.CharSequence)value$; break;
    case 2: name = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'ceased_on' field.
   * Previous Company Name Ceased On   */
  public java.lang.CharSequence getCeasedOn() {
    return ceased_on;
  }

  /**
   * Sets the value of the 'ceased_on' field.
   * Previous Company Name Ceased On   * @param value the value to set.
   */
  public void setCeasedOn(java.lang.CharSequence value) {
    this.ceased_on = value;
  }

  /**
   * Gets the value of the 'effective_from' field.
   * Previous Company Name Effective From   */
  public java.lang.CharSequence getEffectiveFrom() {
    return effective_from;
  }

  /**
   * Sets the value of the 'effective_from' field.
   * Previous Company Name Effective From   * @param value the value to set.
   */
  public void setEffectiveFrom(java.lang.CharSequence value) {
    this.effective_from = value;
  }

  /**
   * Gets the value of the 'name' field.
   * Previous Company Name   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * Previous Company Name   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /** Creates a new PreviousCompanyNames RecordBuilder */
  public static com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.previouscompanynames.PreviousCompanyNames.Builder newBuilder() {
    return new com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.previouscompanynames.PreviousCompanyNames.Builder();
  }
  
  /** Creates a new PreviousCompanyNames RecordBuilder by copying an existing Builder */
  public static com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.previouscompanynames.PreviousCompanyNames.Builder newBuilder(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.previouscompanynames.PreviousCompanyNames.Builder other) {
    return new com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.previouscompanynames.PreviousCompanyNames.Builder(other);
  }
  
  /** Creates a new PreviousCompanyNames RecordBuilder by copying an existing PreviousCompanyNames instance */
  public static com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.previouscompanynames.PreviousCompanyNames.Builder newBuilder(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.previouscompanynames.PreviousCompanyNames other) {
    return new com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.previouscompanynames.PreviousCompanyNames.Builder(other);
  }
  
  /**
   * RecordBuilder for PreviousCompanyNames instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PreviousCompanyNames>
    implements org.apache.avro.data.RecordBuilder<PreviousCompanyNames> {

    private java.lang.CharSequence ceased_on;
    private java.lang.CharSequence effective_from;
    private java.lang.CharSequence name;

    /** Creates a new Builder */
    private Builder() {
      super(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.previouscompanynames.PreviousCompanyNames.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.previouscompanynames.PreviousCompanyNames.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.ceased_on)) {
        this.ceased_on = data().deepCopy(fields()[0].schema(), other.ceased_on);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.effective_from)) {
        this.effective_from = data().deepCopy(fields()[1].schema(), other.effective_from);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing PreviousCompanyNames instance */
    private Builder(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.previouscompanynames.PreviousCompanyNames other) {
            super(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.previouscompanynames.PreviousCompanyNames.SCHEMA$);
      if (isValidValue(fields()[0], other.ceased_on)) {
        this.ceased_on = data().deepCopy(fields()[0].schema(), other.ceased_on);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.effective_from)) {
        this.effective_from = data().deepCopy(fields()[1].schema(), other.effective_from);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'ceased_on' field */
    public java.lang.CharSequence getCeasedOn() {
      return ceased_on;
    }
    
    /** Sets the value of the 'ceased_on' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.previouscompanynames.PreviousCompanyNames.Builder setCeasedOn(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.ceased_on = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'ceased_on' field has been set */
    public boolean hasCeasedOn() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'ceased_on' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.previouscompanynames.PreviousCompanyNames.Builder clearCeasedOn() {
      ceased_on = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'effective_from' field */
    public java.lang.CharSequence getEffectiveFrom() {
      return effective_from;
    }
    
    /** Sets the value of the 'effective_from' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.previouscompanynames.PreviousCompanyNames.Builder setEffectiveFrom(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.effective_from = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'effective_from' field has been set */
    public boolean hasEffectiveFrom() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'effective_from' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.previouscompanynames.PreviousCompanyNames.Builder clearEffectiveFrom() {
      effective_from = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.previouscompanynames.PreviousCompanyNames.Builder setName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.name = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'name' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.previouscompanynames.PreviousCompanyNames.Builder clearName() {
      name = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public PreviousCompanyNames build() {
      try {
        PreviousCompanyNames record = new PreviousCompanyNames();
        record.ceased_on = fieldSetFlags()[0] ? this.ceased_on : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.effective_from = fieldSetFlags()[1] ? this.effective_from : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.name = fieldSetFlags()[2] ? this.name : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
