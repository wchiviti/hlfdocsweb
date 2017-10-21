package tech.hobbs.hlfdocmgmntsystem.services.student.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tech.hobbs.hlfdocmgmntsystem.model.student.ResultsDecision;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;
import tech.hobbs.hlfdocmgmntsystem.model.student.StudentResult;
import tech.hobbs.hlfdocmgmntsystem.services.student.StudentResultsService;

@Service
@Transactional
public class StudentResultsServiceImpl implements StudentResultsService {

	@Override
	public List<StudentResult> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(StudentResult model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(StudentResult model) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<StudentResult> findbyFileNo(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentResult> findByDecisionStatus(ResultsDecision decision) {
		// TODO Auto-generated method stub
		return null;
	}

}
