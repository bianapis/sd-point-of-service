package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PositionWithIds
 */
public class PositionWithIds   {
  private String servicingPositionReference = null;

  private String servicingPositionCashHoldingRecordReference = null;

  private String servicingPositionOperatingSessionReference = null;

  private String servicingCurrency = null;

  private String servicingCashHoldingRecord = null;

  private String servicingCashTransactionRecordReference = null;

  private String servicingCashTransactionRecord = null;

  private String customerContactReference = null;

  private String productInstanceReference = null;


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
   * @return servicingPositionCashHoldingRecordReference
  **/

  public String getServicingPositionCashHoldingRecordReference() {
    return servicingPositionCashHoldingRecordReference;
  }

  public void setServicingPositionCashHoldingRecordReference(String servicingPositionCashHoldingRecordReference) {
    this.servicingPositionCashHoldingRecordReference = servicingPositionCashHoldingRecordReference;
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
   * @return servicingCurrency
  **/

  public String getServicingCurrency() {
    return servicingCurrency;
  }

  public void setServicingCurrency(String servicingCurrency) {
    this.servicingCurrency = servicingCurrency;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text   
   * @return servicingCashHoldingRecord
  **/

  public String getServicingCashHoldingRecord() {
    return servicingCashHoldingRecord;
  }

  public void setServicingCashHoldingRecord(String servicingCashHoldingRecord) {
    this.servicingCashHoldingRecord = servicingCashHoldingRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return servicingCashTransactionRecordReference
  **/

  public String getServicingCashTransactionRecordReference() {
    return servicingCashTransactionRecordReference;
  }

  public void setServicingCashTransactionRecordReference(String servicingCashTransactionRecordReference) {
    this.servicingCashTransactionRecordReference = servicingCashTransactionRecordReference;
  }


  /**
   * Get servicingCashTransactionRecord
   * @return servicingCashTransactionRecord
  **/

  public String getServicingCashTransactionRecord() {
    return servicingCashTransactionRecord;
  }

  public void setServicingCashTransactionRecord(String servicingCashTransactionRecord) {
    this.servicingCashTransactionRecord = servicingCashTransactionRecord;
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


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


}

