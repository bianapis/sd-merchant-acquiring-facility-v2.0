package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesUpdateInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeProjectionsandCommitments;
import org.bian.dto.BQServiceFeesUpdateInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeTransaction;

import javax.validation.Valid;
  
/**
 * BQServiceFeesUpdateInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecord
 */
public class BQServiceFeesUpdateInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecord   {
  private BQServiceFeesUpdateInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeTransaction merchantFeeTransaction = null;

  private BQServiceFeesUpdateInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeProjectionsandCommitments merchantFeeProjectionsandCommitments = null;


  /**
   * Get merchantFeeTransaction
   * @return merchantFeeTransaction
  **/

  public BQServiceFeesUpdateInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeTransaction getMerchantFeeTransaction() {
    return merchantFeeTransaction;
  }

  public void setMerchantFeeTransaction(BQServiceFeesUpdateInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeTransaction merchantFeeTransaction) {
    this.merchantFeeTransaction = merchantFeeTransaction;
  }


  /**
   * Get merchantFeeProjectionsandCommitments
   * @return merchantFeeProjectionsandCommitments
  **/

  public BQServiceFeesUpdateInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeProjectionsandCommitments getMerchantFeeProjectionsandCommitments() {
    return merchantFeeProjectionsandCommitments;
  }

  public void setMerchantFeeProjectionsandCommitments(BQServiceFeesUpdateInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecordMerchantFeeProjectionsandCommitments merchantFeeProjectionsandCommitments) {
    this.merchantFeeProjectionsandCommitments = merchantFeeProjectionsandCommitments;
  }


}

