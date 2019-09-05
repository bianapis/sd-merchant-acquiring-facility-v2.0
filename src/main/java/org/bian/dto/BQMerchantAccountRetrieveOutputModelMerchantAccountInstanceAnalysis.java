package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceAnalysis
 */
public class BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceAnalysis   {
  private Object merchantAccountInstanceAnalysisRecord = null;

  private String merchantAccountInstanceAnalysisReportType = null;

  private String merchantAccountInstanceAnalysisParameters = null;

  private Object merchantAccountInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return merchantAccountInstanceAnalysisRecord
  **/

  public Object getMerchantAccountInstanceAnalysisRecord() {
    return merchantAccountInstanceAnalysisRecord;
  }

  public void setMerchantAccountInstanceAnalysisRecord(Object merchantAccountInstanceAnalysisRecord) {
    this.merchantAccountInstanceAnalysisRecord = merchantAccountInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return merchantAccountInstanceAnalysisReportType
  **/

  public String getMerchantAccountInstanceAnalysisReportType() {
    return merchantAccountInstanceAnalysisReportType;
  }

  public void setMerchantAccountInstanceAnalysisReportType(String merchantAccountInstanceAnalysisReportType) {
    this.merchantAccountInstanceAnalysisReportType = merchantAccountInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return merchantAccountInstanceAnalysisParameters
  **/

  public String getMerchantAccountInstanceAnalysisParameters() {
    return merchantAccountInstanceAnalysisParameters;
  }

  public void setMerchantAccountInstanceAnalysisParameters(String merchantAccountInstanceAnalysisParameters) {
    this.merchantAccountInstanceAnalysisParameters = merchantAccountInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return merchantAccountInstanceAnalysisReport
  **/

  public Object getMerchantAccountInstanceAnalysisReport() {
    return merchantAccountInstanceAnalysisReport;
  }

  public void setMerchantAccountInstanceAnalysisReport(Object merchantAccountInstanceAnalysisReport) {
    this.merchantAccountInstanceAnalysisReport = merchantAccountInstanceAnalysisReport;
  }


}

