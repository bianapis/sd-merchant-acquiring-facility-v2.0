package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordMerchantFeeApplicationRecord;
import org.bian.dto.BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordMerchantFeeConfigurationProfile;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExecuteOutputModelServiceFeesInstanceRecord
 */
public class BQServiceFeesExecuteOutputModelServiceFeesInstanceRecord   {
  private BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordMerchantFeeConfigurationProfile merchantFeeConfigurationProfile = null;

  private BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordMerchantFeeApplicationRecord merchantFeeApplicationRecord = null;


  /**
   * Get merchantFeeConfigurationProfile
   * @return merchantFeeConfigurationProfile
  **/

  public BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordMerchantFeeConfigurationProfile getMerchantFeeConfigurationProfile() {
    return merchantFeeConfigurationProfile;
  }

  public void setMerchantFeeConfigurationProfile(BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordMerchantFeeConfigurationProfile merchantFeeConfigurationProfile) {
    this.merchantFeeConfigurationProfile = merchantFeeConfigurationProfile;
  }


  /**
   * Get merchantFeeApplicationRecord
   * @return merchantFeeApplicationRecord
  **/

  public BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordMerchantFeeApplicationRecord getMerchantFeeApplicationRecord() {
    return merchantFeeApplicationRecord;
  }

  public void setMerchantFeeApplicationRecord(BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordMerchantFeeApplicationRecord merchantFeeApplicationRecord) {
    this.merchantFeeApplicationRecord = merchantFeeApplicationRecord;
  }


}

