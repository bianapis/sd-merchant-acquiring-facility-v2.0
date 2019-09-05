package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSettlementExecuteInputModelSettlementInstanceRecord
 */
public class BQSettlementExecuteInputModelSettlementInstanceRecord   {
  private String participantMerchantAcquirerBankReference = null;

  private String participantIssuerBankReference = null;

  private Object cardFinancialSettlementServicePaymentAdviceRecord = null;

  private String participantPaymentTransaction = null;

  private String participantAcquirerBankSettlementAccountStatement = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Merchant Acquiring bank for settlement processing 
   * @return participantMerchantAcquirerBankReference
  **/

  public String getParticipantMerchantAcquirerBankReference() {
    return participantMerchantAcquirerBankReference;
  }

  public void setParticipantMerchantAcquirerBankReference(String participantMerchantAcquirerBankReference) {
    this.participantMerchantAcquirerBankReference = participantMerchantAcquirerBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issuing bank for payments made to the issuer for chargebacks 
   * @return participantIssuerBankReference
  **/

  public String getParticipantIssuerBankReference() {
    return participantIssuerBankReference;
  }

  public void setParticipantIssuerBankReference(String participantIssuerBankReference) {
    this.participantIssuerBankReference = participantIssuerBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details the individual participant Issuer or Acquirer payments calculated to be due for this settlement window - covers only the instructions specific to the participant Merchant Acquirer 
   * @return cardFinancialSettlementServicePaymentAdviceRecord
  **/

  public Object getCardFinancialSettlementServicePaymentAdviceRecord() {
    return cardFinancialSettlementServicePaymentAdviceRecord;
  }

  public void setCardFinancialSettlementServicePaymentAdviceRecord(Object cardFinancialSettlementServicePaymentAdviceRecord) {
    this.cardFinancialSettlementServicePaymentAdviceRecord = cardFinancialSettlementServicePaymentAdviceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the payment made, typically from Issuer to Acquirer participant bank  
   * @return participantPaymentTransaction
  **/

  public String getParticipantPaymentTransaction() {
    return participantPaymentTransaction;
  }

  public void setParticipantPaymentTransaction(String participantPaymentTransaction) {
    this.participantPaymentTransaction = participantPaymentTransaction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The settlement account statement for the processing window - used to confirm payments 
   * @return participantAcquirerBankSettlementAccountStatement
  **/

  public String getParticipantAcquirerBankSettlementAccountStatement() {
    return participantAcquirerBankSettlementAccountStatement;
  }

  public void setParticipantAcquirerBankSettlementAccountStatement(String participantAcquirerBankSettlementAccountStatement) {
    this.participantAcquirerBankSettlementAccountStatement = participantAcquirerBankSettlementAccountStatement;
  }


}

