package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingRetrieveInputModelClearingInstanceAnalysis;
import org.bian.dto.BQClearingRetrieveInputModelClearingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQClearingRetrieveInputModel
 */
public class BQClearingRetrieveInputModel   {
  private Object clearingRetrieveActionTaskRecord = null;

  private String clearingRetrieveActionRequest = null;

  private BQClearingRetrieveInputModelClearingInstanceReport clearingInstanceReport = null;

  private BQClearingRetrieveInputModelClearingInstanceAnalysis clearingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return clearingRetrieveActionTaskRecord
  **/

  public Object getClearingRetrieveActionTaskRecord() {
    return clearingRetrieveActionTaskRecord;
  }

  public void setClearingRetrieveActionTaskRecord(Object clearingRetrieveActionTaskRecord) {
    this.clearingRetrieveActionTaskRecord = clearingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return clearingRetrieveActionRequest
  **/

  public String getClearingRetrieveActionRequest() {
    return clearingRetrieveActionRequest;
  }

  public void setClearingRetrieveActionRequest(String clearingRetrieveActionRequest) {
    this.clearingRetrieveActionRequest = clearingRetrieveActionRequest;
  }


  /**
   * Get clearingInstanceReport
   * @return clearingInstanceReport
  **/

  public BQClearingRetrieveInputModelClearingInstanceReport getClearingInstanceReport() {
    return clearingInstanceReport;
  }

  public void setClearingInstanceReport(BQClearingRetrieveInputModelClearingInstanceReport clearingInstanceReport) {
    this.clearingInstanceReport = clearingInstanceReport;
  }


  /**
   * Get clearingInstanceAnalysis
   * @return clearingInstanceAnalysis
  **/

  public BQClearingRetrieveInputModelClearingInstanceAnalysis getClearingInstanceAnalysis() {
    return clearingInstanceAnalysis;
  }

  public void setClearingInstanceAnalysis(BQClearingRetrieveInputModelClearingInstanceAnalysis clearingInstanceAnalysis) {
    this.clearingInstanceAnalysis = clearingInstanceAnalysis;
  }


}

