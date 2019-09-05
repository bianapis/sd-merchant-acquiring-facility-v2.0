package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSettlementRetrieveInputModelSettlementInstanceReport
 */
public class BQSettlementRetrieveInputModelSettlementInstanceReport   {
  private String settlementInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return settlementInstanceReportReference
  **/

  public String getSettlementInstanceReportReference() {
    return settlementInstanceReportReference;
  }

  public void setSettlementInstanceReportReference(String settlementInstanceReportReference) {
    this.settlementInstanceReportReference = settlementInstanceReportReference;
  }


}

