package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMerchantAcquiringFacilityFulfillmentArrangementRequestInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRMerchantAcquiringFacilityFulfillmentArrangementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRMerchantAcquiringFacilityFulfillmentArrangementRequestInputModel
 */
public class CRMerchantAcquiringFacilityFulfillmentArrangementRequestInputModel   {
  private String merchantAcquiringFacilityServicingSessionReference = null;

  private String merchantAcquiringFacilityFulfillmentArrangementInstanceReference = null;

  private CRMerchantAcquiringFacilityFulfillmentArrangementRequestInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord merchantAcquiringFacilityFulfillmentArrangementInstanceRecord = null;

  private Object merchantAcquiringFacilityFulfillmentArrangementRequestActionTaskRecord = null;

  private CRMerchantAcquiringFacilityFulfillmentArrangementRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRMerchantAcquiringFacilityFulfillmentArrangementRequestInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord getMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceRecord;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord(CRMerchantAcquiringFacilityFulfillmentArrangementRequestInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord merchantAcquiringFacilityFulfillmentArrangementInstanceRecord) {
    this.merchantAcquiringFacilityFulfillmentArrangementInstanceRecord = merchantAcquiringFacilityFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return merchantAcquiringFacilityFulfillmentArrangementRequestActionTaskRecord
  **/

  public Object getMerchantAcquiringFacilityFulfillmentArrangementRequestActionTaskRecord() {
    return merchantAcquiringFacilityFulfillmentArrangementRequestActionTaskRecord;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementRequestActionTaskRecord(Object merchantAcquiringFacilityFulfillmentArrangementRequestActionTaskRecord) {
    this.merchantAcquiringFacilityFulfillmentArrangementRequestActionTaskRecord = merchantAcquiringFacilityFulfillmentArrangementRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRMerchantAcquiringFacilityFulfillmentArrangementRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRMerchantAcquiringFacilityFulfillmentArrangementRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

