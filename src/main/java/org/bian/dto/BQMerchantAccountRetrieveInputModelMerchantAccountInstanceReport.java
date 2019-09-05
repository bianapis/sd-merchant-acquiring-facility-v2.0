package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMerchantAccountRetrieveInputModelMerchantAccountInstanceReport
 */
public class BQMerchantAccountRetrieveInputModelMerchantAccountInstanceReport   {
  private String merchantAccountInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return merchantAccountInstanceReportReference
  **/

  public String getMerchantAccountInstanceReportReference() {
    return merchantAccountInstanceReportReference;
  }

  public void setMerchantAccountInstanceReportReference(String merchantAccountInstanceReportReference) {
    this.merchantAccountInstanceReportReference = merchantAccountInstanceReportReference;
  }


}

