package tech.hobbs.hlfdocmgmntsystem.services.documents;

import tech.hobbs.hlfdocmgmntsystem.model.documents.ProposalStatus;
import tech.hobbs.hlfdocmgmntsystem.services.genericService.AbstractServiceInterface;

public interface ProposalStatusService extends AbstractServiceInterface<ProposalStatus>{
	
	ProposalStatus findByProposalStatusId(int proposalStatusId);
	
}
