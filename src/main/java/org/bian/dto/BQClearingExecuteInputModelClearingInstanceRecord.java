package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingExecuteInputModelClearingInstanceRecordCardTransactionRecordReference;

import javax.validation.Valid;
  
/**
 * BQClearingExecuteInputModelClearingInstanceRecord
 */
public class BQClearingExecuteInputModelClearingInstanceRecord   {
  private BQClearingExecuteInputModelClearingInstanceRecordCardTransactionRecordReference cardTransactionRecordReference = null;


  /**
   * Get cardTransactionRecordReference
   * @return cardTransactionRecordReference
  **/

  public BQClearingExecuteInputModelClearingInstanceRecordCardTransactionRecordReference getCardTransactionRecordReference() {
    return cardTransactionRecordReference;
  }

  public void setCardTransactionRecordReference(BQClearingExecuteInputModelClearingInstanceRecordCardTransactionRecordReference cardTransactionRecordReference) {
    this.cardTransactionRecordReference = cardTransactionRecordReference;
  }


}

