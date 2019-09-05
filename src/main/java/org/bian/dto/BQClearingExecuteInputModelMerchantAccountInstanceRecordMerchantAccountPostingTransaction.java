package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQClearingExecuteInputModelMerchantAccountInstanceRecordMerchantAccountPostingTransaction
 */
public class BQClearingExecuteInputModelMerchantAccountInstanceRecordMerchantAccountPostingTransaction   {
  private String merchantAcquiringAccountPostingPurpose = null;

  private String merchantAcquiringAccountPostingAmount = null;

  private String merchantAcquiringAccountPostingValueDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Annotation of the reason for the positing (e.g. posting for fees, chargebacks, settlement) 
   * @return merchantAcquiringAccountPostingPurpose
  **/

  public String getMerchantAcquiringAccountPostingPurpose() {
    return merchantAcquiringAccountPostingPurpose;
  }

  public void setMerchantAcquiringAccountPostingPurpose(String merchantAcquiringAccountPostingPurpose) {
    this.merchantAcquiringAccountPostingPurpose = merchantAcquiringAccountPostingPurpose;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: Posted amount (probably captured as a credit/debit pair) 
   * @return merchantAcquiringAccountPostingAmount
  **/

  public String getMerchantAcquiringAccountPostingAmount() {
    return merchantAcquiringAccountPostingAmount;
  }

  public void setMerchantAcquiringAccountPostingAmount(String merchantAcquiringAccountPostingAmount) {
    this.merchantAcquiringAccountPostingAmount = merchantAcquiringAccountPostingAmount;
  }


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


}

