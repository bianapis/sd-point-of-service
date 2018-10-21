package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * InventoryWithIds
 */
public class InventoryWithIds   {
  private String servicingPositionReference = null;

  private String servicingPositionInventoryRecordReference = null;

  private String servicingPositionOperatingSessionReference = null;

  private String servicingPositionType = null;

  private String servicingPositionLocation = null;

  private String servicingPositionFacilityType = null;

  private String servicingPositionFacilityReference = null;

  private String servicingInventoryType = null;

  private Object servicingPositionInventoryRecord = null;

  private String servicingInventoryTransactionRecordReference = null;

  private String servicingInventoryTransactionRecord = null;

  private String customerContactReference = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return servicingPositionReference
  **/

  public String getServicingPositionReference() {
    return servicingPositionReference;
  }

  public void setServicingPositionReference(String servicingPositionReference) {
    this.servicingPositionReference = servicingPositionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return servicingPositionInventoryRecordReference
  **/

  public String getServicingPositionInventoryRecordReference() {
    return servicingPositionInventoryRecordReference;
  }

  public void setServicingPositionInventoryRecordReference(String servicingPositionInventoryRecordReference) {
    this.servicingPositionInventoryRecordReference = servicingPositionInventoryRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return servicingPositionOperatingSessionReference
  **/

  public String getServicingPositionOperatingSessionReference() {
    return servicingPositionOperatingSessionReference;
  }

  public void setServicingPositionOperatingSessionReference(String servicingPositionOperatingSessionReference) {
    this.servicingPositionOperatingSessionReference = servicingPositionOperatingSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text   
   * @return servicingPositionType
  **/

  public String getServicingPositionType() {
    return servicingPositionType;
  }

  public void setServicingPositionType(String servicingPositionType) {
    this.servicingPositionType = servicingPositionType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text   
   * @return servicingPositionLocation
  **/

  public String getServicingPositionLocation() {
    return servicingPositionLocation;
  }

  public void setServicingPositionLocation(String servicingPositionLocation) {
    this.servicingPositionLocation = servicingPositionLocation;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text   
   * @return servicingPositionFacilityType
  **/

  public String getServicingPositionFacilityType() {
    return servicingPositionFacilityType;
  }

  public void setServicingPositionFacilityType(String servicingPositionFacilityType) {
    this.servicingPositionFacilityType = servicingPositionFacilityType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return servicingPositionFacilityReference
  **/

  public String getServicingPositionFacilityReference() {
    return servicingPositionFacilityReference;
  }

  public void setServicingPositionFacilityReference(String servicingPositionFacilityReference) {
    this.servicingPositionFacilityReference = servicingPositionFacilityReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  
   * @return servicingInventoryType
  **/

  public String getServicingInventoryType() {
    return servicingInventoryType;
  }

  public void setServicingInventoryType(String servicingInventoryType) {
    this.servicingInventoryType = servicingInventoryType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return servicingPositionInventoryRecord
  **/

  public Object getServicingPositionInventoryRecord() {
    return servicingPositionInventoryRecord;
  }

  public void setServicingPositionInventoryRecord(Object servicingPositionInventoryRecord) {
    this.servicingPositionInventoryRecord = servicingPositionInventoryRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return servicingInventoryTransactionRecordReference
  **/

  public String getServicingInventoryTransactionRecordReference() {
    return servicingInventoryTransactionRecordReference;
  }

  public void setServicingInventoryTransactionRecordReference(String servicingInventoryTransactionRecordReference) {
    this.servicingInventoryTransactionRecordReference = servicingInventoryTransactionRecordReference;
  }


  /**
   * Get servicingInventoryTransactionRecord
   * @return servicingInventoryTransactionRecord
  **/

  public String getServicingInventoryTransactionRecord() {
    return servicingInventoryTransactionRecord;
  }

  public void setServicingInventoryTransactionRecord(String servicingInventoryTransactionRecord) {
    this.servicingInventoryTransactionRecord = servicingInventoryTransactionRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerContactReference
  **/

  public String getCustomerContactReference() {
    return customerContactReference;
  }

  public void setCustomerContactReference(String customerContactReference) {
    this.customerContactReference = customerContactReference;
  }


}

