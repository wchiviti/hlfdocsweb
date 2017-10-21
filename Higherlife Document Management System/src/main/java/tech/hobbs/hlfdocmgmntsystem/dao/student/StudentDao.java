package tech.hobbs.hlfdocmgmntsystem.dao.student;

import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;

public interface StudentDao extends AbstractDaoInterface<Student>{
	
	Student findByFileno(String fileNo);
	
	List<Student> findByName(String studentName);
	
	List<Student> findBySurname(String studentSurname);
	
	Student findByCellNumber(String cellNumber);
	
	Student findByEmailAddress(String emailAddress);
	
	List<Student> findByAge(int studentAge);
	
}
