package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceAnalysis;
import org.bian.dto.BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecord;
import org.bian.dto.BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceReport;
import org.bian.dto.BQMerchantAccountRetrieveOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMerchantAccountRetrieveOutputModel
 */
public class BQMerchantAccountRetrieveOutputModel   {
  private BQMerchantAccountRetrieveOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord merchantAcquiringFacilityFulfillmentArrangementInstanceRecord = null;

  private BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecord merchantAccountInstanceRecord = null;

  private String merchantAccountRetrieveActionTaskReference = null;

  private Object merchantAccountRetrieveActionTaskRecord = null;

  private String merchantAccountRetrieveActionResponse = null;

  private BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceReport merchantAccountInstanceReport = null;

  private BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceAnalysis merchantAccountInstanceAnalysis = null;


  /**
   * Get merchantAcquiringFacilityFulfillmentArrangementInstanceRecord
   * @return merchantAcquiringFacilityFulfillmentArrangementInstanceRecord
  **/

  public BQMerchantAccountRetrieveOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord getMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceRecord;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord(BQMerchantAccountRetrieveOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord merchantAcquiringFacilityFulfillmentArrangementInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Merchant Account instance retrieve service call 
   * @return merchantAccountRetrieveActionTaskReference
  **/

  public String getMerchantAccountRetrieveActionTaskReference() {
    return merchantAccountRetrieveActionTaskReference;
  }

  public void setMerchantAccountRetrieveActionTaskReference(String merchantAccountRetrieveActionTaskReference) {
    this.merchantAccountRetrieveActionTaskReference = merchantAccountRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return merchantAccountRetrieveActionTaskRecord
  **/

  public Object getMerchantAccountRetrieveActionTaskRecord() {
    return merchantAccountRetrieveActionTaskRecord;
  }

  public void setMerchantAccountRetrieveActionTaskRecord(Object merchantAccountRetrieveActionTaskRecord) {
    this.merchantAccountRetrieveActionTaskRecord = merchantAccountRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return merchantAccountRetrieveActionResponse
  **/

  public String getMerchantAccountRetrieveActionResponse() {
    return merchantAccountRetrieveActionResponse;
  }

  public void setMerchantAccountRetrieveActionResponse(String merchantAccountRetrieveActionResponse) {
    this.merchantAccountRetrieveActionResponse = merchantAccountRetrieveActionResponse;
  }


  /**
   * Get merchantAccountInstanceReport
   * @return merchantAccountInstanceReport
  **/

  public BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceReport getMerchantAccountInstanceReport() {
    return merchantAccountInstanceReport;
  }

  public void setMerchantAccountInstanceReport(BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceReport merchantAccountInstanceReport) {
    this.merchantAccountInstanceReport = merchantAccountInstanceReport;
  }


  /**
   * Get merchantAccountInstanceAnalysis
   * @return merchantAccountInstanceAnalysis
  **/

  public BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceAnalysis getMerchantAccountInstanceAnalysis() {
    return merchantAccountInstanceAnalysis;
  }

  public void setMerchantAccountInstanceAnalysis(BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceAnalysis merchantAccountInstanceAnalysis) {
    this.merchantAccountInstanceAnalysis = merchantAccountInstanceAnalysis;
  }


}

