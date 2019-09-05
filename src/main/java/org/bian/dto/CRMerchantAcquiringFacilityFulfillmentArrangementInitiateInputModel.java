package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMerchantAcquiringFacilityFulfillmentArrangementInitiateInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRMerchantAcquiringFacilityFulfillmentArrangementInitiateInputModel
 */
public class CRMerchantAcquiringFacilityFulfillmentArrangementInitiateInputModel   {
  private String merchantAcquiringFacilityServicingSessionReference = null;

  private Object merchantAcquiringFacilityFulfillmentArrangementInitiateActionRecord = null;

  private String merchantAcquiringFacilityFulfillmentArrangementInstanceStatus = null;

  private CRMerchantAcquiringFacilityFulfillmentArrangementInitiateInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord merchantAcquiringFacilityFulfillmentArrangementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return merchantAcquiringFacilityFulfillmentArrangementInitiateActionRecord
  **/

  public Object getMerchantAcquiringFacilityFulfillmentArrangementInitiateActionRecord() {
    return merchantAcquiringFacilityFulfillmentArrangementInitiateActionRecord;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInitiateActionRecord(Object merchantAcquiringFacilityFulfillmentArrangementInitiateActionRecord) {
    this.merchantAcquiringFacilityFulfillmentArrangementInitiateActionRecord = merchantAcquiringFacilityFulfillmentArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Merchant Acquiring Facility Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return merchantAcquiringFacilityFulfillmentArrangementInstanceStatus
  **/

  public String getMerchantAcquiringFacilityFulfillmentArrangementInstanceStatus() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceStatus;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceStatus(String merchantAcquiringFacilityFulfillmentArrangementInstanceStatus) {
    this.merchantAcquiringFacilityFulfillmentArrangementInstanceStatus = merchantAcquiringFacilityFulfillmentArrangementInstanceStatus;
  }


  /**
   * Get merchantAcquiringFacilityFulfillmentArrangementInstanceRecord
   * @return merchantAcquiringFacilityFulfillmentArrangementInstanceRecord
  **/

  public CRMerchantAcquiringFacilityFulfillmentArrangementInitiateInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord getMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceRecord;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord(CRMerchantAcquiringFacilityFulfillmentArrangementInitiateInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord merchantAcquiringFacilityFulfillmentArrangementInstanceRecord) {
    this.merchantAcquiringFacilityFulfillmentArrangementInstanceRecord = merchantAcquiringFacilityFulfillmentArrangementInstanceRecord;
  }


}

