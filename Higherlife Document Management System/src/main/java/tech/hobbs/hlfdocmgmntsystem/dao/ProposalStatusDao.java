package tech.hobbs.hlfdocmgmntsystem.dao;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.ProposalStatus;

public interface ProposalStatusDao extends AbstractDaoInterface<ProposalStatus>{
	
	ProposalStatus findByProposalStatusId(int proposalStatusId);
	
}
