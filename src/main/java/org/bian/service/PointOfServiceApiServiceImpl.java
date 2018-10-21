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
public class PointOfServiceApiServiceImpl implements PointOfServiceApiService {

	public AutomatedWithIds executePostAutomated(String crReferenceId, Automated request){
		return JsonReader.read("executePost-AutomatedWithIds.json",new TypeReference<AutomatedWithIds>(){});
	}
	
	public AutomatedWithIds executePutAutomated(String crReferenceId, String bqReferenceId, Automated request){
		return JsonReader.read("executePut-AutomatedWithIds.json",new TypeReference<AutomatedWithIds>(){});
	}
	
	public RecordResponse record(String crReferenceId, RecordRequest request){
		return JsonReader.read("record-RecordResponse.json",new TypeReference<RecordResponse>(){});
	}
	
	public AssistedWithIds requestPostAssisted(String crReferenceId, Assisted request){
		return JsonReader.read("requestPost-AssistedWithIds.json",new TypeReference<AssistedWithIds>(){});
	}
	
	public AssistedWithIds requestPutAssisted(String crReferenceId, String bqReferenceId, Assisted request){
		return JsonReader.read("requestPut-AssistedWithIds.json",new TypeReference<AssistedWithIds>(){});
	}
	
	public AssistedWithIds retrieveAssisted(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-AssistedWithIds.json",new TypeReference<AssistedWithIds>(){});
	}
	
	public AutomatedWithIds retrieveAutomated(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-AutomatedWithIds.json",new TypeReference<AutomatedWithIds>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public InteractionWithIds retrieveInteractions(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-InteractionWithIds.json",new TypeReference<InteractionWithIds>(){});
	}
	
	public InventoryWithIds retrieveInventories(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-InventoryWithIds.json",new TypeReference<InventoryWithIds>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public OperatingSessionWithIds retrieve(String crReferenceId){
		return JsonReader.read("retrieve-OperatingSessionWithIds.json",new TypeReference<OperatingSessionWithIds>(){});
	}
	
	public PositionWithIds retrievePositions(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PositionWithIds.json",new TypeReference<PositionWithIds>(){});
	}
	
	public ReportingsWithBaseAndIds retrieveReportings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ReportingsWithBaseAndIds.json",new TypeReference<ReportingsWithBaseAndIds>(){});
	}
	
}
