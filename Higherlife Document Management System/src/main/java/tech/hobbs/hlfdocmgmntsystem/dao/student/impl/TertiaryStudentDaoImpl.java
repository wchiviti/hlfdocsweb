package tech.hobbs.hlfdocmgmntsystem.dao.student.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import tech.hobbs.hlfdocmgmntsystem.dao.student.TertiaryStudentDao;
import tech.hobbs.hlfdocmgmntsystem.model.parameters.IntakeType;
import tech.hobbs.hlfdocmgmntsystem.model.parameters.Program;
import tech.hobbs.hlfdocmgmntsystem.model.parameters.TertiaryInstitution;
import tech.hobbs.hlfdocmgmntsystem.model.parameters.TertiaryLevel;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;
import tech.hobbs.hlfdocmgmntsystem.model.student.TertiaryStudent;

@Repository
public class TertiaryStudentDaoImpl implements TertiaryStudentDao {

	@Override
	public List<TertiaryStudent> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(TertiaryStudent model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TertiaryStudent model) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<TertiaryStudent> findAllStudentsByTertiaryInstitution(TertiaryInstitution tertiaryInstitution) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TertiaryStudent> findbyLevelId(TertiaryLevel tertiaryLevel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TertiaryStudent findbyFileNo(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TertiaryStudent findByRegNo(String registrationNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TertiaryStudent findByNationalId(String nationalId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TertiaryStudent> findAllStudentsByIntake(IntakeType intakeType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TertiaryStudent> findAllStudentsbyProgramCode(Program program) {
		// TODO Auto-generated method stub
		return null;
	}

}
