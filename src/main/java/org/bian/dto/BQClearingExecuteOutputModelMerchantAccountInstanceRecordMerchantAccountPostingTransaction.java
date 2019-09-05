package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQClearingExecuteOutputModelMerchantAccountInstanceRecordMerchantAccountPostingTransaction
 */
public class BQClearingExecuteOutputModelMerchantAccountInstanceRecordMerchantAccountPostingTransaction   {
  private String merchantAcquiringAccountPostingValueDate = null;

  private String merchantAcquiringAccountPostingResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The value date for the posting 
   * @return merchantAcquiringAccountPostingValueDate
  **/

  public String getMerchantAcquiringAccountPostingValueDate() {
    return merchantAcquiringAccountPostingValueDate;
  }

  public void setMerchantAcquiringAccountPostingValueDate(String merchantAcquiringAccountPostingValueDate) {
    this.merchantAcquiringAccountPostingValueDate = merchantAcquiringAccountPostingValueDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Confirmation of the posting action 
   * @return merchantAcquiringAccountPostingResult
  **/

  public String getMerchantAcquiringAccountPostingResult() {
    return merchantAcquiringAccountPostingResult;
  }

  public void setMerchantAcquiringAccountPostingResult(String merchantAcquiringAccountPostingResult) {
    this.merchantAcquiringAccountPostingResult = merchantAcquiringAccountPostingResult;
  }


}

