package tech.hobbs.hlfdocmgmntsystem.dao.documents;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.documents.ProposalStatus;

public interface ProposalStatusDao extends AbstractDaoInterface<ProposalStatus>{
	
	ProposalStatus findByProposalStatusId(int proposalStatusId);
	
}
