/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface PointOfServiceApiService {

	AutomatedWithIds executePostAutomated(String crReferenceId, Automated request);
	
	AutomatedWithIds executePutAutomated(String crReferenceId, String bqReferenceId, Automated request);
	
	RecordResponse record(String crReferenceId, RecordRequest request);
	
	AssistedWithIds requestPostAssisted(String crReferenceId, Assisted request);
	
	AssistedWithIds requestPutAssisted(String crReferenceId, String bqReferenceId, Assisted request);
	
	AssistedWithIds retrieveAssisted(String crReferenceId, String bqReferenceId);
	
	AutomatedWithIds retrieveAutomated(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	InteractionWithIds retrieveInteractions(String crReferenceId, String bqReferenceId);
	
	InventoryWithIds retrieveInventories(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	OperatingSessionWithIds retrieve(String crReferenceId);
	
	PositionWithIds retrievePositions(String crReferenceId, String bqReferenceId);
	
	ReportingsWithBaseAndIds retrieveReportings(String crReferenceId, String bqReferenceId);
	
}
