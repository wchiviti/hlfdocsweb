package tech.hobbs.hlfdocmgmntsystem.services.documents;

import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.documents.ActivityProposal;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;
import tech.hobbs.hlfdocmgmntsystem.services.genericService.AbstractServiceInterface;

public interface ActivityProposalService  extends AbstractServiceInterface<ActivityProposal>{
	
	ActivityProposal findByProposalId(int proposaId);
	
	ActivityProposal findByStudent(Student student);
	
	List<ActivityProposal> findAllProposalsByStudent(Student student);
	
	List<ActivityProposal> findAllProposalsByStatus(String status);
}
