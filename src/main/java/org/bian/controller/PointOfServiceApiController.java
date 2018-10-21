/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class PointOfServiceApiController {

	@Autowired
	PointOfServiceApiService service;
	
	@BQ("automated")
	@Operate.ExecutePost
	public BianResponse<AutomatedWithIds> executePostAutomated(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<Automated> bianRequest) {
		return BianResponse.forSuccess(service.executePostAutomated(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("automated")
	@Operate.ExecutePut
	public BianResponse<AutomatedWithIds> executePutAutomated(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<Automated> bianRequest) {
		return BianResponse.forSuccess(service.executePutAutomated(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Record
	public BianResponse<RecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<RecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("assisted")
	@Operate.RequestPost
	public BianResponse<AssistedWithIds> requestPostAssisted(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<Assisted> bianRequest) {
		return BianResponse.forSuccess(service.requestPostAssisted(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("assisted")
	@Operate.RequestPut
	public BianResponse<AssistedWithIds> requestPutAssisted(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<Assisted> bianRequest) {
		return BianResponse.forSuccess(service.requestPutAssisted(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("assisted")
	@Operate.Retrieve
	public BianResponse<AssistedWithIds> retrieveAssisted(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAssisted(crReferenceId, bqReferenceId));
	}
	
	@BQ("automated")
	@Operate.Retrieve
	public BianResponse<AutomatedWithIds> retrieveAutomated(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAutomated(crReferenceId, bqReferenceId));
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@BQ("interactions")
	@Operate.Retrieve
	public BianResponse<InteractionWithIds> retrieveInteractions(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInteractions(crReferenceId, bqReferenceId));
	}
	
	@BQ("inventories")
	@Operate.Retrieve
	public BianResponse<InventoryWithIds> retrieveInventories(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInventories(crReferenceId, bqReferenceId));
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@Operate.Retrieve
	public BianResponse<OperatingSessionWithIds> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("positions")
	@Operate.Retrieve
	public BianResponse<PositionWithIds> retrievePositions(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePositions(crReferenceId, bqReferenceId));
	}
	
	@BQ("reportings")
	@Operate.Retrieve
	public BianResponse<ReportingsWithBaseAndIds> retrieveReportings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReportings(crReferenceId, bqReferenceId));
	}
	
}
