package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecord;
import org.bian.dto.BQSettlementRetrieveOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQSettlementRetrieveOutputModelSettlementInstanceAnalysis;
import org.bian.dto.BQSettlementRetrieveOutputModelSettlementInstanceRecord;
import org.bian.dto.BQSettlementRetrieveOutputModelSettlementInstanceReport;

import javax.validation.Valid;
  
/**
 * BQSettlementRetrieveOutputModel
 */
public class BQSettlementRetrieveOutputModel   {
  private BQSettlementRetrieveOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord merchantAcquiringFacilityFulfillmentArrangementInstanceRecord = null;

  private BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecord merchantAccountInstanceRecord = null;

  private BQSettlementRetrieveOutputModelSettlementInstanceRecord settlementInstanceRecord = null;

  private String settlementRetrieveActionTaskReference = null;

  private Object settlementRetrieveActionTaskRecord = null;

  private String settlementRetrieveActionResponse = null;

  private BQSettlementRetrieveOutputModelSettlementInstanceReport settlementInstanceReport = null;

  private BQSettlementRetrieveOutputModelSettlementInstanceAnalysis settlementInstanceAnalysis = null;


  /**
   * Get merchantAcquiringFacilityFulfillmentArrangementInstanceRecord
   * @return merchantAcquiringFacilityFulfillmentArrangementInstanceRecord
  **/

  public BQSettlementRetrieveOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord getMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceRecord;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord(BQSettlementRetrieveOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord merchantAcquiringFacilityFulfillmentArrangementInstanceRecord) {
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
   * Get settlementInstanceRecord
   * @return settlementInstanceRecord
  **/

  public BQSettlementRetrieveOutputModelSettlementInstanceRecord getSettlementInstanceRecord() {
    return settlementInstanceRecord;
  }

  public void setSettlementInstanceRecord(BQSettlementRetrieveOutputModelSettlementInstanceRecord settlementInstanceRecord) {
    this.settlementInstanceRecord = settlementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Settlement instance retrieve service call 
   * @return settlementRetrieveActionTaskReference
  **/

  public String getSettlementRetrieveActionTaskReference() {
    return settlementRetrieveActionTaskReference;
  }

  public void setSettlementRetrieveActionTaskReference(String settlementRetrieveActionTaskReference) {
    this.settlementRetrieveActionTaskReference = settlementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return settlementRetrieveActionTaskRecord
  **/

  public Object getSettlementRetrieveActionTaskRecord() {
    return settlementRetrieveActionTaskRecord;
  }

  public void setSettlementRetrieveActionTaskRecord(Object settlementRetrieveActionTaskRecord) {
    this.settlementRetrieveActionTaskRecord = settlementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return settlementRetrieveActionResponse
  **/

  public String getSettlementRetrieveActionResponse() {
    return settlementRetrieveActionResponse;
  }

  public void setSettlementRetrieveActionResponse(String settlementRetrieveActionResponse) {
    this.settlementRetrieveActionResponse = settlementRetrieveActionResponse;
  }


  /**
   * Get settlementInstanceReport
   * @return settlementInstanceReport
  **/

  public BQSettlementRetrieveOutputModelSettlementInstanceReport getSettlementInstanceReport() {
    return settlementInstanceReport;
  }

  public void setSettlementInstanceReport(BQSettlementRetrieveOutputModelSettlementInstanceReport settlementInstanceReport) {
    this.settlementInstanceReport = settlementInstanceReport;
  }


  /**
   * Get settlementInstanceAnalysis
   * @return settlementInstanceAnalysis
  **/

  public BQSettlementRetrieveOutputModelSettlementInstanceAnalysis getSettlementInstanceAnalysis() {
    return settlementInstanceAnalysis;
  }

  public void setSettlementInstanceAnalysis(BQSettlementRetrieveOutputModelSettlementInstanceAnalysis settlementInstanceAnalysis) {
    this.settlementInstanceAnalysis = settlementInstanceAnalysis;
  }


}

