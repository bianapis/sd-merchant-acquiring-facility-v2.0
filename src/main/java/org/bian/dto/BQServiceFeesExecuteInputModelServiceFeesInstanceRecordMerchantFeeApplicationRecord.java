package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesExecuteInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeProjectionsandCommitments;
import org.bian.dto.BQServiceFeesExecuteInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeTransaction;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExecuteInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecord
 */
public class BQServiceFeesExecuteInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecord   {
  private BQServiceFeesExecuteInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeTransaction merchantFeeTransaction = null;

  private BQServiceFeesExecuteInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeProjectionsandCommitments merchantFeeProjectionsandCommitments = null;


  /**
   * Get merchantFeeTransaction
   * @return merchantFeeTransaction
  **/

  public BQServiceFeesExecuteInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeTransaction getMerchantFeeTransaction() {
    return merchantFeeTransaction;
  }

  public void setMerchantFeeTransaction(BQServiceFeesExecuteInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeTransaction merchantFeeTransaction) {
    this.merchantFeeTransaction = merchantFeeTransaction;
  }


  /**
   * Get merchantFeeProjectionsandCommitments
   * @return merchantFeeProjectionsandCommitments
  **/

  public BQServiceFeesExecuteInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeProjectionsandCommitments getMerchantFeeProjectionsandCommitments() {
    return merchantFeeProjectionsandCommitments;
  }

  public void setMerchantFeeProjectionsandCommitments(BQServiceFeesExecuteInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeProjectionsandCommitments merchantFeeProjectionsandCommitments) {
    this.merchantFeeProjectionsandCommitments = merchantFeeProjectionsandCommitments;
  }


}

