package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingExecuteOutputModelClearingInstanceRecord;
import org.bian.dto.BQClearingExecuteOutputModelMerchantAccountInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQClearingExecuteOutputModel
 */
public class BQClearingExecuteOutputModel   {
  private BQClearingExecuteOutputModelMerchantAccountInstanceRecord merchantAccountInstanceRecord = null;

  private BQClearingExecuteOutputModelClearingInstanceRecord clearingInstanceRecord = null;

  private String clearingExecuteActionTaskReference = null;

  private Object clearingExecuteActionTaskRecord = null;

  private String clearingExecuteRecordReference = null;

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
   * Get clearingInstanceRecord
   * @return clearingInstanceRecord
  **/

  public BQClearingExecuteOutputModelClearingInstanceRecord getClearingInstanceRecord() {
    return clearingInstanceRecord;
  }

  public void setClearingInstanceRecord(BQClearingExecuteOutputModelClearingInstanceRecord clearingInstanceRecord) {
    this.clearingInstanceRecord = clearingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Clearing instance execute service call 
   * @return clearingExecuteActionTaskReference
  **/

  public String getClearingExecuteActionTaskReference() {
    return clearingExecuteActionTaskReference;
  }

  public void setClearingExecuteActionTaskReference(String clearingExecuteActionTaskReference) {
    this.clearingExecuteActionTaskReference = clearingExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Clearing execute transaction/record 
   * @return clearingExecuteRecordReference
  **/

  public String getClearingExecuteRecordReference() {
    return clearingExecuteRecordReference;
  }

  public void setClearingExecuteRecordReference(String clearingExecuteRecordReference) {
    this.clearingExecuteRecordReference = clearingExecuteRecordReference;
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

