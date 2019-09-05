package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMerchantAcquiringFacilityFulfillmentArrangementControlInputModelMerchantAcquiringFacilityFulfillmentArrangementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRMerchantAcquiringFacilityFulfillmentArrangementControlInputModel
 */
public class CRMerchantAcquiringFacilityFulfillmentArrangementControlInputModel   {
  private String merchantAcquiringFacilityServicingSessionReference = null;

  private String merchantAcquiringFacilityFulfillmentArrangementInstanceReference = null;

  private Object merchantAcquiringFacilityFulfillmentArrangementControlActionTaskRecord = null;

  private CRMerchantAcquiringFacilityFulfillmentArrangementControlInputModelMerchantAcquiringFacilityFulfillmentArrangementControlActionRequest merchantAcquiringFacilityFulfillmentArrangementControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return merchantAcquiringFacilityServicingSessionReference
  **/

  public String getMerchantAcquiringFacilityServicingSessionReference() {
    return merchantAcquiringFacilityServicingSessionReference;
  }

  public void setMerchantAcquiringFacilityServicingSessionReference(String merchantAcquiringFacilityServicingSessionReference) {
    this.merchantAcquiringFacilityServicingSessionReference = merchantAcquiringFacilityServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Merchant Acquiring Facility Fulfillment Arrangement instance 
   * @return merchantAcquiringFacilityFulfillmentArrangementInstanceReference
  **/

  public String getMerchantAcquiringFacilityFulfillmentArrangementInstanceReference() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceReference;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceReference(String merchantAcquiringFacilityFulfillmentArrangementInstanceReference) {
    this.merchantAcquiringFacilityFulfillmentArrangementInstanceReference = merchantAcquiringFacilityFulfillmentArrangementInstanceReference;
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
   * Get merchantAcquiringFacilityFulfillmentArrangementControlActionRequest
   * @return merchantAcquiringFacilityFulfillmentArrangementControlActionRequest
  **/

  public CRMerchantAcquiringFacilityFulfillmentArrangementControlInputModelMerchantAcquiringFacilityFulfillmentArrangementControlActionRequest getMerchantAcquiringFacilityFulfillmentArrangementControlActionRequest() {
    return merchantAcquiringFacilityFulfillmentArrangementControlActionRequest;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementControlActionRequest(CRMerchantAcquiringFacilityFulfillmentArrangementControlInputModelMerchantAcquiringFacilityFulfillmentArrangementControlActionRequest merchantAcquiringFacilityFulfillmentArrangementControlActionRequest) {
    this.merchantAcquiringFacilityFulfillmentArrangementControlActionRequest = merchantAcquiringFacilityFulfillmentArrangementControlActionRequest;
  }


}

