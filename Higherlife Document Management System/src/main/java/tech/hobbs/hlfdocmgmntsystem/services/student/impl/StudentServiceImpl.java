package tech.hobbs.hlfdocmgmntsystem.services.student.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tech.hobbs.hlfdocmgmntsystem.model.student.Student;
import tech.hobbs.hlfdocmgmntsystem.services.student.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Student model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Student model) {
		// TODO Auto-generated method stub

	}

	@Override
	public Student findByFileno(String fileNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findByName(String studentName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findBySurname(String studentSurname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findByCellNumber(String cellNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findByEmailAddress(String emailAddress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findByAge(int studentAge) {
		// TODO Auto-generated method stub
		return null;
	}

}
