package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordMerchantFeeConfigurationProfile
 */
public class BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordMerchantFeeConfigurationProfile   {
  private String merchantFeeDefinition = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the fee or penalty including when and how to apply 
   * @return merchantFeeDefinition
  **/

  public String getMerchantFeeDefinition() {
    return merchantFeeDefinition;
  }

  public void setMerchantFeeDefinition(String merchantFeeDefinition) {
    this.merchantFeeDefinition = merchantFeeDefinition;
  }


}

