package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQClearingRetrieveInputModelClearingInstanceReport
 */
public class BQClearingRetrieveInputModelClearingInstanceReport   {
  private String clearingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return clearingInstanceReportReference
  **/

  public String getClearingInstanceReportReference() {
    return clearingInstanceReportReference;
  }

  public void setClearingInstanceReportReference(String clearingInstanceReportReference) {
    this.clearingInstanceReportReference = clearingInstanceReportReference;
  }


}

