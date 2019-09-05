package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingUpdateInputModelClearingInstanceRecord;
import org.bian.dto.BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQClearingUpdateInputModel
 */
public class BQClearingUpdateInputModel   {
  private BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecord merchantAccountInstanceRecord = null;

  private String merchantAcquiringFacilityFulfillmentArrangementInstanceReference = null;

  private String clearingInstanceReference = null;

  private BQClearingUpdateInputModelClearingInstanceRecord clearingInstanceRecord = null;

  private Object clearingUpdateActionTaskRecord = null;

  private String clearingUpdateActionRequest = null;


  /**
   * Get merchantAccountInstanceRecord
   * @return merchantAccountInstanceRecord
  **/

  public BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecord getMerchantAccountInstanceRecord() {
    return merchantAccountInstanceRecord;
  }

  public void setMerchantAccountInstanceRecord(BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecord merchantAccountInstanceRecord) {
    this.merchantAccountInstanceRecord = merchantAccountInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Merchant Acquiring Facility Fulfillment Arrangement instance 
   * @return merchantAcquiringFacilityFulfillmentArrangementInstanceReference
  **/

  public String getMerchantAcquiringFacilityFulfillmentArrangementInstanceReference() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceReference;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceReference(String merchantAcquiringFacilityFulfillmentArrangementInstanceReference) {
    this.merchantAcquiringFacilityFulfillmentArrangementInstanceReference = merchantAcquiringFacilityFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Clearing instance 
   * @return clearingInstanceReference
  **/

  public String getClearingInstanceReference() {
    return clearingInstanceReference;
  }

  public void setClearingInstanceReference(String clearingInstanceReference) {
    this.clearingInstanceReference = clearingInstanceReference;
  }


  /**
   * Get clearingInstanceRecord
   * @return clearingInstanceRecord
  **/

  public BQClearingUpdateInputModelClearingInstanceRecord getClearingInstanceRecord() {
    return clearingInstanceRecord;
  }

  public void setClearingInstanceRecord(BQClearingUpdateInputModelClearingInstanceRecord clearingInstanceRecord) {
    this.clearingInstanceRecord = clearingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return clearingUpdateActionTaskRecord
  **/

  public Object getClearingUpdateActionTaskRecord() {
    return clearingUpdateActionTaskRecord;
  }

  public void setClearingUpdateActionTaskRecord(Object clearingUpdateActionTaskRecord) {
    this.clearingUpdateActionTaskRecord = clearingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return clearingUpdateActionRequest
  **/

  public String getClearingUpdateActionRequest() {
    return clearingUpdateActionRequest;
  }

  public void setClearingUpdateActionRequest(String clearingUpdateActionRequest) {
    this.clearingUpdateActionRequest = clearingUpdateActionRequest;
  }


}

