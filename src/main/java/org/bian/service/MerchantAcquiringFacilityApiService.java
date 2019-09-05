/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface MerchantAcquiringFacilityApiService {

	SDMerchantAcquiringFacilityActivateOutputModel activate(SDMerchantAcquiringFacilityActivateInputModel request);
	
	SDMerchantAcquiringFacilityConfigureOutputModel configure(String sdReferenceId, SDMerchantAcquiringFacilityConfigureInputModel request);
	
	CRMerchantAcquiringFacilityFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRMerchantAcquiringFacilityFulfillmentArrangementControlInputModel request);
	
	BQServiceFeesExchangeOutputModel exchangeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExchangeInputModel request);
	
	BQChargebackExecuteOutputModel executeChargeback(String sdReferenceId, String crReferenceId, String bqReferenceId, BQChargebackExecuteInputModel request);
	
	BQClearingExecuteOutputModel executeClearing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQClearingExecuteInputModel request);
	
	BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request);
	
	BQSettlementExecuteOutputModel executeSettlement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSettlementExecuteInputModel request);
	
	SDMerchantAcquiringFacilityFeedbackOutputModel feedback(String sdReferenceId, SDMerchantAcquiringFacilityFeedbackInputModel request);
	
	CRMerchantAcquiringFacilityFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRMerchantAcquiringFacilityFulfillmentArrangementInitiateInputModel request);
	
	CRMerchantAcquiringFacilityFulfillmentArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRMerchantAcquiringFacilityFulfillmentArrangementRequestInputModel request);
	
	CRMerchantAcquiringFacilityFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQChargebackRetrieveOutputModel retrieveChargeback(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQClearingRetrieveOutputModel retrieveClearing(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQMerchantAccountRetrieveOutputModel retrieveMerchantaccount(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQSettlementRetrieveOutputModel retrieveSettlement(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDMerchantAcquiringFacilityRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRMerchantAcquiringFacilityFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRMerchantAcquiringFacilityFulfillmentArrangementUpdateInputModel request);
	
	BQChargebackUpdateOutputModel updateChargeback(String sdReferenceId, String crReferenceId, String bqReferenceId, BQChargebackUpdateInputModel request);
	
	BQClearingUpdateOutputModel updateClearing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQClearingUpdateInputModel request);
	
	BQServiceFeesUpdateOutputModel updateServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesUpdateInputModel request);
	
	BQSettlementUpdateOutputModel updateSettlement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSettlementUpdateInputModel request);
	
}
