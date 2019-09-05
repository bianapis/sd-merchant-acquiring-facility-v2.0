package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMerchantAcquiringFacilityFulfillmentArrangementRetrieveInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceAnalysis
 */
public class CRMerchantAcquiringFacilityFulfillmentArrangementRetrieveInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceAnalysis   {
  private String merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReference = null;

  private String merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReportType = null;

  private String merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReference
  **/

  public String getMerchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReference() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReference;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReference(String merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReference) {
    this.merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReference = merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisParameters
  **/

  public String getMerchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisParameters() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisParameters;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisParameters(String merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisParameters) {
    this.merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisParameters = merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysisParameters;
  }


}

