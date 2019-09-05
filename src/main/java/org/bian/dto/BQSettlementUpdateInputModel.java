package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecord;
import org.bian.dto.BQSettlementUpdateInputModelSettlementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSettlementUpdateInputModel
 */
public class BQSettlementUpdateInputModel   {
  private BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecord merchantAccountInstanceRecord = null;

  private String merchantAcquiringFacilityFulfillmentArrangementInstanceReference = null;

  private String settlementInstanceReference = null;

  private BQSettlementUpdateInputModelSettlementInstanceRecord settlementInstanceRecord = null;

  private Object settlementUpdateActionTaskRecord = null;

  private String settlementUpdateActionRequest = null;


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

  public BQSettlementUpdateInputModelSettlementInstanceRecord getSettlementInstanceRecord() {
    return settlementInstanceRecord;
  }

  public void setSettlementInstanceRecord(BQSettlementUpdateInputModelSettlementInstanceRecord settlementInstanceRecord) {
    this.settlementInstanceRecord = settlementInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return settlementUpdateActionRequest
  **/

  public String getSettlementUpdateActionRequest() {
    return settlementUpdateActionRequest;
  }

  public void setSettlementUpdateActionRequest(String settlementUpdateActionRequest) {
    this.settlementUpdateActionRequest = settlementUpdateActionRequest;
  }


}

