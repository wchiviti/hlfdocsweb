package tech.hobbs.hlfdocmgmntsystem.dao.student;

import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.parameters.IntakeType;
import tech.hobbs.hlfdocmgmntsystem.model.parameters.Program;
import tech.hobbs.hlfdocmgmntsystem.model.parameters.TertiaryInstitution;
import tech.hobbs.hlfdocmgmntsystem.model.parameters.TertiaryLevel;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;
import tech.hobbs.hlfdocmgmntsystem.model.student.TertiaryStudent;

public interface TertiaryStudentDao extends AbstractDaoInterface<TertiaryStudent>{
	
	List<TertiaryStudent> findAllStudentsByTertiaryInstitution(TertiaryInstitution tertiaryInstitution);
	
	List<TertiaryStudent> findbyLevelId(TertiaryLevel tertiaryLevel);
	
	TertiaryStudent findbyFileNo(Student student);
	
	TertiaryStudent findByRegNo(String registrationNumber);
	
	TertiaryStudent findByNationalId(String nationalId);
	
	List<TertiaryStudent> findAllStudentsByIntake(IntakeType intakeType);
	
	List<TertiaryStudent> findAllStudentsbyProgramCode(Program program);
	

}
