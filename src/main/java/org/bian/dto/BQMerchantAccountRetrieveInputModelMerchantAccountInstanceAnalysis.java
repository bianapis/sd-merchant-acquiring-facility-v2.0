package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMerchantAccountRetrieveInputModelMerchantAccountInstanceAnalysis
 */
public class BQMerchantAccountRetrieveInputModelMerchantAccountInstanceAnalysis   {
  private String merchantAccountInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return merchantAccountInstanceAnalysisReference
  **/

  public String getMerchantAccountInstanceAnalysisReference() {
    return merchantAccountInstanceAnalysisReference;
  }

  public void setMerchantAccountInstanceAnalysisReference(String merchantAccountInstanceAnalysisReference) {
    this.merchantAccountInstanceAnalysisReference = merchantAccountInstanceAnalysisReference;
  }


}

