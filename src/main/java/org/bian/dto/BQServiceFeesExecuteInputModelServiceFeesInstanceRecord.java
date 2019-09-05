package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesExecuteInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecord;
import org.bian.dto.BQServiceFeesExecuteInputModelServiceFeesInstanceRecordMerchantFeeConfigurationProfile;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExecuteInputModelServiceFeesInstanceRecord
 */
public class BQServiceFeesExecuteInputModelServiceFeesInstanceRecord   {
  private BQServiceFeesExecuteInputModelServiceFeesInstanceRecordMerchantFeeConfigurationProfile merchantFeeConfigurationProfile = null;

  private BQServiceFeesExecuteInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecord merchantFeeApplicationRecord = null;


  /**
   * Get merchantFeeConfigurationProfile
   * @return merchantFeeConfigurationProfile
  **/

  public BQServiceFeesExecuteInputModelServiceFeesInstanceRecordMerchantFeeConfigurationProfile getMerchantFeeConfigurationProfile() {
    return merchantFeeConfigurationProfile;
  }

  public void setMerchantFeeConfigurationProfile(BQServiceFeesExecuteInputModelServiceFeesInstanceRecordMerchantFeeConfigurationProfile merchantFeeConfigurationProfile) {
    this.merchantFeeConfigurationProfile = merchantFeeConfigurationProfile;
  }


  /**
   * Get merchantFeeApplicationRecord
   * @return merchantFeeApplicationRecord
  **/

  public BQServiceFeesExecuteInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecord getMerchantFeeApplicationRecord() {
    return merchantFeeApplicationRecord;
  }

  public void setMerchantFeeApplicationRecord(BQServiceFeesExecuteInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecord merchantFeeApplicationRecord) {
    this.merchantFeeApplicationRecord = merchantFeeApplicationRecord;
  }


}

