package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesUpdateInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecord;
import org.bian.dto.BQServiceFeesUpdateInputModelServiceFeesInstanceRecordMerchantFeeConfigurationProfile;

import javax.validation.Valid;
  
/**
 * BQServiceFeesUpdateInputModelServiceFeesInstanceRecord
 */
public class BQServiceFeesUpdateInputModelServiceFeesInstanceRecord   {
  private BQServiceFeesUpdateInputModelServiceFeesInstanceRecordMerchantFeeConfigurationProfile merchantFeeConfigurationProfile = null;

  private BQServiceFeesUpdateInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecord merchantFeeApplicationRecord = null;


  /**
   * Get merchantFeeConfigurationProfile
   * @return merchantFeeConfigurationProfile
  **/

  public BQServiceFeesUpdateInputModelServiceFeesInstanceRecordMerchantFeeConfigurationProfile getMerchantFeeConfigurationProfile() {
    return merchantFeeConfigurationProfile;
  }

  public void setMerchantFeeConfigurationProfile(BQServiceFeesUpdateInputModelServiceFeesInstanceRecordMerchantFeeConfigurationProfile merchantFeeConfigurationProfile) {
    this.merchantFeeConfigurationProfile = merchantFeeConfigurationProfile;
  }


  /**
   * Get merchantFeeApplicationRecord
   * @return merchantFeeApplicationRecord
  **/

  public BQServiceFeesUpdateInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecord getMerchantFeeApplicationRecord() {
    return merchantFeeApplicationRecord;
  }

  public void setMerchantFeeApplicationRecord(BQServiceFeesUpdateInputModelServiceFeesInstanceRecordMerchantFeeApplicationRecord merchantFeeApplicationRecord) {
    this.merchantFeeApplicationRecord = merchantFeeApplicationRecord;
  }


}

