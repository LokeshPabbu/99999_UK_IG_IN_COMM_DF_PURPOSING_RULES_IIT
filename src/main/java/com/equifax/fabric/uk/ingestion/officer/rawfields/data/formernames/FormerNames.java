/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.equifax.fabric.uk.ingestion.officer.rawfields.data.formernames;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class FormerNames extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FormerNames\",\"namespace\":\"com.equifax.fabric.uk.ingestion.officer.rawfields.data.formernames\",\"fields\":[{\"name\":\"forenames\",\"type\":[\"null\",\"string\"],\"doc\":\"Former forenames of the officer.\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"surname\",\"type\":[\"null\",\"string\"],\"doc\":\"Former surnames of the officer.\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Former forenames of the officer. */
  @Deprecated public java.lang.CharSequence forenames;
  /** Former surnames of the officer. */
  @Deprecated public java.lang.CharSequence surname;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public FormerNames() {}

  /**
   * All-args constructor.
   */
  public FormerNames(java.lang.CharSequence forenames, java.lang.CharSequence surname) {
    this.forenames = forenames;
    this.surname = surname;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return forenames;
    case 1: return surname;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: forenames = (java.lang.CharSequence)value$; break;
    case 1: surname = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'forenames' field.
   * Former forenames of the officer.   */
  public java.lang.CharSequence getForenames() {
    return forenames;
  }

  /**
   * Sets the value of the 'forenames' field.
   * Former forenames of the officer.   * @param value the value to set.
   */
  public void setForenames(java.lang.CharSequence value) {
    this.forenames = value;
  }

  /**
   * Gets the value of the 'surname' field.
   * Former surnames of the officer.   */
  public java.lang.CharSequence getSurname() {
    return surname;
  }

  /**
   * Sets the value of the 'surname' field.
   * Former surnames of the officer.   * @param value the value to set.
   */
  public void setSurname(java.lang.CharSequence value) {
    this.surname = value;
  }

  /** Creates a new FormerNames RecordBuilder */
  public static com.equifax.fabric.uk.ingestion.officer.rawfields.data.formernames.FormerNames.Builder newBuilder() {
    return new com.equifax.fabric.uk.ingestion.officer.rawfields.data.formernames.FormerNames.Builder();
  }
  
  /** Creates a new FormerNames RecordBuilder by copying an existing Builder */
  public static com.equifax.fabric.uk.ingestion.officer.rawfields.data.formernames.FormerNames.Builder newBuilder(com.equifax.fabric.uk.ingestion.officer.rawfields.data.formernames.FormerNames.Builder other) {
    return new com.equifax.fabric.uk.ingestion.officer.rawfields.data.formernames.FormerNames.Builder(other);
  }
  
  /** Creates a new FormerNames RecordBuilder by copying an existing FormerNames instance */
  public static com.equifax.fabric.uk.ingestion.officer.rawfields.data.formernames.FormerNames.Builder newBuilder(com.equifax.fabric.uk.ingestion.officer.rawfields.data.formernames.FormerNames other) {
    return new com.equifax.fabric.uk.ingestion.officer.rawfields.data.formernames.FormerNames.Builder(other);
  }
  
  /**
   * RecordBuilder for FormerNames instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FormerNames>
    implements org.apache.avro.data.RecordBuilder<FormerNames> {

    private java.lang.CharSequence forenames;
    private java.lang.CharSequence surname;

    /** Creates a new Builder */
    private Builder() {
      super(com.equifax.fabric.uk.ingestion.officer.rawfields.data.formernames.FormerNames.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.equifax.fabric.uk.ingestion.officer.rawfields.data.formernames.FormerNames.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.forenames)) {
        this.forenames = data().deepCopy(fields()[0].schema(), other.forenames);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.surname)) {
        this.surname = data().deepCopy(fields()[1].schema(), other.surname);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing FormerNames instance */
    private Builder(com.equifax.fabric.uk.ingestion.officer.rawfields.data.formernames.FormerNames other) {
            super(com.equifax.fabric.uk.ingestion.officer.rawfields.data.formernames.FormerNames.SCHEMA$);
      if (isValidValue(fields()[0], other.forenames)) {
        this.forenames = data().deepCopy(fields()[0].schema(), other.forenames);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.surname)) {
        this.surname = data().deepCopy(fields()[1].schema(), other.surname);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'forenames' field */
    public java.lang.CharSequence getForenames() {
      return forenames;
    }
    
    /** Sets the value of the 'forenames' field */
    public com.equifax.fabric.uk.ingestion.officer.rawfields.data.formernames.FormerNames.Builder setForenames(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.forenames = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'forenames' field has been set */
    public boolean hasForenames() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'forenames' field */
    public com.equifax.fabric.uk.ingestion.officer.rawfields.data.formernames.FormerNames.Builder clearForenames() {
      forenames = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'surname' field */
    public java.lang.CharSequence getSurname() {
      return surname;
    }
    
    /** Sets the value of the 'surname' field */
    public com.equifax.fabric.uk.ingestion.officer.rawfields.data.formernames.FormerNames.Builder setSurname(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.surname = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'surname' field has been set */
    public boolean hasSurname() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'surname' field */
    public com.equifax.fabric.uk.ingestion.officer.rawfields.data.formernames.FormerNames.Builder clearSurname() {
      surname = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public FormerNames build() {
      try {
        FormerNames record = new FormerNames();
        record.forenames = fieldSetFlags()[0] ? this.forenames : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.surname = fieldSetFlags()[1] ? this.surname : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
