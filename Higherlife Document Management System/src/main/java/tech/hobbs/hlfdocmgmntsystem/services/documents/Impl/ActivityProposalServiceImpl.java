package tech.hobbs.hlfdocmgmntsystem.services.documents.Impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tech.hobbs.hlfdocmgmntsystem.model.documents.ActivityProposal;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;
import tech.hobbs.hlfdocmgmntsystem.services.documents.ActivityProposalService;

@Service
@Transactional
public class ActivityProposalServiceImpl implements ActivityProposalService{

	@Override
	public List<ActivityProposal> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(ActivityProposal model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ActivityProposal model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ActivityProposal findByProposalId(int proposaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActivityProposal findByStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ActivityProposal> findAllProposalsByStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ActivityProposal> findAllProposalsByStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

}
