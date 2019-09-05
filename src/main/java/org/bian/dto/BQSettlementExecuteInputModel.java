package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingExecuteInputModelExecuteRecordType;
import org.bian.dto.BQClearingExecuteInputModelMerchantAccountInstanceRecord;
import org.bian.dto.BQSettlementExecuteInputModelSettlementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSettlementExecuteInputModel
 */
public class BQSettlementExecuteInputModel   {
  private BQClearingExecuteInputModelMerchantAccountInstanceRecord merchantAccountInstanceRecord = null;

  private String merchantAcquiringFacilityFulfillmentArrangementInstanceReference = null;

  private String settlementInstanceReference = null;

  private BQSettlementExecuteInputModelSettlementInstanceRecord settlementInstanceRecord = null;

  private Object settlementExecuteActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Settlement instance 
   * @return settlementInstanceReference
  **/

  public String getSettlementInstanceReference() {
    return settlementInstanceReference;
  }

  public void setSettlementInstanceReference(String settlementInstanceReference) {
    this.settlementInstanceReference = settlementInstanceReference;
  }


  /**
   * Get settlementInstanceRecord
   * @return settlementInstanceRecord
  **/

  public BQSettlementExecuteInputModelSettlementInstanceRecord getSettlementInstanceRecord() {
    return settlementInstanceRecord;
  }

  public void setSettlementInstanceRecord(BQSettlementExecuteInputModelSettlementInstanceRecord settlementInstanceRecord) {
    this.settlementInstanceRecord = settlementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return settlementExecuteActionTaskRecord
  **/

  public Object getSettlementExecuteActionTaskRecord() {
    return settlementExecuteActionTaskRecord;
  }

  public void setSettlementExecuteActionTaskRecord(Object settlementExecuteActionTaskRecord) {
    this.settlementExecuteActionTaskRecord = settlementExecuteActionTaskRecord;
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

