package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingRetrieveOutputModelClearingInstanceRecordCardTransactionRecordReference;

import javax.validation.Valid;
  
/**
 * BQClearingRetrieveOutputModelClearingInstanceRecord
 */
public class BQClearingRetrieveOutputModelClearingInstanceRecord   {
  private BQClearingRetrieveOutputModelClearingInstanceRecordCardTransactionRecordReference cardTransactionRecordReference = null;


  /**
   * Get cardTransactionRecordReference
   * @return cardTransactionRecordReference
  **/

  public BQClearingRetrieveOutputModelClearingInstanceRecordCardTransactionRecordReference getCardTransactionRecordReference() {
    return cardTransactionRecordReference;
  }

  public void setCardTransactionRecordReference(BQClearingRetrieveOutputModelClearingInstanceRecordCardTransactionRecordReference cardTransactionRecordReference) {
    this.cardTransactionRecordReference = cardTransactionRecordReference;
  }


}

