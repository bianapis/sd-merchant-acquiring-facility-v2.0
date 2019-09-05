package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSettlementRetrieveOutputModelSettlementInstanceAnalysis
 */
public class BQSettlementRetrieveOutputModelSettlementInstanceAnalysis   {
  private Object settlementInstanceAnalysisRecord = null;

  private String settlementInstanceAnalysisReportType = null;

  private String settlementInstanceAnalysisParameters = null;

  private Object settlementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return settlementInstanceAnalysisRecord
  **/

  public Object getSettlementInstanceAnalysisRecord() {
    return settlementInstanceAnalysisRecord;
  }

  public void setSettlementInstanceAnalysisRecord(Object settlementInstanceAnalysisRecord) {
    this.settlementInstanceAnalysisRecord = settlementInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return settlementInstanceAnalysisReportType
  **/

  public String getSettlementInstanceAnalysisReportType() {
    return settlementInstanceAnalysisReportType;
  }

  public void setSettlementInstanceAnalysisReportType(String settlementInstanceAnalysisReportType) {
    this.settlementInstanceAnalysisReportType = settlementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return settlementInstanceAnalysisParameters
  **/

  public String getSettlementInstanceAnalysisParameters() {
    return settlementInstanceAnalysisParameters;
  }

  public void setSettlementInstanceAnalysisParameters(String settlementInstanceAnalysisParameters) {
    this.settlementInstanceAnalysisParameters = settlementInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return settlementInstanceAnalysisReport
  **/

  public Object getSettlementInstanceAnalysisReport() {
    return settlementInstanceAnalysisReport;
  }

  public void setSettlementInstanceAnalysisReport(Object settlementInstanceAnalysisReport) {
    this.settlementInstanceAnalysisReport = settlementInstanceAnalysisReport;
  }


}

