package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMerchantAcquiringFacilityFulfillmentArrangementUpdateInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRMerchantAcquiringFacilityFulfillmentArrangementUpdateInputModel
 */
public class CRMerchantAcquiringFacilityFulfillmentArrangementUpdateInputModel   {
  private String merchantAcquiringFacilityServicingSessionReference = null;

  private String merchantAcquiringFacilityFulfillmentArrangementInstanceReference = null;

  private CRMerchantAcquiringFacilityFulfillmentArrangementUpdateInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord merchantAcquiringFacilityFulfillmentArrangementInstanceRecord = null;

  private Object merchantAcquiringFacilityFulfillmentArrangementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get merchantAcquiringFacilityFulfillmentArrangementInstanceRecord
   * @return merchantAcquiringFacilityFulfillmentArrangementInstanceRecord
  **/

  public CRMerchantAcquiringFacilityFulfillmentArrangementUpdateInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord getMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceRecord;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord(CRMerchantAcquiringFacilityFulfillmentArrangementUpdateInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord merchantAcquiringFacilityFulfillmentArrangementInstanceRecord) {
    this.merchantAcquiringFacilityFulfillmentArrangementInstanceRecord = merchantAcquiringFacilityFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return merchantAcquiringFacilityFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getMerchantAcquiringFacilityFulfillmentArrangementUpdateActionTaskRecord() {
    return merchantAcquiringFacilityFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementUpdateActionTaskRecord(Object merchantAcquiringFacilityFulfillmentArrangementUpdateActionTaskRecord) {
    this.merchantAcquiringFacilityFulfillmentArrangementUpdateActionTaskRecord = merchantAcquiringFacilityFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

