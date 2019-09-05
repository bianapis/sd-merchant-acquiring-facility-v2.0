package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingRetrieveOutputModelClearingInstanceAnalysis;
import org.bian.dto.BQClearingRetrieveOutputModelClearingInstanceRecord;
import org.bian.dto.BQClearingRetrieveOutputModelClearingInstanceReport;
import org.bian.dto.BQClearingRetrieveOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQClearingRetrieveOutputModel
 */
public class BQClearingRetrieveOutputModel   {
  private BQClearingRetrieveOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord merchantAcquiringFacilityFulfillmentArrangementInstanceRecord = null;

  private BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecord merchantAccountInstanceRecord = null;

  private BQClearingRetrieveOutputModelClearingInstanceRecord clearingInstanceRecord = null;

  private String clearingRetrieveActionTaskReference = null;

  private Object clearingRetrieveActionTaskRecord = null;

  private String clearingRetrieveActionResponse = null;

  private BQClearingRetrieveOutputModelClearingInstanceReport clearingInstanceReport = null;

  private BQClearingRetrieveOutputModelClearingInstanceAnalysis clearingInstanceAnalysis = null;


  /**
   * Get merchantAcquiringFacilityFulfillmentArrangementInstanceRecord
   * @return merchantAcquiringFacilityFulfillmentArrangementInstanceRecord
  **/

  public BQClearingRetrieveOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord getMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceRecord;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord(BQClearingRetrieveOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord merchantAcquiringFacilityFulfillmentArrangementInstanceRecord) {
    this.merchantAcquiringFacilityFulfillmentArrangementInstanceRecord = merchantAcquiringFacilityFulfillmentArrangementInstanceRecord;
  }


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

  public BQClearingRetrieveOutputModelClearingInstanceRecord getClearingInstanceRecord() {
    return clearingInstanceRecord;
  }

  public void setClearingInstanceRecord(BQClearingRetrieveOutputModelClearingInstanceRecord clearingInstanceRecord) {
    this.clearingInstanceRecord = clearingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Clearing instance retrieve service call 
   * @return clearingRetrieveActionTaskReference
  **/

  public String getClearingRetrieveActionTaskReference() {
    return clearingRetrieveActionTaskReference;
  }

  public void setClearingRetrieveActionTaskReference(String clearingRetrieveActionTaskReference) {
    this.clearingRetrieveActionTaskReference = clearingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return clearingRetrieveActionTaskRecord
  **/

  public Object getClearingRetrieveActionTaskRecord() {
    return clearingRetrieveActionTaskRecord;
  }

  public void setClearingRetrieveActionTaskRecord(Object clearingRetrieveActionTaskRecord) {
    this.clearingRetrieveActionTaskRecord = clearingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return clearingRetrieveActionResponse
  **/

  public String getClearingRetrieveActionResponse() {
    return clearingRetrieveActionResponse;
  }

  public void setClearingRetrieveActionResponse(String clearingRetrieveActionResponse) {
    this.clearingRetrieveActionResponse = clearingRetrieveActionResponse;
  }


  /**
   * Get clearingInstanceReport
   * @return clearingInstanceReport
  **/

  public BQClearingRetrieveOutputModelClearingInstanceReport getClearingInstanceReport() {
    return clearingInstanceReport;
  }

  public void setClearingInstanceReport(BQClearingRetrieveOutputModelClearingInstanceReport clearingInstanceReport) {
    this.clearingInstanceReport = clearingInstanceReport;
  }


  /**
   * Get clearingInstanceAnalysis
   * @return clearingInstanceAnalysis
  **/

  public BQClearingRetrieveOutputModelClearingInstanceAnalysis getClearingInstanceAnalysis() {
    return clearingInstanceAnalysis;
  }

  public void setClearingInstanceAnalysis(BQClearingRetrieveOutputModelClearingInstanceAnalysis clearingInstanceAnalysis) {
    this.clearingInstanceAnalysis = clearingInstanceAnalysis;
  }


}

