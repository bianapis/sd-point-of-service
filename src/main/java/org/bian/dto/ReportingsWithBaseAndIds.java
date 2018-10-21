package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ReportingsWithBaseAndIds
 */
public class ReportingsWithBaseAndIds   {
  private String servicingPositionOperatingSessionReference = null;

  private String servicingPositionOperatingSessionReportReference = null;

  private String servicingPositionOperatingSessionReportType = null;

  private Object servicingPositionOperatingSessionStatistics = null;

  private String servicingPositionOperatingConfigurationParameter = null;

  private Object servicingPositionOperatingSessionReport = null;


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
   * @return servicingPositionOperatingSessionReportReference
  **/

  public String getServicingPositionOperatingSessionReportReference() {
    return servicingPositionOperatingSessionReportReference;
  }

  public void setServicingPositionOperatingSessionReportReference(String servicingPositionOperatingSessionReportReference) {
    this.servicingPositionOperatingSessionReportReference = servicingPositionOperatingSessionReportReference;
  }


  /**
   * Get servicingPositionOperatingSessionReportType
   * @return servicingPositionOperatingSessionReportType
  **/

  public String getServicingPositionOperatingSessionReportType() {
    return servicingPositionOperatingSessionReportType;
  }

  public void setServicingPositionOperatingSessionReportType(String servicingPositionOperatingSessionReportType) {
    this.servicingPositionOperatingSessionReportType = servicingPositionOperatingSessionReportType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return servicingPositionOperatingSessionStatistics
  **/

  public Object getServicingPositionOperatingSessionStatistics() {
    return servicingPositionOperatingSessionStatistics;
  }

  public void setServicingPositionOperatingSessionStatistics(Object servicingPositionOperatingSessionStatistics) {
    this.servicingPositionOperatingSessionStatistics = servicingPositionOperatingSessionStatistics;
  }


  /**
   * Get servicingPositionOperatingConfigurationParameter
   * @return servicingPositionOperatingConfigurationParameter
  **/

  public String getServicingPositionOperatingConfigurationParameter() {
    return servicingPositionOperatingConfigurationParameter;
  }

  public void setServicingPositionOperatingConfigurationParameter(String servicingPositionOperatingConfigurationParameter) {
    this.servicingPositionOperatingConfigurationParameter = servicingPositionOperatingConfigurationParameter;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return servicingPositionOperatingSessionReport
  **/

  public Object getServicingPositionOperatingSessionReport() {
    return servicingPositionOperatingSessionReport;
  }

  public void setServicingPositionOperatingSessionReport(Object servicingPositionOperatingSessionReport) {
    this.servicingPositionOperatingSessionReport = servicingPositionOperatingSessionReport;
  }


}

