package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQChargebackExecuteOutputModelChargebackInstanceRecord;
import org.bian.dto.BQClearingExecuteOutputModelMerchantAccountInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQChargebackExecuteOutputModel
 */
public class BQChargebackExecuteOutputModel   {
  private BQClearingExecuteOutputModelMerchantAccountInstanceRecord merchantAccountInstanceRecord = null;

  private BQChargebackExecuteOutputModelChargebackInstanceRecord chargebackInstanceRecord = null;

  private String chargebackExecuteActionTaskReference = null;

  private Object chargebackExecuteActionTaskRecord = null;

  private String chargebackExecuteRecordReference = null;

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
   * Get chargebackInstanceRecord
   * @return chargebackInstanceRecord
  **/

  public BQChargebackExecuteOutputModelChargebackInstanceRecord getChargebackInstanceRecord() {
    return chargebackInstanceRecord;
  }

  public void setChargebackInstanceRecord(BQChargebackExecuteOutputModelChargebackInstanceRecord chargebackInstanceRecord) {
    this.chargebackInstanceRecord = chargebackInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Chargeback instance execute service call 
   * @return chargebackExecuteActionTaskReference
  **/

  public String getChargebackExecuteActionTaskReference() {
    return chargebackExecuteActionTaskReference;
  }

  public void setChargebackExecuteActionTaskReference(String chargebackExecuteActionTaskReference) {
    this.chargebackExecuteActionTaskReference = chargebackExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return chargebackExecuteActionTaskRecord
  **/

  public Object getChargebackExecuteActionTaskRecord() {
    return chargebackExecuteActionTaskRecord;
  }

  public void setChargebackExecuteActionTaskRecord(Object chargebackExecuteActionTaskRecord) {
    this.chargebackExecuteActionTaskRecord = chargebackExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Chargeback execute transaction/record 
   * @return chargebackExecuteRecordReference
  **/

  public String getChargebackExecuteRecordReference() {
    return chargebackExecuteRecordReference;
  }

  public void setChargebackExecuteRecordReference(String chargebackExecuteRecordReference) {
    this.chargebackExecuteRecordReference = chargebackExecuteRecordReference;
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

