package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMerchantAccountRetrieveInputModelMerchantAccountInstanceAnalysis;
import org.bian.dto.BQMerchantAccountRetrieveInputModelMerchantAccountInstanceReport;

import javax.validation.Valid;
  
/**
 * BQMerchantAccountRetrieveInputModel
 */
public class BQMerchantAccountRetrieveInputModel   {
  private Object merchantAccountRetrieveActionTaskRecord = null;

  private String merchantAccountRetrieveActionRequest = null;

  private BQMerchantAccountRetrieveInputModelMerchantAccountInstanceReport merchantAccountInstanceReport = null;

  private BQMerchantAccountRetrieveInputModelMerchantAccountInstanceAnalysis merchantAccountInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return merchantAccountRetrieveActionTaskRecord
  **/

  public Object getMerchantAccountRetrieveActionTaskRecord() {
    return merchantAccountRetrieveActionTaskRecord;
  }

  public void setMerchantAccountRetrieveActionTaskRecord(Object merchantAccountRetrieveActionTaskRecord) {
    this.merchantAccountRetrieveActionTaskRecord = merchantAccountRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return merchantAccountRetrieveActionRequest
  **/

  public String getMerchantAccountRetrieveActionRequest() {
    return merchantAccountRetrieveActionRequest;
  }

  public void setMerchantAccountRetrieveActionRequest(String merchantAccountRetrieveActionRequest) {
    this.merchantAccountRetrieveActionRequest = merchantAccountRetrieveActionRequest;
  }


  /**
   * Get merchantAccountInstanceReport
   * @return merchantAccountInstanceReport
  **/

  public BQMerchantAccountRetrieveInputModelMerchantAccountInstanceReport getMerchantAccountInstanceReport() {
    return merchantAccountInstanceReport;
  }

  public void setMerchantAccountInstanceReport(BQMerchantAccountRetrieveInputModelMerchantAccountInstanceReport merchantAccountInstanceReport) {
    this.merchantAccountInstanceReport = merchantAccountInstanceReport;
  }


  /**
   * Get merchantAccountInstanceAnalysis
   * @return merchantAccountInstanceAnalysis
  **/

  public BQMerchantAccountRetrieveInputModelMerchantAccountInstanceAnalysis getMerchantAccountInstanceAnalysis() {
    return merchantAccountInstanceAnalysis;
  }

  public void setMerchantAccountInstanceAnalysis(BQMerchantAccountRetrieveInputModelMerchantAccountInstanceAnalysis merchantAccountInstanceAnalysis) {
    this.merchantAccountInstanceAnalysis = merchantAccountInstanceAnalysis;
  }


}

