package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecord;
import org.bian.dto.BQSettlementUpdateInputModelSettlementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSettlementUpdateOutputModel
 */
public class BQSettlementUpdateOutputModel   {
  private BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecord merchantAccountInstanceRecord = null;

  private BQSettlementUpdateInputModelSettlementInstanceRecord settlementInstanceRecord = null;

  private String settlementUpdateActionTaskReference = null;

  private Object settlementUpdateActionTaskRecord = null;

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
   * Get settlementInstanceRecord
   * @return settlementInstanceRecord
  **/

  public BQSettlementUpdateInputModelSettlementInstanceRecord getSettlementInstanceRecord() {
    return settlementInstanceRecord;
  }

  public void setSettlementInstanceRecord(BQSettlementUpdateInputModelSettlementInstanceRecord settlementInstanceRecord) {
    this.settlementInstanceRecord = settlementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return settlementUpdateActionTaskReference
  **/

  public String getSettlementUpdateActionTaskReference() {
    return settlementUpdateActionTaskReference;
  }

  public void setSettlementUpdateActionTaskReference(String settlementUpdateActionTaskReference) {
    this.settlementUpdateActionTaskReference = settlementUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return settlementUpdateActionTaskRecord
  **/

  public Object getSettlementUpdateActionTaskRecord() {
    return settlementUpdateActionTaskRecord;
  }

  public void setSettlementUpdateActionTaskRecord(Object settlementUpdateActionTaskRecord) {
    this.settlementUpdateActionTaskRecord = settlementUpdateActionTaskRecord;
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

