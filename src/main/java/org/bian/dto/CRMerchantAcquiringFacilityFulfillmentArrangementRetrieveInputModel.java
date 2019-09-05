package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMerchantAcquiringFacilityFulfillmentArrangementRetrieveInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRMerchantAcquiringFacilityFulfillmentArrangementRetrieveInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRMerchantAcquiringFacilityFulfillmentArrangementRetrieveInputModel
 */
public class CRMerchantAcquiringFacilityFulfillmentArrangementRetrieveInputModel   {
  private Object merchantAcquiringFacilityFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String merchantAcquiringFacilityFulfillmentArrangementRetrieveActionRequest = null;

  private CRMerchantAcquiringFacilityFulfillmentArrangementRetrieveInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceReportRecord merchantAcquiringFacilityFulfillmentArrangementInstanceReportRecord = null;

  private CRMerchantAcquiringFacilityFulfillmentArrangementRetrieveInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceAnalysis merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return merchantAcquiringFacilityFulfillmentArrangementRetrieveActionTaskRecord
  **/

  public Object getMerchantAcquiringFacilityFulfillmentArrangementRetrieveActionTaskRecord() {
    return merchantAcquiringFacilityFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementRetrieveActionTaskRecord(Object merchantAcquiringFacilityFulfillmentArrangementRetrieveActionTaskRecord) {
    this.merchantAcquiringFacilityFulfillmentArrangementRetrieveActionTaskRecord = merchantAcquiringFacilityFulfillmentArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return merchantAcquiringFacilityFulfillmentArrangementRetrieveActionRequest
  **/

  public String getMerchantAcquiringFacilityFulfillmentArrangementRetrieveActionRequest() {
    return merchantAcquiringFacilityFulfillmentArrangementRetrieveActionRequest;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementRetrieveActionRequest(String merchantAcquiringFacilityFulfillmentArrangementRetrieveActionRequest) {
    this.merchantAcquiringFacilityFulfillmentArrangementRetrieveActionRequest = merchantAcquiringFacilityFulfillmentArrangementRetrieveActionRequest;
  }


  /**
   * Get merchantAcquiringFacilityFulfillmentArrangementInstanceReportRecord
   * @return merchantAcquiringFacilityFulfillmentArrangementInstanceReportRecord
  **/

  public CRMerchantAcquiringFacilityFulfillmentArrangementRetrieveInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceReportRecord getMerchantAcquiringFacilityFulfillmentArrangementInstanceReportRecord() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceReportRecord;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceReportRecord(CRMerchantAcquiringFacilityFulfillmentArrangementRetrieveInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceReportRecord merchantAcquiringFacilityFulfillmentArrangementInstanceReportRecord) {
    this.merchantAcquiringFacilityFulfillmentArrangementInstanceReportRecord = merchantAcquiringFacilityFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysis
   * @return merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysis
  **/

  public CRMerchantAcquiringFacilityFulfillmentArrangementRetrieveInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceAnalysis getMerchantAcquiringFacilityFulfillmentArrangementInstanceAnalysis() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysis;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceAnalysis(CRMerchantAcquiringFacilityFulfillmentArrangementRetrieveInputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceAnalysis merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysis) {
    this.merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysis = merchantAcquiringFacilityFulfillmentArrangementInstanceAnalysis;
  }


}

