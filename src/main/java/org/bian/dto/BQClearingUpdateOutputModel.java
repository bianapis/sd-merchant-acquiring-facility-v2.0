package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingUpdateInputModelClearingInstanceRecord;
import org.bian.dto.BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQClearingUpdateOutputModel
 */
public class BQClearingUpdateOutputModel   {
  private BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecord merchantAccountInstanceRecord = null;

  private BQClearingUpdateInputModelClearingInstanceRecord clearingInstanceRecord = null;

  private String clearingUpdateActionTaskReference = null;

  private Object clearingUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return clearingUpdateActionTaskReference
  **/

  public String getClearingUpdateActionTaskReference() {
    return clearingUpdateActionTaskReference;
  }

  public void setClearingUpdateActionTaskReference(String clearingUpdateActionTaskReference) {
    this.clearingUpdateActionTaskReference = clearingUpdateActionTaskReference;
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

