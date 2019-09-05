package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQClearingRetrieveInputModelClearingInstanceAnalysis
 */
public class BQClearingRetrieveInputModelClearingInstanceAnalysis   {
  private String clearingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return clearingInstanceAnalysisReference
  **/

  public String getClearingInstanceAnalysisReference() {
    return clearingInstanceAnalysisReference;
  }

  public void setClearingInstanceAnalysisReference(String clearingInstanceAnalysisReference) {
    this.clearingInstanceAnalysisReference = clearingInstanceAnalysisReference;
  }


}

