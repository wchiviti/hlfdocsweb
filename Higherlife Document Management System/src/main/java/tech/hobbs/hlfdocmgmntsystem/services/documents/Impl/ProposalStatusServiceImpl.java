package tech.hobbs.hlfdocmgmntsystem.services.documents.Impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tech.hobbs.hlfdocmgmntsystem.model.documents.ProposalStatus;
import tech.hobbs.hlfdocmgmntsystem.services.documents.ProposalStatusService;

@Service
@Transactional
public class ProposalStatusServiceImpl implements ProposalStatusService {

	@Override
	public List<ProposalStatus> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(ProposalStatus model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(ProposalStatus model) {
		// TODO Auto-generated method stub

	}

	@Override
	public ProposalStatus findByProposalStatusId(int proposalStatusId) {
		// TODO Auto-generated method stub
		return null;
	}

}
