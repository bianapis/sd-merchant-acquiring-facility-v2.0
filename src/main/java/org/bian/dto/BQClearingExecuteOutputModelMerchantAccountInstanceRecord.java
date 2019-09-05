package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingExecuteOutputModelMerchantAccountInstanceRecordMerchantAccountPostingTransaction;

import javax.validation.Valid;
  
/**
 * BQClearingExecuteOutputModelMerchantAccountInstanceRecord
 */
public class BQClearingExecuteOutputModelMerchantAccountInstanceRecord   {
  private BQClearingExecuteOutputModelMerchantAccountInstanceRecordMerchantAccountPostingTransaction merchantAccountPostingTransaction = null;


  /**
   * Get merchantAccountPostingTransaction
   * @return merchantAccountPostingTransaction
  **/

  public BQClearingExecuteOutputModelMerchantAccountInstanceRecordMerchantAccountPostingTransaction getMerchantAccountPostingTransaction() {
    return merchantAccountPostingTransaction;
  }

  public void setMerchantAccountPostingTransaction(BQClearingExecuteOutputModelMerchantAccountInstanceRecordMerchantAccountPostingTransaction merchantAccountPostingTransaction) {
    this.merchantAccountPostingTransaction = merchantAccountPostingTransaction;
  }


}

