package tech.hobbs.hlfdocmgmntsystem.dao.student.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import tech.hobbs.hlfdocmgmntsystem.dao.student.StudentResultsDao;
import tech.hobbs.hlfdocmgmntsystem.model.student.ResultsDecision;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;
import tech.hobbs.hlfdocmgmntsystem.model.student.StudentResult;

@Repository
public class StudentResultsDaoImpl implements StudentResultsDao {

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
