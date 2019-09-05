package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQChargebackUpdateInputModelChargebackInstanceRecord;
import org.bian.dto.BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQChargebackUpdateInputModel
 */
public class BQChargebackUpdateInputModel   {
  private BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecord merchantAccountInstanceRecord = null;

  private String merchantAcquiringFacilityFulfillmentArrangementInstanceReference = null;

  private String chargebackInstanceReference = null;

  private BQChargebackUpdateInputModelChargebackInstanceRecord chargebackInstanceRecord = null;

  private Object chargebackUpdateActionTaskRecord = null;

  private String chargebackUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Chargeback instance 
   * @return chargebackInstanceReference
  **/

  public String getChargebackInstanceReference() {
    return chargebackInstanceReference;
  }

  public void setChargebackInstanceReference(String chargebackInstanceReference) {
    this.chargebackInstanceReference = chargebackInstanceReference;
  }


  /**
   * Get chargebackInstanceRecord
   * @return chargebackInstanceRecord
  **/

  public BQChargebackUpdateInputModelChargebackInstanceRecord getChargebackInstanceRecord() {
    return chargebackInstanceRecord;
  }

  public void setChargebackInstanceRecord(BQChargebackUpdateInputModelChargebackInstanceRecord chargebackInstanceRecord) {
    this.chargebackInstanceRecord = chargebackInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return chargebackUpdateActionTaskRecord
  **/

  public Object getChargebackUpdateActionTaskRecord() {
    return chargebackUpdateActionTaskRecord;
  }

  public void setChargebackUpdateActionTaskRecord(Object chargebackUpdateActionTaskRecord) {
    this.chargebackUpdateActionTaskRecord = chargebackUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return chargebackUpdateActionRequest
  **/

  public String getChargebackUpdateActionRequest() {
    return chargebackUpdateActionRequest;
  }

  public void setChargebackUpdateActionRequest(String chargebackUpdateActionRequest) {
    this.chargebackUpdateActionRequest = chargebackUpdateActionRequest;
  }


}

