package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMerchantAcquiringFacilityFulfillmentArrangementInitiateOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecordMerchantAcquiringFacilityPositionLimits
 */
public class CRMerchantAcquiringFacilityFulfillmentArrangementInitiateOutptMdlMerchAcqFacFlfilmntArgmntInstRecMerchAcqFacPosiLimt   {
  private String merchantPositionLimitSettings = null;

  private String merchantPositionLimitValue = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The position definition, associated limit settings and rules 
   * @return merchantPositionLimitSettings
  **/

  public String getMerchantPositionLimitSettings() {
    return merchantPositionLimitSettings;
  }

  public void setMerchantPositionLimitSettings(String merchantPositionLimitSettings) {
    this.merchantPositionLimitSettings = merchantPositionLimitSettings;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The savings calculated position 
   * @return merchantPositionLimitValue
  **/

  public String getMerchantPositionLimitValue() {
    return merchantPositionLimitValue;
  }

  public void setMerchantPositionLimitValue(String merchantPositionLimitValue) {
    this.merchantPositionLimitValue = merchantPositionLimitValue;
  }


}

