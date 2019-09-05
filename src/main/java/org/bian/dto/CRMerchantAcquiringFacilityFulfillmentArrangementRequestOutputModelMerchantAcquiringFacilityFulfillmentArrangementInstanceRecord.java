package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMerchantAcquiringFacilityFulfillmentArrangementUpdateInputModelMerchantAcqFaciFulfillmentArrangementInstRecMerchAcqFacPosiLimt;

import javax.validation.Valid;
  
/**
 * CRMerchantAcquiringFacilityFulfillmentArrangementRequestOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord
 */
public class CRMerchantAcquiringFacilityFulfillmentArrangementRequestOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord   {
  private String merchantAcquiringFacilityOperationalTerms = null;

  private CRMerchantAcquiringFacilityFulfillmentArrangementUpdateInputModelMerchantAcqFaciFulfillmentArrangementInstRecMerchAcqFacPosiLimt merchantAcquiringFacilityPositionLimits = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Operational terms governing the merchant facility 
   * @return merchantAcquiringFacilityOperationalTerms
  **/

  public String getMerchantAcquiringFacilityOperationalTerms() {
    return merchantAcquiringFacilityOperationalTerms;
  }

  public void setMerchantAcquiringFacilityOperationalTerms(String merchantAcquiringFacilityOperationalTerms) {
    this.merchantAcquiringFacilityOperationalTerms = merchantAcquiringFacilityOperationalTerms;
  }


  /**
   * Get merchantAcquiringFacilityPositionLimits
   * @return merchantAcquiringFacilityPositionLimits
  **/

  public CRMerchantAcquiringFacilityFulfillmentArrangementUpdateInputModelMerchantAcqFaciFulfillmentArrangementInstRecMerchAcqFacPosiLimt getMerchantAcquiringFacilityPositionLimits() {
    return merchantAcquiringFacilityPositionLimits;
  }

  public void setMerchantAcquiringFacilityPositionLimits(CRMerchantAcquiringFacilityFulfillmentArrangementUpdateInputModelMerchantAcqFaciFulfillmentArrangementInstRecMerchAcqFacPosiLimt merchantAcquiringFacilityPositionLimits) {
    this.merchantAcquiringFacilityPositionLimits = merchantAcquiringFacilityPositionLimits;
  }


}

