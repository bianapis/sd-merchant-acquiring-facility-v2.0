package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMerchantAcquiringFacilityFulfillmentArrangementInitiateOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRMerchantAcquiringFacilityFulfillmentArrangementInitiateOutputModel
 */
public class CRMerchantAcquiringFacilityFulfillmentArrangementInitiateOutputModel   {
  private String merchantAcquiringFacilityFulfillmentArrangementInstanceReference = null;

  private String merchantAcquiringFacilityFulfillmentArrangementInitiateActionReference = null;

  private Object merchantAcquiringFacilityFulfillmentArrangementInitiateActionRecord = null;

  private String merchantAcquiringFacilityFulfillmentArrangementInstanceStatus = null;

  private CRMerchantAcquiringFacilityFulfillmentArrangementInitiateOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord merchantAcquiringFacilityFulfillmentArrangementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return merchantAcquiringFacilityFulfillmentArrangementInitiateActionReference
  **/

  public String getMerchantAcquiringFacilityFulfillmentArrangementInitiateActionReference() {
    return merchantAcquiringFacilityFulfillmentArrangementInitiateActionReference;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInitiateActionReference(String merchantAcquiringFacilityFulfillmentArrangementInitiateActionReference) {
    this.merchantAcquiringFacilityFulfillmentArrangementInitiateActionReference = merchantAcquiringFacilityFulfillmentArrangementInitiateActionReference;
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

  public CRMerchantAcquiringFacilityFulfillmentArrangementInitiateOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord getMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceRecord;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord(CRMerchantAcquiringFacilityFulfillmentArrangementInitiateOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord merchantAcquiringFacilityFulfillmentArrangementInstanceRecord) {
    this.merchantAcquiringFacilityFulfillmentArrangementInstanceRecord = merchantAcquiringFacilityFulfillmentArrangementInstanceRecord;
  }


}

