package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExecuteInputModelServiceFeesInstanceRecordMerchantFeeConfigurationProfile
 */
public class BQServiceFeesExecuteInputModelServiceFeesInstanceRecordMerchantFeeConfigurationProfile   {
  private String merchantFeeType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The fee or penalty type applied 
   * @return merchantFeeType
  **/

  public String getMerchantFeeType() {
    return merchantFeeType;
  }

  public void setMerchantFeeType(String merchantFeeType) {
    this.merchantFeeType = merchantFeeType;
  }


}

