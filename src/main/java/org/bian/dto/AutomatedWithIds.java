package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * AutomatedWithIds
 */
public class AutomatedWithIds   {
  private String servicingPositionReference = null;

  private String servicingPositionAutomatedCustomerSessionReference = null;

  private String servicingPositionOperatingSessionReference = null;

  private String businessUnitReference = null;

  private String servicingPositionSessionSchedule = null;

  private String customerContactReference = null;

  private String servicingPositionActivityReport = null;

  private String servicingPositionActivityStatistics = null;


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
   * @return servicingPositionAutomatedCustomerSessionReference
  **/

  public String getServicingPositionAutomatedCustomerSessionReference() {
    return servicingPositionAutomatedCustomerSessionReference;
  }

  public void setServicingPositionAutomatedCustomerSessionReference(String servicingPositionAutomatedCustomerSessionReference) {
    this.servicingPositionAutomatedCustomerSessionReference = servicingPositionAutomatedCustomerSessionReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return businessUnitReference
  **/

  public String getBusinessUnitReference() {
    return businessUnitReference;
  }

  public void setBusinessUnitReference(String businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  
   * @return servicingPositionSessionSchedule
  **/

  public String getServicingPositionSessionSchedule() {
    return servicingPositionSessionSchedule;
  }

  public void setServicingPositionSessionSchedule(String servicingPositionSessionSchedule) {
    this.servicingPositionSessionSchedule = servicingPositionSessionSchedule;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text   
   * @return servicingPositionActivityReport
  **/

  public String getServicingPositionActivityReport() {
    return servicingPositionActivityReport;
  }

  public void setServicingPositionActivityReport(String servicingPositionActivityReport) {
    this.servicingPositionActivityReport = servicingPositionActivityReport;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text   
   * @return servicingPositionActivityStatistics
  **/

  public String getServicingPositionActivityStatistics() {
    return servicingPositionActivityStatistics;
  }

  public void setServicingPositionActivityStatistics(String servicingPositionActivityStatistics) {
    this.servicingPositionActivityStatistics = servicingPositionActivityStatistics;
  }


}

