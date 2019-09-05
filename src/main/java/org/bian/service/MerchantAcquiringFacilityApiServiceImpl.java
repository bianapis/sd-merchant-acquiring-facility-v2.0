/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class MerchantAcquiringFacilityApiServiceImpl implements MerchantAcquiringFacilityApiService {

	public SDMerchantAcquiringFacilityActivateOutputModel activate(SDMerchantAcquiringFacilityActivateInputModel request){
		return JsonReader.read("activate-SDMerchantAcquiringFacilityActivateOutputModel.json",new TypeReference<SDMerchantAcquiringFacilityActivateOutputModel>(){});
	}
	
	public SDMerchantAcquiringFacilityConfigureOutputModel configure(String sdReferenceId, SDMerchantAcquiringFacilityConfigureInputModel request){
		return JsonReader.read("configure-SDMerchantAcquiringFacilityConfigureOutputModel.json",new TypeReference<SDMerchantAcquiringFacilityConfigureOutputModel>(){});
	}
	
	public CRMerchantAcquiringFacilityFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRMerchantAcquiringFacilityFulfillmentArrangementControlInputModel request){
		return JsonReader.read("control-CRMerchantAcquiringFacilityFulfillmentArrangementControlOutputModel.json",new TypeReference<CRMerchantAcquiringFacilityFulfillmentArrangementControlOutputModel>(){});
	}
	
	public BQServiceFeesExchangeOutputModel exchangeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExchangeInputModel request){
		return JsonReader.read("exchange-BQServiceFeesExchangeOutputModel.json",new TypeReference<BQServiceFeesExchangeOutputModel>(){});
	}
	
	public BQChargebackExecuteOutputModel executeChargeback(String sdReferenceId, String crReferenceId, String bqReferenceId, BQChargebackExecuteInputModel request){
		return JsonReader.read("execute-BQChargebackExecuteOutputModel.json",new TypeReference<BQChargebackExecuteOutputModel>(){});
	}
	
	public BQClearingExecuteOutputModel executeClearing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQClearingExecuteInputModel request){
		return JsonReader.read("execute-BQClearingExecuteOutputModel.json",new TypeReference<BQClearingExecuteOutputModel>(){});
	}
	
	public BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request){
		return JsonReader.read("execute-BQServiceFeesExecuteOutputModel.json",new TypeReference<BQServiceFeesExecuteOutputModel>(){});
	}
	
	public BQSettlementExecuteOutputModel executeSettlement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSettlementExecuteInputModel request){
		return JsonReader.read("execute-BQSettlementExecuteOutputModel.json",new TypeReference<BQSettlementExecuteOutputModel>(){});
	}
	
	public SDMerchantAcquiringFacilityFeedbackOutputModel feedback(String sdReferenceId, SDMerchantAcquiringFacilityFeedbackInputModel request){
		return JsonReader.read("feedback-SDMerchantAcquiringFacilityFeedbackOutputModel.json",new TypeReference<SDMerchantAcquiringFacilityFeedbackOutputModel>(){});
	}
	
	public CRMerchantAcquiringFacilityFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRMerchantAcquiringFacilityFulfillmentArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRMerchantAcquiringFacilityFulfillmentArrangementInitiateOutputModel.json",new TypeReference<CRMerchantAcquiringFacilityFulfillmentArrangementInitiateOutputModel>(){});
	}
	
	public CRMerchantAcquiringFacilityFulfillmentArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRMerchantAcquiringFacilityFulfillmentArrangementRequestInputModel request){
		return JsonReader.read("request-CRMerchantAcquiringFacilityFulfillmentArrangementRequestOutputModel.json",new TypeReference<CRMerchantAcquiringFacilityFulfillmentArrangementRequestOutputModel>(){});
	}
	
	public CRMerchantAcquiringFacilityFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRMerchantAcquiringFacilityFulfillmentArrangementRetrieveOutputModel.json",new TypeReference<CRMerchantAcquiringFacilityFulfillmentArrangementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQChargebackRetrieveOutputModel retrieveChargeback(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQChargebackRetrieveOutputModel.json",new TypeReference<BQChargebackRetrieveOutputModel>(){});
	}
	
	public BQClearingRetrieveOutputModel retrieveClearing(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQClearingRetrieveOutputModel.json",new TypeReference<BQClearingRetrieveOutputModel>(){});
	}
	
	public BQMerchantAccountRetrieveOutputModel retrieveMerchantaccount(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQMerchantAccountRetrieveOutputModel.json",new TypeReference<BQMerchantAccountRetrieveOutputModel>(){});
	}
	
	public BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQServiceFeesRetrieveOutputModel.json",new TypeReference<BQServiceFeesRetrieveOutputModel>(){});
	}
	
	public BQSettlementRetrieveOutputModel retrieveSettlement(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQSettlementRetrieveOutputModel.json",new TypeReference<BQSettlementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDMerchantAcquiringFacilityRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDMerchantAcquiringFacilityRetrieveOutputModel.json",new TypeReference<SDMerchantAcquiringFacilityRetrieveOutputModel>(){});
	}
	
	public CRMerchantAcquiringFacilityFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRMerchantAcquiringFacilityFulfillmentArrangementUpdateInputModel request){
		return JsonReader.read("update-CRMerchantAcquiringFacilityFulfillmentArrangementUpdateOutputModel.json",new TypeReference<CRMerchantAcquiringFacilityFulfillmentArrangementUpdateOutputModel>(){});
	}
	
	public BQChargebackUpdateOutputModel updateChargeback(String sdReferenceId, String crReferenceId, String bqReferenceId, BQChargebackUpdateInputModel request){
		return JsonReader.read("update-BQChargebackUpdateOutputModel.json",new TypeReference<BQChargebackUpdateOutputModel>(){});
	}
	
	public BQClearingUpdateOutputModel updateClearing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQClearingUpdateInputModel request){
		return JsonReader.read("update-BQClearingUpdateOutputModel.json",new TypeReference<BQClearingUpdateOutputModel>(){});
	}
	
	public BQServiceFeesUpdateOutputModel updateServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesUpdateInputModel request){
		return JsonReader.read("update-BQServiceFeesUpdateOutputModel.json",new TypeReference<BQServiceFeesUpdateOutputModel>(){});
	}
	
	public BQSettlementUpdateOutputModel updateSettlement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSettlementUpdateInputModel request){
		return JsonReader.read("update-BQSettlementUpdateOutputModel.json",new TypeReference<BQSettlementUpdateOutputModel>(){});
	}
	
}
