package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQClearingRetrieveOutputModelClearingInstanceAnalysis
 */
public class BQClearingRetrieveOutputModelClearingInstanceAnalysis   {
  private Object clearingInstanceAnalysisRecord = null;

  private String clearingInstanceAnalysisReportType = null;

  private String clearingInstanceAnalysisParameters = null;

  private Object clearingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return clearingInstanceAnalysisRecord
  **/

  public Object getClearingInstanceAnalysisRecord() {
    return clearingInstanceAnalysisRecord;
  }

  public void setClearingInstanceAnalysisRecord(Object clearingInstanceAnalysisRecord) {
    this.clearingInstanceAnalysisRecord = clearingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return clearingInstanceAnalysisReportType
  **/

  public String getClearingInstanceAnalysisReportType() {
    return clearingInstanceAnalysisReportType;
  }

  public void setClearingInstanceAnalysisReportType(String clearingInstanceAnalysisReportType) {
    this.clearingInstanceAnalysisReportType = clearingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return clearingInstanceAnalysisParameters
  **/

  public String getClearingInstanceAnalysisParameters() {
    return clearingInstanceAnalysisParameters;
  }

  public void setClearingInstanceAnalysisParameters(String clearingInstanceAnalysisParameters) {
    this.clearingInstanceAnalysisParameters = clearingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return clearingInstanceAnalysisReport
  **/

  public Object getClearingInstanceAnalysisReport() {
    return clearingInstanceAnalysisReport;
  }

  public void setClearingInstanceAnalysisReport(Object clearingInstanceAnalysisReport) {
    this.clearingInstanceAnalysisReport = clearingInstanceAnalysisReport;
  }


}

