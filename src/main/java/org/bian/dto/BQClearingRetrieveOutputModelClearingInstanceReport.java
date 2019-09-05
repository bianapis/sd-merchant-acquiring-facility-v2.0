package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQClearingRetrieveOutputModelClearingInstanceReport
 */
public class BQClearingRetrieveOutputModelClearingInstanceReport   {
  private Object clearingInstanceReportRecord = null;

  private String clearingInstanceReportType = null;

  private String clearingInstanceReportParameters = null;

  private Object clearingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return clearingInstanceReportRecord
  **/

  public Object getClearingInstanceReportRecord() {
    return clearingInstanceReportRecord;
  }

  public void setClearingInstanceReportRecord(Object clearingInstanceReportRecord) {
    this.clearingInstanceReportRecord = clearingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return clearingInstanceReportType
  **/

  public String getClearingInstanceReportType() {
    return clearingInstanceReportType;
  }

  public void setClearingInstanceReportType(String clearingInstanceReportType) {
    this.clearingInstanceReportType = clearingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return clearingInstanceReportParameters
  **/

  public String getClearingInstanceReportParameters() {
    return clearingInstanceReportParameters;
  }

  public void setClearingInstanceReportParameters(String clearingInstanceReportParameters) {
    this.clearingInstanceReportParameters = clearingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return clearingInstanceReport
  **/

  public Object getClearingInstanceReport() {
    return clearingInstanceReport;
  }

  public void setClearingInstanceReport(Object clearingInstanceReport) {
    this.clearingInstanceReport = clearingInstanceReport;
  }


}

