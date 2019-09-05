package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSettlementRetrieveInputModelSettlementInstanceAnalysis;
import org.bian.dto.BQSettlementRetrieveInputModelSettlementInstanceReport;

import javax.validation.Valid;
  
/**
 * BQSettlementRetrieveInputModel
 */
public class BQSettlementRetrieveInputModel   {
  private Object settlementRetrieveActionTaskRecord = null;

  private String settlementRetrieveActionRequest = null;

  private BQSettlementRetrieveInputModelSettlementInstanceReport settlementInstanceReport = null;

  private BQSettlementRetrieveInputModelSettlementInstanceAnalysis settlementInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return settlementRetrieveActionRequest
  **/

  public String getSettlementRetrieveActionRequest() {
    return settlementRetrieveActionRequest;
  }

  public void setSettlementRetrieveActionRequest(String settlementRetrieveActionRequest) {
    this.settlementRetrieveActionRequest = settlementRetrieveActionRequest;
  }


  /**
   * Get settlementInstanceReport
   * @return settlementInstanceReport
  **/

  public BQSettlementRetrieveInputModelSettlementInstanceReport getSettlementInstanceReport() {
    return settlementInstanceReport;
  }

  public void setSettlementInstanceReport(BQSettlementRetrieveInputModelSettlementInstanceReport settlementInstanceReport) {
    this.settlementInstanceReport = settlementInstanceReport;
  }


  /**
   * Get settlementInstanceAnalysis
   * @return settlementInstanceAnalysis
  **/

  public BQSettlementRetrieveInputModelSettlementInstanceAnalysis getSettlementInstanceAnalysis() {
    return settlementInstanceAnalysis;
  }

  public void setSettlementInstanceAnalysis(BQSettlementRetrieveInputModelSettlementInstanceAnalysis settlementInstanceAnalysis) {
    this.settlementInstanceAnalysis = settlementInstanceAnalysis;
  }


}

