/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.insolvencycases.links;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Links extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Links\",\"namespace\":\"com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.insolvencycases.links\",\"fields\":[{\"name\":\"case\",\"type\":[\"null\",\"string\"],\"doc\":\"Link to the insolvency case data\",\"default\":null,\"dataClassification\":\"3\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Link to the insolvency case data */
  @Deprecated public java.lang.CharSequence case$;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Links() {}

  /**
   * All-args constructor.
   */
  public Links(java.lang.CharSequence case$) {
    this.case$ = case$;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return case$;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: case$ = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'case$' field.
   * Link to the insolvency case data   */
  public java.lang.CharSequence getCase$() {
    return case$;
  }

  /**
   * Sets the value of the 'case$' field.
   * Link to the insolvency case data   * @param value the value to set.
   */
  public void setCase$(java.lang.CharSequence value) {
    this.case$ = value;
  }

  /** Creates a new Links RecordBuilder */
  public static com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.insolvencycases.links.Links.Builder newBuilder() {
    return new com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.insolvencycases.links.Links.Builder();
  }
  
  /** Creates a new Links RecordBuilder by copying an existing Builder */
  public static com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.insolvencycases.links.Links.Builder newBuilder(com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.insolvencycases.links.Links.Builder other) {
    return new com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.insolvencycases.links.Links.Builder(other);
  }
  
  /** Creates a new Links RecordBuilder by copying an existing Links instance */
  public static com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.insolvencycases.links.Links.Builder newBuilder(com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.insolvencycases.links.Links other) {
    return new com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.insolvencycases.links.Links.Builder(other);
  }
  
  /**
   * RecordBuilder for Links instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Links>
    implements org.apache.avro.data.RecordBuilder<Links> {

    private java.lang.CharSequence case$;

    /** Creates a new Builder */
    private Builder() {
      super(com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.insolvencycases.links.Links.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.insolvencycases.links.Links.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.case$)) {
        this.case$ = data().deepCopy(fields()[0].schema(), other.case$);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Links instance */
    private Builder(com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.insolvencycases.links.Links other) {
            super(com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.insolvencycases.links.Links.SCHEMA$);
      if (isValidValue(fields()[0], other.case$)) {
        this.case$ = data().deepCopy(fields()[0].schema(), other.case$);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'case$' field */
    public java.lang.CharSequence getCase$() {
      return case$;
    }
    
    /** Sets the value of the 'case$' field */
    public com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.insolvencycases.links.Links.Builder setCase$(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.case$ = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'case$' field has been set */
    public boolean hasCase$() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'case$' field */
    public com.equifax.fabric.uk.ingestion.mortgagefiling.rawfields.data.insolvencycases.links.Links.Builder clearCase$() {
      case$ = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public Links build() {
      try {
        Links record = new Links();
        record.case$ = fieldSetFlags()[0] ? this.case$ : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
