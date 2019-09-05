package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingUpdateInputModelClearingInstanceRecordCardTransactionRecordReference;

import javax.validation.Valid;
  
/**
 * BQClearingUpdateInputModelClearingInstanceRecord
 */
public class BQClearingUpdateInputModelClearingInstanceRecord   {
  private BQClearingUpdateInputModelClearingInstanceRecordCardTransactionRecordReference cardTransactionRecordReference = null;


  /**
   * Get cardTransactionRecordReference
   * @return cardTransactionRecordReference
  **/

  public BQClearingUpdateInputModelClearingInstanceRecordCardTransactionRecordReference getCardTransactionRecordReference() {
    return cardTransactionRecordReference;
  }

  public void setCardTransactionRecordReference(BQClearingUpdateInputModelClearingInstanceRecordCardTransactionRecordReference cardTransactionRecordReference) {
    this.cardTransactionRecordReference = cardTransactionRecordReference;
  }


}

