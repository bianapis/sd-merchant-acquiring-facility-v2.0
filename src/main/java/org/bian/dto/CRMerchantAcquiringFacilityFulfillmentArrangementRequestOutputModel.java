package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMerchantAcquiringFacilityFulfillmentArrangementRequestOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRMerchantAcquiringFacilityFulfillmentArrangementRequestOutputModel
 */
public class CRMerchantAcquiringFacilityFulfillmentArrangementRequestOutputModel   {
  private CRMerchantAcquiringFacilityFulfillmentArrangementRequestOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord merchantAcquiringFacilityFulfillmentArrangementInstanceRecord = null;

  private String merchantAcquiringFacilityFulfillmentArrangementRequestActionTaskReference = null;

  private Object merchantAcquiringFacilityFulfillmentArrangementRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get merchantAcquiringFacilityFulfillmentArrangementInstanceRecord
   * @return merchantAcquiringFacilityFulfillmentArrangementInstanceRecord
  **/

  public CRMerchantAcquiringFacilityFulfillmentArrangementRequestOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord getMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceRecord;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord(CRMerchantAcquiringFacilityFulfillmentArrangementRequestOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord merchantAcquiringFacilityFulfillmentArrangementInstanceRecord) {
    this.merchantAcquiringFacilityFulfillmentArrangementInstanceRecord = merchantAcquiringFacilityFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Merchant Acquiring Facility Fulfillment Arrangement instance request service call 
   * @return merchantAcquiringFacilityFulfillmentArrangementRequestActionTaskReference
  **/

  public String getMerchantAcquiringFacilityFulfillmentArrangementRequestActionTaskReference() {
    return merchantAcquiringFacilityFulfillmentArrangementRequestActionTaskReference;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementRequestActionTaskReference(String merchantAcquiringFacilityFulfillmentArrangementRequestActionTaskReference) {
    this.merchantAcquiringFacilityFulfillmentArrangementRequestActionTaskReference = merchantAcquiringFacilityFulfillmentArrangementRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

