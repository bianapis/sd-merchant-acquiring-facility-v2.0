package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingExecuteInputModelMerchantAccountInstanceRecordMerchantAccountPostingTransaction;

import javax.validation.Valid;
  
/**
 * BQClearingExecuteInputModelMerchantAccountInstanceRecord
 */
public class BQClearingExecuteInputModelMerchantAccountInstanceRecord   {
  private BQClearingExecuteInputModelMerchantAccountInstanceRecordMerchantAccountPostingTransaction merchantAccountPostingTransaction = null;


  /**
   * Get merchantAccountPostingTransaction
   * @return merchantAccountPostingTransaction
  **/

  public BQClearingExecuteInputModelMerchantAccountInstanceRecordMerchantAccountPostingTransaction getMerchantAccountPostingTransaction() {
    return merchantAccountPostingTransaction;
  }

  public void setMerchantAccountPostingTransaction(BQClearingExecuteInputModelMerchantAccountInstanceRecordMerchantAccountPostingTransaction merchantAccountPostingTransaction) {
    this.merchantAccountPostingTransaction = merchantAccountPostingTransaction;
  }


}

