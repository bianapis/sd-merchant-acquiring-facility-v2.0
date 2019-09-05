package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMerchantAcquiringFacilityFulfillmentArrangementControlOutputModel
 */
public class CRMerchantAcquiringFacilityFulfillmentArrangementControlOutputModel   {
  private String merchantAcquiringFacilityFulfillmentArrangementControlActionTaskReference = null;

  private Object merchantAcquiringFacilityFulfillmentArrangementControlActionTaskRecord = null;

  private String merchantAcquiringFacilityFulfillmentArrangementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Merchant Acquiring Facility Fulfillment Arrangement instance control processing service call 
   * @return merchantAcquiringFacilityFulfillmentArrangementControlActionTaskReference
  **/

  public String getMerchantAcquiringFacilityFulfillmentArrangementControlActionTaskReference() {
    return merchantAcquiringFacilityFulfillmentArrangementControlActionTaskReference;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementControlActionTaskReference(String merchantAcquiringFacilityFulfillmentArrangementControlActionTaskReference) {
    this.merchantAcquiringFacilityFulfillmentArrangementControlActionTaskReference = merchantAcquiringFacilityFulfillmentArrangementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return merchantAcquiringFacilityFulfillmentArrangementControlActionTaskRecord
  **/

  public Object getMerchantAcquiringFacilityFulfillmentArrangementControlActionTaskRecord() {
    return merchantAcquiringFacilityFulfillmentArrangementControlActionTaskRecord;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementControlActionTaskRecord(Object merchantAcquiringFacilityFulfillmentArrangementControlActionTaskRecord) {
    this.merchantAcquiringFacilityFulfillmentArrangementControlActionTaskRecord = merchantAcquiringFacilityFulfillmentArrangementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return merchantAcquiringFacilityFulfillmentArrangementControlActionResponse
  **/

  public String getMerchantAcquiringFacilityFulfillmentArrangementControlActionResponse() {
    return merchantAcquiringFacilityFulfillmentArrangementControlActionResponse;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementControlActionResponse(String merchantAcquiringFacilityFulfillmentArrangementControlActionResponse) {
    this.merchantAcquiringFacilityFulfillmentArrangementControlActionResponse = merchantAcquiringFacilityFulfillmentArrangementControlActionResponse;
  }


}

