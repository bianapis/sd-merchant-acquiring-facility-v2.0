package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMerchantAcquiringFacilityFulfillmentArrangementRetrieveOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceAnalysis
 */
public class CRMerchantAcquiringFacilityFulfillmentArrangementRetrieveOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceAnalysis   {
  private String merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisData = null;

  private String merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReportType = null;

  private Object merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisData
  **/

  public String getMerchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisData() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisData;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisData(String merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisData) {
    this.merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisData = merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReportType
  **/

  public String getMerchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReportType() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReportType(String merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReportType) {
    this.merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReportType = merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReport
  **/

  public Object getMerchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReport() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReport;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReport(Object merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReport) {
    this.merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReport = merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReport;
  }


}

