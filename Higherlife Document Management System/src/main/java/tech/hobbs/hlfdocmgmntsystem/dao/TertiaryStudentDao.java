package tech.hobbs.hlfdocmgmntsystem.dao;

import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.IntakeType;
import tech.hobbs.hlfdocmgmntsystem.model.Program;
import tech.hobbs.hlfdocmgmntsystem.model.Student;
import tech.hobbs.hlfdocmgmntsystem.model.TertiaryInstitution;
import tech.hobbs.hlfdocmgmntsystem.model.TertiaryLevel;
import tech.hobbs.hlfdocmgmntsystem.model.TertiaryStudent;

public interface TertiaryStudentDao extends AbstractDaoInterface<TertiaryStudent>{
	
	List<TertiaryStudent> findAllStudentsByTertiaryInstitution(TertiaryInstitution tertiaryInstitution);
	
	List<TertiaryStudent> findbyLevelId(TertiaryLevel tertiaryLevel);
	
	TertiaryStudent findbyFileNo(Student student);
	
	TertiaryStudent findByRegNo(String registrationNumber);
	
	TertiaryStudent findByNationalId(String nationalId);
	
	List<TertiaryStudent> findAllStudentsByIntake(IntakeType intakeType);
	
	List<TertiaryStudent> findAllStudentsbyProgramCode(Program program);
	

}
