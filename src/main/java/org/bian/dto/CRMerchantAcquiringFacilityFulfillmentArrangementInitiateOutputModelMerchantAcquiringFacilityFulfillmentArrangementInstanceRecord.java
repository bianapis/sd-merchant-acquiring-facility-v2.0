package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMerchantAcquiringFacilityFulfillmentArrangementInitiateOutptMdlMerchAcqFacFlfilmntArgmntInstRecMerchAcqFacPosiLimt;

import javax.validation.Valid;
  
/**
 * CRMerchantAcquiringFacilityFulfillmentArrangementInitiateOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord
 */
public class CRMerchantAcquiringFacilityFulfillmentArrangementInitiateOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceRecord   {
  private String productInstanceReference = null;

  private String merchantAcquiringFacilityOperationalTerms = null;

  private CRMerchantAcquiringFacilityFulfillmentArrangementInitiateOutptMdlMerchAcqFacFlfilmntArgmntInstRecMerchAcqFacPosiLimt merchantAcquiringFacilityPositionLimits = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the merchant facility product instance 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


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

  public CRMerchantAcquiringFacilityFulfillmentArrangementInitiateOutptMdlMerchAcqFacFlfilmntArgmntInstRecMerchAcqFacPosiLimt getMerchantAcquiringFacilityPositionLimits() {
    return merchantAcquiringFacilityPositionLimits;
  }

  public void setMerchantAcquiringFacilityPositionLimits(CRMerchantAcquiringFacilityFulfillmentArrangementInitiateOutptMdlMerchAcqFacFlfilmntArgmntInstRecMerchAcqFacPosiLimt merchantAcquiringFacilityPositionLimits) {
    this.merchantAcquiringFacilityPositionLimits = merchantAcquiringFacilityPositionLimits;
  }


}

