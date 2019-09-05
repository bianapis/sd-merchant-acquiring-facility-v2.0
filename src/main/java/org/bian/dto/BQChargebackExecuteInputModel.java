package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQChargebackExecuteInputModelChargebackInstanceRecord;
import org.bian.dto.BQClearingExecuteInputModelExecuteRecordType;
import org.bian.dto.BQClearingExecuteInputModelMerchantAccountInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQChargebackExecuteInputModel
 */
public class BQChargebackExecuteInputModel   {
  private BQClearingExecuteInputModelMerchantAccountInstanceRecord merchantAccountInstanceRecord = null;

  private String merchantAcquiringFacilityFulfillmentArrangementInstanceReference = null;

  private String chargebackInstanceReference = null;

  private BQChargebackExecuteInputModelChargebackInstanceRecord chargebackInstanceRecord = null;

  private Object chargebackExecuteActionTaskRecord = null;

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

  public BQChargebackExecuteInputModelChargebackInstanceRecord getChargebackInstanceRecord() {
    return chargebackInstanceRecord;
  }

  public void setChargebackInstanceRecord(BQChargebackExecuteInputModelChargebackInstanceRecord chargebackInstanceRecord) {
    this.chargebackInstanceRecord = chargebackInstanceRecord;
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

