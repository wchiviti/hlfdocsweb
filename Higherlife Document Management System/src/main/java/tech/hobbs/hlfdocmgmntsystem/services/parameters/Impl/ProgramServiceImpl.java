package tech.hobbs.hlfdocmgmntsystem.services.parameters.Impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import tech.hobbs.hlfdocmgmntsystem.model.parameters.Program;
import tech.hobbs.hlfdocmgmntsystem.services.parameters.ProgramService;

@Repository
public class ProgramServiceImpl implements ProgramService {

	@Override
	public List<Program> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Program model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Program model) {
		// TODO Auto-generated method stub

	}

	@Override
	public Program findByProgramCode(String programCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Program findByProgramName(String programName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Program findByProgramLegnth(int programLength) {
		// TODO Auto-generated method stub
		return null;
	}

}
