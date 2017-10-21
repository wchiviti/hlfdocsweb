package tech.hobbs.hlfdocmgmntsystem.services.student;

import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.model.student.Student;
import tech.hobbs.hlfdocmgmntsystem.services.genericService.AbstractServiceInterface;

public interface StudentService extends AbstractServiceInterface<Student>{
	
	Student findByFileno(String fileNo);
	
	List<Student> findByName(String studentName);
	
	List<Student> findBySurname(String studentSurname);
	
	Student findByCellNumber(String cellNumber);
	
	Student findByEmailAddress(String emailAddress);
	
	List<Student> findByAge(int studentAge);
	
}
