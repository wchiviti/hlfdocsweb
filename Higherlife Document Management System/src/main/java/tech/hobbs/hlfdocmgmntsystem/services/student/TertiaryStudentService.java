package tech.hobbs.hlfdocmgmntsystem.services.student;

import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.model.parameters.IntakeType;
import tech.hobbs.hlfdocmgmntsystem.model.parameters.Program;
import tech.hobbs.hlfdocmgmntsystem.model.parameters.TertiaryInstitution;
import tech.hobbs.hlfdocmgmntsystem.model.parameters.TertiaryLevel;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;
import tech.hobbs.hlfdocmgmntsystem.model.student.TertiaryStudent;
import tech.hobbs.hlfdocmgmntsystem.services.genericService.AbstractServiceInterface;

public interface TertiaryStudentService extends AbstractServiceInterface<TertiaryStudent>{
	
	List<TertiaryStudent> findAllStudentsByTertiaryInstitution(TertiaryInstitution tertiaryInstitution);
	
	List<TertiaryStudent> findbyLevelId(TertiaryLevel tertiaryLevel);
	
	TertiaryStudent findbyFileNo(Student student);
	
	TertiaryStudent findByRegNo(String registrationNumber);
	
	TertiaryStudent findByNationalId(String nationalId);
	
	List<TertiaryStudent> findAllStudentsByIntake(IntakeType intakeType);
	
	List<TertiaryStudent> findAllStudentsbyProgramCode(Program program);
	

}
