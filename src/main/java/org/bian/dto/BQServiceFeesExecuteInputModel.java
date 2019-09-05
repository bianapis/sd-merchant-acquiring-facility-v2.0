package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingExecuteInputModelExecuteRecordType;
import org.bian.dto.BQClearingExecuteInputModelMerchantAccountInstanceRecord;
import org.bian.dto.BQServiceFeesExecuteInputModelServiceFeesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExecuteInputModel
 */
public class BQServiceFeesExecuteInputModel   {
  private BQClearingExecuteInputModelMerchantAccountInstanceRecord merchantAccountInstanceRecord = null;

  private String merchantAcquiringFacilityFulfillmentArrangementInstanceReference = null;

  private String serviceFeesInstanceReference = null;

  private BQServiceFeesExecuteInputModelServiceFeesInstanceRecord serviceFeesInstanceRecord = null;

  private Object serviceFeesExecuteActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Service Fees instance 
   * @return serviceFeesInstanceReference
  **/

  public String getServiceFeesInstanceReference() {
    return serviceFeesInstanceReference;
  }

  public void setServiceFeesInstanceReference(String serviceFeesInstanceReference) {
    this.serviceFeesInstanceReference = serviceFeesInstanceReference;
  }


  /**
   * Get serviceFeesInstanceRecord
   * @return serviceFeesInstanceRecord
  **/

  public BQServiceFeesExecuteInputModelServiceFeesInstanceRecord getServiceFeesInstanceRecord() {
    return serviceFeesInstanceRecord;
  }

  public void setServiceFeesInstanceRecord(BQServiceFeesExecuteInputModelServiceFeesInstanceRecord serviceFeesInstanceRecord) {
    this.serviceFeesInstanceRecord = serviceFeesInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return serviceFeesExecuteActionTaskRecord
  **/

  public Object getServiceFeesExecuteActionTaskRecord() {
    return serviceFeesExecuteActionTaskRecord;
  }

  public void setServiceFeesExecuteActionTaskRecord(Object serviceFeesExecuteActionTaskRecord) {
    this.serviceFeesExecuteActionTaskRecord = serviceFeesExecuteActionTaskRecord;
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

