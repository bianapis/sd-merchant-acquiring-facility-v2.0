package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingExecuteOutputModelClearingInstanceRecordCardTransactionRecordReference;

import javax.validation.Valid;
  
/**
 * BQClearingExecuteOutputModelClearingInstanceRecord
 */
public class BQClearingExecuteOutputModelClearingInstanceRecord   {
  private BQClearingExecuteOutputModelClearingInstanceRecordCardTransactionRecordReference cardTransactionRecordReference = null;


  /**
   * Get cardTransactionRecordReference
   * @return cardTransactionRecordReference
  **/

  public BQClearingExecuteOutputModelClearingInstanceRecordCardTransactionRecordReference getCardTransactionRecordReference() {
    return cardTransactionRecordReference;
  }

  public void setCardTransactionRecordReference(BQClearingExecuteOutputModelClearingInstanceRecordCardTransactionRecordReference cardTransactionRecordReference) {
    this.cardTransactionRecordReference = cardTransactionRecordReference;
  }


}

