/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.equifax.fabric.uk.ingestion.officer.rawfields.data.links;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Links extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Links\",\"namespace\":\"com.equifax.fabric.uk.ingestion.officer.rawfields.data.links\",\"fields\":[{\"name\":\"officer\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Officer\",\"namespace\":\"com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.officer\",\"fields\":[{\"name\":\"appointments\",\"type\":[\"null\",\"string\"],\"doc\":\"Link to the officer appointment resource that this appointment is associated with.\",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null},{\"name\":\"self\",\"type\":[\"null\",\"string\"],\"doc\":\"Link to this individual company officer appointment resource.\",\"default\":null,\"dataClassification\":\"3\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.officer.Officer officer;
  /** Link to this individual company officer appointment resource. */
  @Deprecated public java.lang.CharSequence self;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Links() {}

  /**
   * All-args constructor.
   */
  public Links(com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.officer.Officer officer, java.lang.CharSequence self) {
    this.officer = officer;
    this.self = self;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return officer;
    case 1: return self;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: officer = (com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.officer.Officer)value$; break;
    case 1: self = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'officer' field.
   */
  public com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.officer.Officer getOfficer() {
    return officer;
  }

  /**
   * Sets the value of the 'officer' field.
   * @param value the value to set.
   */
  public void setOfficer(com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.officer.Officer value) {
    this.officer = value;
  }

  /**
   * Gets the value of the 'self' field.
   * Link to this individual company officer appointment resource.   */
  public java.lang.CharSequence getSelf() {
    return self;
  }

  /**
   * Sets the value of the 'self' field.
   * Link to this individual company officer appointment resource.   * @param value the value to set.
   */
  public void setSelf(java.lang.CharSequence value) {
    this.self = value;
  }

  /** Creates a new Links RecordBuilder */
  public static com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.Links.Builder newBuilder() {
    return new com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.Links.Builder();
  }
  
  /** Creates a new Links RecordBuilder by copying an existing Builder */
  public static com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.Links.Builder newBuilder(com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.Links.Builder other) {
    return new com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.Links.Builder(other);
  }
  
  /** Creates a new Links RecordBuilder by copying an existing Links instance */
  public static com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.Links.Builder newBuilder(com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.Links other) {
    return new com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.Links.Builder(other);
  }
  
  /**
   * RecordBuilder for Links instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Links>
    implements org.apache.avro.data.RecordBuilder<Links> {

    private com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.officer.Officer officer;
    private java.lang.CharSequence self;

    /** Creates a new Builder */
    private Builder() {
      super(com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.Links.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.Links.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.officer)) {
        this.officer = data().deepCopy(fields()[0].schema(), other.officer);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.self)) {
        this.self = data().deepCopy(fields()[1].schema(), other.self);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Links instance */
    private Builder(com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.Links other) {
            super(com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.Links.SCHEMA$);
      if (isValidValue(fields()[0], other.officer)) {
        this.officer = data().deepCopy(fields()[0].schema(), other.officer);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.self)) {
        this.self = data().deepCopy(fields()[1].schema(), other.self);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'officer' field */
    public com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.officer.Officer getOfficer() {
      return officer;
    }
    
    /** Sets the value of the 'officer' field */
    public com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.Links.Builder setOfficer(com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.officer.Officer value) {
      validate(fields()[0], value);
      this.officer = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'officer' field has been set */
    public boolean hasOfficer() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'officer' field */
    public com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.Links.Builder clearOfficer() {
      officer = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'self' field */
    public java.lang.CharSequence getSelf() {
      return self;
    }
    
    /** Sets the value of the 'self' field */
    public com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.Links.Builder setSelf(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.self = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'self' field has been set */
    public boolean hasSelf() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'self' field */
    public com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.Links.Builder clearSelf() {
      self = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Links build() {
      try {
        Links record = new Links();
        record.officer = fieldSetFlags()[0] ? this.officer : (com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.officer.Officer) defaultValue(fields()[0]);
        record.self = fieldSetFlags()[1] ? this.self : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
