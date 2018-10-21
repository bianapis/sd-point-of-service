package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * AssistedWithIds
 */
public class AssistedWithIds   {
  private String servicingPositionReference = null;

  private String servicingPositionAssitedCustomerSessionReference = null;

  private String servicingPositionOperatingSessionReference = null;

  private String employeeBusinessUnitReference = null;

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
   * @return servicingPositionAssitedCustomerSessionReference
  **/

  public String getServicingPositionAssitedCustomerSessionReference() {
    return servicingPositionAssitedCustomerSessionReference;
  }

  public void setServicingPositionAssitedCustomerSessionReference(String servicingPositionAssitedCustomerSessionReference) {
    this.servicingPositionAssitedCustomerSessionReference = servicingPositionAssitedCustomerSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text   
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
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
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

