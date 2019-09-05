package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSettlementRetrieveInputModelSettlementInstanceAnalysis
 */
public class BQSettlementRetrieveInputModelSettlementInstanceAnalysis   {
  private String settlementInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return settlementInstanceAnalysisReference
  **/

  public String getSettlementInstanceAnalysisReference() {
    return settlementInstanceAnalysisReference;
  }

  public void setSettlementInstanceAnalysisReference(String settlementInstanceAnalysisReference) {
    this.settlementInstanceAnalysisReference = settlementInstanceAnalysisReference;
  }


}

