package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceReport
 */
public class BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceReport   {
  private Object merchantAccountInstanceReportRecord = null;

  private String merchantAccountInstanceReportType = null;

  private String merchantAccountInstanceReportParameters = null;

  private Object merchantAccountInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return merchantAccountInstanceReportRecord
  **/

  public Object getMerchantAccountInstanceReportRecord() {
    return merchantAccountInstanceReportRecord;
  }

  public void setMerchantAccountInstanceReportRecord(Object merchantAccountInstanceReportRecord) {
    this.merchantAccountInstanceReportRecord = merchantAccountInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return merchantAccountInstanceReportType
  **/

  public String getMerchantAccountInstanceReportType() {
    return merchantAccountInstanceReportType;
  }

  public void setMerchantAccountInstanceReportType(String merchantAccountInstanceReportType) {
    this.merchantAccountInstanceReportType = merchantAccountInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return merchantAccountInstanceReportParameters
  **/

  public String getMerchantAccountInstanceReportParameters() {
    return merchantAccountInstanceReportParameters;
  }

  public void setMerchantAccountInstanceReportParameters(String merchantAccountInstanceReportParameters) {
    this.merchantAccountInstanceReportParameters = merchantAccountInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return merchantAccountInstanceReport
  **/

  public Object getMerchantAccountInstanceReport() {
    return merchantAccountInstanceReport;
  }

  public void setMerchantAccountInstanceReport(Object merchantAccountInstanceReport) {
    this.merchantAccountInstanceReport = merchantAccountInstanceReport;
  }


}

