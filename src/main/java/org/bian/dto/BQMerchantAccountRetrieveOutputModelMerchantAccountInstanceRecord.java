package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecordMerchantAccountPostingTransaction;

import javax.validation.Valid;
  
/**
 * BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecord
 */
public class BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecord   {
  private BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecordMerchantAccountPostingTransaction merchantAccountPostingTransaction = null;


  /**
   * Get merchantAccountPostingTransaction
   * @return merchantAccountPostingTransaction
  **/

  public BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecordMerchantAccountPostingTransaction getMerchantAccountPostingTransaction() {
    return merchantAccountPostingTransaction;
  }

  public void setMerchantAccountPostingTransaction(BQMerchantAccountRetrieveOutputModelMerchantAccountInstanceRecordMerchantAccountPostingTransaction merchantAccountPostingTransaction) {
    this.merchantAccountPostingTransaction = merchantAccountPostingTransaction;
  }


}

