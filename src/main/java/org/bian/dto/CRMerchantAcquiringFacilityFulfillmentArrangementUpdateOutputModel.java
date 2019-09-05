package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMerchantAcquiringFacilityFulfillmentArrangementUpdateInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRMerchantAcquiringFacilityFulfillmentArrangementUpdateOutputModel
 */
public class CRMerchantAcquiringFacilityFulfillmentArrangementUpdateOutputModel   {
  private CRMerchantAcquiringFacilityFulfillmentArrangementUpdateInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord merchantAcquiringFacilityFulfillmentArrangementInstanceRecord = null;

  private String merchantAcquiringFacilityFulfillmentArrangementUpdateActionTaskReference = null;

  private Object merchantAcquiringFacilityFulfillmentArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return merchantAcquiringFacilityFulfillmentArrangementUpdateActionTaskReference
  **/

  public String getMerchantAcquiringFacilityFulfillmentArrangementUpdateActionTaskReference() {
    return merchantAcquiringFacilityFulfillmentArrangementUpdateActionTaskReference;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementUpdateActionTaskReference(String merchantAcquiringFacilityFulfillmentArrangementUpdateActionTaskReference) {
    this.merchantAcquiringFacilityFulfillmentArrangementUpdateActionTaskReference = merchantAcquiringFacilityFulfillmentArrangementUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

