package tech.hobbs.hlfdocmgmntsystem.dao.student;

import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.student.ResultsDecision;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;
import tech.hobbs.hlfdocmgmntsystem.model.student.StudentResult;

public interface StudentResultsDao extends AbstractDaoInterface<StudentResult> {
	
	List<StudentResult> findbyFileNo(Student student);
	
	List<StudentResult> findByDecisionStatus(ResultsDecision decision);

}
