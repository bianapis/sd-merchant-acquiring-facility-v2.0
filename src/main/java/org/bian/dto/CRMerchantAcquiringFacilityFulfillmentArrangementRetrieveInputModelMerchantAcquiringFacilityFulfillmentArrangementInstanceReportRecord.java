package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMerchantAcquiringFacilityFulfillmentArrangementRetrieveInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceReportRecord
 */
public class CRMerchantAcquiringFacilityFulfillmentArrangementRetrieveInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceReportRecord   {
  private String merchantAcquiringFacilityFulfillmentArrangementInstanceReportReference = null;

  private String merchantAcquiringFacilityFulfillmentArrangementInstanceReportType = null;

  private String merchantAcquiringFacilityFulfillmentArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return merchantAcquiringFacilityFulfillmentArrangementInstanceReportReference
  **/

  public String getMerchantAcquiringFacilityFulfillmentArrangementInstanceReportReference() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceReportReference;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceReportReference(String merchantAcquiringFacilityFulfillmentArrangementInstanceReportReference) {
    this.merchantAcquiringFacilityFulfillmentArrangementInstanceReportReference = merchantAcquiringFacilityFulfillmentArrangementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return merchantAcquiringFacilityFulfillmentArrangementInstanceReportType
  **/

  public String getMerchantAcquiringFacilityFulfillmentArrangementInstanceReportType() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceReportType;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceReportType(String merchantAcquiringFacilityFulfillmentArrangementInstanceReportType) {
    this.merchantAcquiringFacilityFulfillmentArrangementInstanceReportType = merchantAcquiringFacilityFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return merchantAcquiringFacilityFulfillmentArrangementInstanceReportParameters
  **/

  public String getMerchantAcquiringFacilityFulfillmentArrangementInstanceReportParameters() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceReportParameters;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceReportParameters(String merchantAcquiringFacilityFulfillmentArrangementInstanceReportParameters) {
    this.merchantAcquiringFacilityFulfillmentArrangementInstanceReportParameters = merchantAcquiringFacilityFulfillmentArrangementInstanceReportParameters;
  }


}

