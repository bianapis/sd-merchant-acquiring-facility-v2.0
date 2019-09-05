package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSettlementRetrieveOutputModelSettlementInstanceReport
 */
public class BQSettlementRetrieveOutputModelSettlementInstanceReport   {
  private Object settlementInstanceReportRecord = null;

  private String settlementInstanceReportType = null;

  private String settlementInstanceReportParameters = null;

  private Object settlementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return settlementInstanceReportRecord
  **/

  public Object getSettlementInstanceReportRecord() {
    return settlementInstanceReportRecord;
  }

  public void setSettlementInstanceReportRecord(Object settlementInstanceReportRecord) {
    this.settlementInstanceReportRecord = settlementInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return settlementInstanceReportType
  **/

  public String getSettlementInstanceReportType() {
    return settlementInstanceReportType;
  }

  public void setSettlementInstanceReportType(String settlementInstanceReportType) {
    this.settlementInstanceReportType = settlementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return settlementInstanceReportParameters
  **/

  public String getSettlementInstanceReportParameters() {
    return settlementInstanceReportParameters;
  }

  public void setSettlementInstanceReportParameters(String settlementInstanceReportParameters) {
    this.settlementInstanceReportParameters = settlementInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return settlementInstanceReport
  **/

  public Object getSettlementInstanceReport() {
    return settlementInstanceReport;
  }

  public void setSettlementInstanceReport(Object settlementInstanceReport) {
    this.settlementInstanceReport = settlementInstanceReport;
  }


}

