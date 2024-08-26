/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.equifax.fabric.uk.ingestion.officer.rawfields;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class RawFields extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RawFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.officer.rawfields\",\"fields\":[{\"name\":\"data\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Data\",\"namespace\":\"com.equifax.fabric.uk.ingestion.officer.rawfields.data\",\"fields\":[{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Address\",\"namespace\":\"com.equifax.fabric.uk.ingestion.officer.rawfields.data.address\",\"fields\":[{\"name\":\"address_line_1\",\"type\":[\"null\",\"string\"],\"doc\":\"The first line of the address.\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"address_line_2\",\"type\":[\"null\",\"string\"],\"doc\":\"The second line of the address.\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"care_of\",\"type\":[\"null\",\"string\"],\"doc\":\"The care of name.\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"country\",\"type\":[\"null\",\"string\"],\"doc\":\"The country e.g. United Kingdom.\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"locality\",\"type\":[\"null\",\"string\"],\"doc\":\"The locality e.g. London.\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"po_box\",\"type\":[\"null\",\"string\"],\"doc\":\"The post-office box number.\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"postal_code\",\"type\":[\"null\",\"string\"],\"doc\":\"The postal code e.g. CF14 3UZ.\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"premises\",\"type\":[\"null\",\"string\"],\"doc\":\"The property name or number.\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"region\",\"type\":[\"null\",\"string\"],\"doc\":\"The region e.g. Surrey.\",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null},{\"name\":\"appointed_on\",\"type\":[\"null\",\"string\"],\"doc\":\"The date on which the officer was appointed.\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"country_of_residence\",\"type\":[\"null\",\"string\"],\"doc\":\"The officer's country of residence.\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"date_of_birth\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"DateOfBirth\",\"namespace\":\"com.equifax.fabric.uk.ingestion.officer.rawfields.data.dateofbirth\",\"fields\":[{\"name\":\"day\",\"type\":[\"null\",\"string\"],\"doc\":\"The day of the date of birth.\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"month\",\"type\":[\"null\",\"string\"],\"doc\":\"The month of date of birth.\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"year\",\"type\":[\"null\",\"string\"],\"doc\":\"The year of date of birth.\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"}]}],\"default\":null},{\"name\":\"former_names\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"FormerNames\",\"namespace\":\"com.equifax.fabric.uk.ingestion.officer.rawfields.data.formernames\",\"fields\":[{\"name\":\"forenames\",\"type\":[\"null\",\"string\"],\"doc\":\"Former forenames of the officer.\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"surname\",\"type\":[\"null\",\"string\"],\"doc\":\"Former surnames of the officer.\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"}]}},\"default\":[]},{\"name\":\"identification\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Identification\",\"namespace\":\"com.equifax.fabric.uk.ingestion.officer.rawfields.data.identification\",\"fields\":[{\"name\":\"identification_type\",\"type\":[\"null\",\"string\"],\"doc\":\"The officer's identity type Possible values are: eea non-eea uk-limited other-corporate-body-or-firm\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"legal_authority\",\"type\":[\"null\",\"string\"],\"doc\":\"The legal authority supervising the company.\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"legal_form\",\"type\":[\"null\",\"string\"],\"doc\":\"The legal form of the company as defined by its country of registration.\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"place_registered\",\"type\":[\"null\",\"string\"],\"doc\":\"Place registered.\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"registration_number\",\"type\":[\"null\",\"string\"],\"doc\":\"Company registration number.\",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null},{\"name\":\"links\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Links\",\"namespace\":\"com.equifax.fabric.uk.ingestion.officer.rawfields.data.links\",\"fields\":[{\"name\":\"officer\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Officer\",\"namespace\":\"com.equifax.fabric.uk.ingestion.officer.rawfields.data.links.officer\",\"fields\":[{\"name\":\"appointments\",\"type\":[\"null\",\"string\"],\"doc\":\"Link to the officer appointment resource that this appointment is associated with.\",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null},{\"name\":\"self\",\"type\":[\"null\",\"string\"],\"doc\":\"Link to this individual company officer appointment resource.\",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"doc\":\"Corporate or natural officer name.\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"nationality\",\"type\":[\"null\",\"string\"],\"doc\":\"The officer's nationality.\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"occupation\",\"type\":[\"null\",\"string\"],\"doc\":\"The officer's job title.\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"officer_role\",\"type\":[\"null\",\"string\"],\"doc\":\"Officer roles\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"resigned_on\",\"type\":[\"null\",\"string\"],\"doc\":\"The date on which the officer resigned.\",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null},{\"name\":\"event\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Event\",\"namespace\":\"com.equifax.fabric.uk.ingestion.officer.rawfields.event\",\"fields\":[{\"name\":\"fields_changed\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"Array of fields that have been changed by this event. Nested fields are referenced by dot notation e.g. links.document_metadata\",\"default\":[],\"dataClassification\":\"3\"},{\"name\":\"published_at\",\"type\":[\"null\",\"string\"],\"doc\":\"The date and time the data notification was raised\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"timepoint\",\"type\":[\"null\",\"string\"],\"doc\":\"The point-in-time identifier for this stream document. Use to re-establish a connection to the stream at this point.\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"type\",\"type\":[\"null\",\"string\"],\"doc\":\"The type of event denoted by this stream document.Possible values are:changed deleted\",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null},{\"name\":\"resource_id\",\"type\":[\"null\",\"string\"],\"doc\":\"The ID of the resource.\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"resource_kind\",\"type\":[\"null\",\"string\"],\"doc\":\"The type of resource contained within the stream document.Possible values are:company-profile#company-profile filing-history#filing-history\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"resource_uri\",\"type\":[\"null\",\"string\"],\"doc\":\"The URI of the resource.\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"FILE_NAME\",\"type\":[\"null\",\"string\"],\"doc\":\"Supplied File Name\",\"default\":null,\"dataClassification\":\"3\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public com.equifax.fabric.uk.ingestion.officer.rawfields.data.Data data;
  @Deprecated public com.equifax.fabric.uk.ingestion.officer.rawfields.event.Event event;
  /** The ID of the resource. */
  @Deprecated public java.lang.CharSequence resource_id;
  /** The type of resource contained within the stream document.Possible values are:company-profile#company-profile filing-history#filing-history */
  @Deprecated public java.lang.CharSequence resource_kind;
  /** The URI of the resource. */
  @Deprecated public java.lang.CharSequence resource_uri;
  /** Supplied File Name */
  @Deprecated public java.lang.CharSequence FILE_NAME;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public RawFields() {}

  /**
   * All-args constructor.
   */
  public RawFields(com.equifax.fabric.uk.ingestion.officer.rawfields.data.Data data, com.equifax.fabric.uk.ingestion.officer.rawfields.event.Event event, java.lang.CharSequence resource_id, java.lang.CharSequence resource_kind, java.lang.CharSequence resource_uri, java.lang.CharSequence FILE_NAME) {
    this.data = data;
    this.event = event;
    this.resource_id = resource_id;
    this.resource_kind = resource_kind;
    this.resource_uri = resource_uri;
    this.FILE_NAME = FILE_NAME;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return data;
    case 1: return event;
    case 2: return resource_id;
    case 3: return resource_kind;
    case 4: return resource_uri;
    case 5: return FILE_NAME;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: data = (com.equifax.fabric.uk.ingestion.officer.rawfields.data.Data)value$; break;
    case 1: event = (com.equifax.fabric.uk.ingestion.officer.rawfields.event.Event)value$; break;
    case 2: resource_id = (java.lang.CharSequence)value$; break;
    case 3: resource_kind = (java.lang.CharSequence)value$; break;
    case 4: resource_uri = (java.lang.CharSequence)value$; break;
    case 5: FILE_NAME = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'data' field.
   */
  public com.equifax.fabric.uk.ingestion.officer.rawfields.data.Data getData() {
    return data;
  }

  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public void setData(com.equifax.fabric.uk.ingestion.officer.rawfields.data.Data value) {
    this.data = value;
  }

  /**
   * Gets the value of the 'event' field.
   */
  public com.equifax.fabric.uk.ingestion.officer.rawfields.event.Event getEvent() {
    return event;
  }

  /**
   * Sets the value of the 'event' field.
   * @param value the value to set.
   */
  public void setEvent(com.equifax.fabric.uk.ingestion.officer.rawfields.event.Event value) {
    this.event = value;
  }

  /**
   * Gets the value of the 'resource_id' field.
   * The ID of the resource.   */
  public java.lang.CharSequence getResourceId() {
    return resource_id;
  }

  /**
   * Sets the value of the 'resource_id' field.
   * The ID of the resource.   * @param value the value to set.
   */
  public void setResourceId(java.lang.CharSequence value) {
    this.resource_id = value;
  }

  /**
   * Gets the value of the 'resource_kind' field.
   * The type of resource contained within the stream document.Possible values are:company-profile#company-profile filing-history#filing-history   */
  public java.lang.CharSequence getResourceKind() {
    return resource_kind;
  }

  /**
   * Sets the value of the 'resource_kind' field.
   * The type of resource contained within the stream document.Possible values are:company-profile#company-profile filing-history#filing-history   * @param value the value to set.
   */
  public void setResourceKind(java.lang.CharSequence value) {
    this.resource_kind = value;
  }

  /**
   * Gets the value of the 'resource_uri' field.
   * The URI of the resource.   */
  public java.lang.CharSequence getResourceUri() {
    return resource_uri;
  }

  /**
   * Sets the value of the 'resource_uri' field.
   * The URI of the resource.   * @param value the value to set.
   */
  public void setResourceUri(java.lang.CharSequence value) {
    this.resource_uri = value;
  }

  /**
   * Gets the value of the 'FILE_NAME' field.
   * Supplied File Name   */
  public java.lang.CharSequence getFILENAME() {
    return FILE_NAME;
  }

  /**
   * Sets the value of the 'FILE_NAME' field.
   * Supplied File Name   * @param value the value to set.
   */
  public void setFILENAME(java.lang.CharSequence value) {
    this.FILE_NAME = value;
  }

  /** Creates a new RawFields RecordBuilder */
  public static com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields.Builder newBuilder() {
    return new com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields.Builder();
  }
  
  /** Creates a new RawFields RecordBuilder by copying an existing Builder */
  public static com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields.Builder newBuilder(com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields.Builder other) {
    return new com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields.Builder(other);
  }
  
  /** Creates a new RawFields RecordBuilder by copying an existing RawFields instance */
  public static com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields.Builder newBuilder(com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields other) {
    return new com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields.Builder(other);
  }
  
  /**
   * RecordBuilder for RawFields instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RawFields>
    implements org.apache.avro.data.RecordBuilder<RawFields> {

    private com.equifax.fabric.uk.ingestion.officer.rawfields.data.Data data;
    private com.equifax.fabric.uk.ingestion.officer.rawfields.event.Event event;
    private java.lang.CharSequence resource_id;
    private java.lang.CharSequence resource_kind;
    private java.lang.CharSequence resource_uri;
    private java.lang.CharSequence FILE_NAME;

    /** Creates a new Builder */
    private Builder() {
      super(com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.data)) {
        this.data = data().deepCopy(fields()[0].schema(), other.data);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.event)) {
        this.event = data().deepCopy(fields()[1].schema(), other.event);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.resource_id)) {
        this.resource_id = data().deepCopy(fields()[2].schema(), other.resource_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.resource_kind)) {
        this.resource_kind = data().deepCopy(fields()[3].schema(), other.resource_kind);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.resource_uri)) {
        this.resource_uri = data().deepCopy(fields()[4].schema(), other.resource_uri);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.FILE_NAME)) {
        this.FILE_NAME = data().deepCopy(fields()[5].schema(), other.FILE_NAME);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing RawFields instance */
    private Builder(com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields other) {
            super(com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields.SCHEMA$);
      if (isValidValue(fields()[0], other.data)) {
        this.data = data().deepCopy(fields()[0].schema(), other.data);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.event)) {
        this.event = data().deepCopy(fields()[1].schema(), other.event);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.resource_id)) {
        this.resource_id = data().deepCopy(fields()[2].schema(), other.resource_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.resource_kind)) {
        this.resource_kind = data().deepCopy(fields()[3].schema(), other.resource_kind);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.resource_uri)) {
        this.resource_uri = data().deepCopy(fields()[4].schema(), other.resource_uri);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.FILE_NAME)) {
        this.FILE_NAME = data().deepCopy(fields()[5].schema(), other.FILE_NAME);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'data' field */
    public com.equifax.fabric.uk.ingestion.officer.rawfields.data.Data getData() {
      return data;
    }
    
    /** Sets the value of the 'data' field */
    public com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields.Builder setData(com.equifax.fabric.uk.ingestion.officer.rawfields.data.Data value) {
      validate(fields()[0], value);
      this.data = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'data' field has been set */
    public boolean hasData() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'data' field */
    public com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields.Builder clearData() {
      data = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'event' field */
    public com.equifax.fabric.uk.ingestion.officer.rawfields.event.Event getEvent() {
      return event;
    }
    
    /** Sets the value of the 'event' field */
    public com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields.Builder setEvent(com.equifax.fabric.uk.ingestion.officer.rawfields.event.Event value) {
      validate(fields()[1], value);
      this.event = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'event' field has been set */
    public boolean hasEvent() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'event' field */
    public com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields.Builder clearEvent() {
      event = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'resource_id' field */
    public java.lang.CharSequence getResourceId() {
      return resource_id;
    }
    
    /** Sets the value of the 'resource_id' field */
    public com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields.Builder setResourceId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.resource_id = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'resource_id' field has been set */
    public boolean hasResourceId() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'resource_id' field */
    public com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields.Builder clearResourceId() {
      resource_id = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'resource_kind' field */
    public java.lang.CharSequence getResourceKind() {
      return resource_kind;
    }
    
    /** Sets the value of the 'resource_kind' field */
    public com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields.Builder setResourceKind(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.resource_kind = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'resource_kind' field has been set */
    public boolean hasResourceKind() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'resource_kind' field */
    public com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields.Builder clearResourceKind() {
      resource_kind = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'resource_uri' field */
    public java.lang.CharSequence getResourceUri() {
      return resource_uri;
    }
    
    /** Sets the value of the 'resource_uri' field */
    public com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields.Builder setResourceUri(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.resource_uri = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'resource_uri' field has been set */
    public boolean hasResourceUri() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'resource_uri' field */
    public com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields.Builder clearResourceUri() {
      resource_uri = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'FILE_NAME' field */
    public java.lang.CharSequence getFILENAME() {
      return FILE_NAME;
    }
    
    /** Sets the value of the 'FILE_NAME' field */
    public com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields.Builder setFILENAME(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.FILE_NAME = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'FILE_NAME' field has been set */
    public boolean hasFILENAME() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'FILE_NAME' field */
    public com.equifax.fabric.uk.ingestion.officer.rawfields.RawFields.Builder clearFILENAME() {
      FILE_NAME = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public RawFields build() {
      try {
        RawFields record = new RawFields();
        record.data = fieldSetFlags()[0] ? this.data : (com.equifax.fabric.uk.ingestion.officer.rawfields.data.Data) defaultValue(fields()[0]);
        record.event = fieldSetFlags()[1] ? this.event : (com.equifax.fabric.uk.ingestion.officer.rawfields.event.Event) defaultValue(fields()[1]);
        record.resource_id = fieldSetFlags()[2] ? this.resource_id : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.resource_kind = fieldSetFlags()[3] ? this.resource_kind : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.resource_uri = fieldSetFlags()[4] ? this.resource_uri : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.FILE_NAME = fieldSetFlags()[5] ? this.FILE_NAME : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
