package tech.hobbs.hlfdocmgmntsystem.dao;

import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.ResultsDecision;
import tech.hobbs.hlfdocmgmntsystem.model.Student;
import tech.hobbs.hlfdocmgmntsystem.model.StudentResults;

public interface StudentResultsDao extends AbstractDaoInterface<StudentResults> {
	
	List<StudentResults> findbyFileNo(Student student);
	
	List<StudentResults> findByDecisionStatus(ResultsDecision decision);

}
