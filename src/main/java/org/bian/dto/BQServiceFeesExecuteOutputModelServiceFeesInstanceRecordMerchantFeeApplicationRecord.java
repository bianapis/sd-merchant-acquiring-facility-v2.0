package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeProjectionsandCommitments;
import org.bian.dto.BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeTransaction;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordMerchantFeeApplicationRecord
 */
public class BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordMerchantFeeApplicationRecord   {
  private BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeTransaction merchantFeeTransaction = null;

  private BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeProjectionsandCommitments merchantFeeProjectionsandCommitments = null;


  /**
   * Get merchantFeeTransaction
   * @return merchantFeeTransaction
  **/

  public BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeTransaction getMerchantFeeTransaction() {
    return merchantFeeTransaction;
  }

  public void setMerchantFeeTransaction(BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeTransaction merchantFeeTransaction) {
    this.merchantFeeTransaction = merchantFeeTransaction;
  }


  /**
   * Get merchantFeeProjectionsandCommitments
   * @return merchantFeeProjectionsandCommitments
  **/

  public BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeProjectionsandCommitments getMerchantFeeProjectionsandCommitments() {
    return merchantFeeProjectionsandCommitments;
  }

  public void setMerchantFeeProjectionsandCommitments(BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeProjectionsandCommitments merchantFeeProjectionsandCommitments) {
    this.merchantFeeProjectionsandCommitments = merchantFeeProjectionsandCommitments;
  }


}

