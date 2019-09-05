package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMerchantAcquiringFacilityFulfillmentArrangementRetrieveOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceReportRecord
 */
public class CRMerchantAcquiringFacilityFulfillmentArrangementRetrieveOutputModelMerchantAcquiringFacilityFulfillmentArrangementInstanceReportRecord   {
  private String merchantAcquiringFacilityFulfillmentArrangementInstanceReportData = null;

  private String merchantAcquiringFacilityFulfillmentArrangementInstanceReportType = null;

  private Object merchantAcquiringFacilityFulfillmentArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return merchantAcquiringFacilityFulfillmentArrangementInstanceReportData
  **/

  public String getMerchantAcquiringFacilityFulfillmentArrangementInstanceReportData() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceReportData;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceReportData(String merchantAcquiringFacilityFulfillmentArrangementInstanceReportData) {
    this.merchantAcquiringFacilityFulfillmentArrangementInstanceReportData = merchantAcquiringFacilityFulfillmentArrangementInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return merchantAcquiringFacilityFulfillmentArrangementInstanceReportType
  **/

  public String getMerchantAcquiringFacilityFulfillmentArrangementInstanceReportType() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceReportType;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceReportType(String merchantAcquiringFacilityFulfillmentArrangementInstanceReportType) {
    this.merchantAcquiringFacilityFulfillmentArrangementInstanceReportType = merchantAcquiringFacilityFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return merchantAcquiringFacilityFulfillmentArrangementInstanceReport
  **/

  public Object getMerchantAcquiringFacilityFulfillmentArrangementInstanceReport() {
    return merchantAcquiringFacilityFulfillmentArrangementInstanceReport;
  }

  public void setMerchantAcquiringFacilityFulfillmentArrangementInstanceReport(Object merchantAcquiringFacilityFulfillmentArrangementInstanceReport) {
    this.merchantAcquiringFacilityFulfillmentArrangementInstanceReport = merchantAcquiringFacilityFulfillmentArrangementInstanceReport;
  }


}

