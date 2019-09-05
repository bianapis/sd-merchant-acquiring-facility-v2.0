package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingExecuteInputModelClearingInstanceRecord;
import org.bian.dto.BQClearingExecuteInputModelExecuteRecordType;
import org.bian.dto.BQClearingExecuteInputModelMerchantAccountInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQClearingExecuteInputModel
 */
public class BQClearingExecuteInputModel   {
  private BQClearingExecuteInputModelMerchantAccountInstanceRecord merchantAccountInstanceRecord = null;

  private String merchantAcquiringFacilityFulfillmentArrangementInstanceReference = null;

  private String clearingInstanceReference = null;

  private BQClearingExecuteInputModelClearingInstanceRecord clearingInstanceRecord = null;

  private Object clearingExecuteActionTaskRecord = null;

  private BQClearingExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * Get merchantAccountInstanceRecord
   * @return merchantAccountInstanceRecord
  **/

  public BQClearingExecuteInputModelMerchantAccountInstanceRecord getMerchantAccountInstanceRecord() {
    return merchantAccountInstanceRecord;
  }

  public void setMerchantAccountInstanceRecord(BQClearingExecuteInputModelMerchantAccountInstanceRecord merchantAccountInstanceRecord) {
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

  public BQClearingExecuteInputModelClearingInstanceRecord getClearingInstanceRecord() {
    return clearingInstanceRecord;
  }

  public void setClearingInstanceRecord(BQClearingExecuteInputModelClearingInstanceRecord clearingInstanceRecord) {
    this.clearingInstanceRecord = clearingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return clearingExecuteActionTaskRecord
  **/

  public Object getClearingExecuteActionTaskRecord() {
    return clearingExecuteActionTaskRecord;
  }

  public void setClearingExecuteActionTaskRecord(Object clearingExecuteActionTaskRecord) {
    this.clearingExecuteActionTaskRecord = clearingExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQClearingExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQClearingExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

