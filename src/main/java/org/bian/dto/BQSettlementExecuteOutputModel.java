package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingExecuteOutputModelMerchantAccountInstanceRecord;
import org.bian.dto.BQSettlementExecuteInputModelSettlementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSettlementExecuteOutputModel
 */
public class BQSettlementExecuteOutputModel   {
  private BQClearingExecuteOutputModelMerchantAccountInstanceRecord merchantAccountInstanceRecord = null;

  private BQSettlementExecuteInputModelSettlementInstanceRecord settlementInstanceRecord = null;

  private String settlementExecuteActionTaskReference = null;

  private Object settlementExecuteActionTaskRecord = null;

  private String settlementExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get merchantAccountInstanceRecord
   * @return merchantAccountInstanceRecord
  **/

  public BQClearingExecuteOutputModelMerchantAccountInstanceRecord getMerchantAccountInstanceRecord() {
    return merchantAccountInstanceRecord;
  }

  public void setMerchantAccountInstanceRecord(BQClearingExecuteOutputModelMerchantAccountInstanceRecord merchantAccountInstanceRecord) {
    this.merchantAccountInstanceRecord = merchantAccountInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Settlement instance execute service call 
   * @return settlementExecuteActionTaskReference
  **/

  public String getSettlementExecuteActionTaskReference() {
    return settlementExecuteActionTaskReference;
  }

  public void setSettlementExecuteActionTaskReference(String settlementExecuteActionTaskReference) {
    this.settlementExecuteActionTaskReference = settlementExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Settlement execute transaction/record 
   * @return settlementExecuteRecordReference
  **/

  public String getSettlementExecuteRecordReference() {
    return settlementExecuteRecordReference;
  }

  public void setSettlementExecuteRecordReference(String settlementExecuteRecordReference) {
    this.settlementExecuteRecordReference = settlementExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

