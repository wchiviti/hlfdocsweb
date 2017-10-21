package tech.hobbs.hlfdocmgmntsystem.dao;

import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.ResultsDecision;
import tech.hobbs.hlfdocmgmntsystem.model.Student;
import tech.hobbs.hlfdocmgmntsystem.model.StudentResult;

public interface StudentResultsDao extends AbstractDaoInterface<StudentResult> {
	
	List<StudentResult> findbyFileNo(Student student);
	
	List<StudentResult> findByDecisionStatus(ResultsDecision decision);

}
