package tech.hobbs.hlfdocmgmntsystem.services.student;

import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.model.student.ResultsDecision;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;
import tech.hobbs.hlfdocmgmntsystem.model.student.StudentResult;
import tech.hobbs.hlfdocmgmntsystem.services.genericService.AbstractServiceInterface;

public interface StudentResultsService extends AbstractServiceInterface<StudentResult> {
	
	List<StudentResult> findbyFileNo(Student student);
	
	List<StudentResult> findByDecisionStatus(ResultsDecision decision);

}
