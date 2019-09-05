package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExchangeOutputModel
 */
public class BQServiceFeesExchangeOutputModel   {
  private String serviceFeesExchangeActionTaskReference = null;

  private Object serviceFeesExchangeActionTaskRecord = null;

  private String serviceFeesExchangeActionResponse = null;

  private String serviceFeesInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Service Fees instance exchange service call 
   * @return serviceFeesExchangeActionTaskReference
  **/

  public String getServiceFeesExchangeActionTaskReference() {
    return serviceFeesExchangeActionTaskReference;
  }

  public void setServiceFeesExchangeActionTaskReference(String serviceFeesExchangeActionTaskReference) {
    this.serviceFeesExchangeActionTaskReference = serviceFeesExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return serviceFeesExchangeActionTaskRecord
  **/

  public Object getServiceFeesExchangeActionTaskRecord() {
    return serviceFeesExchangeActionTaskRecord;
  }

  public void setServiceFeesExchangeActionTaskRecord(Object serviceFeesExchangeActionTaskRecord) {
    this.serviceFeesExchangeActionTaskRecord = serviceFeesExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return serviceFeesExchangeActionResponse
  **/

  public String getServiceFeesExchangeActionResponse() {
    return serviceFeesExchangeActionResponse;
  }

  public void setServiceFeesExchangeActionResponse(String serviceFeesExchangeActionResponse) {
    this.serviceFeesExchangeActionResponse = serviceFeesExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Service Fees instance (e.g. accepted, rejected, verified) 
   * @return serviceFeesInstanceStatus
  **/

  public String getServiceFeesInstanceStatus() {
    return serviceFeesInstanceStatus;
  }

  public void setServiceFeesInstanceStatus(String serviceFeesInstanceStatus) {
    this.serviceFeesInstanceStatus = serviceFeesInstanceStatus;
  }


}

