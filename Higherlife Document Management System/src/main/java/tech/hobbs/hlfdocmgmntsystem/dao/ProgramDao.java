package tech.hobbs.hlfdocmgmntsystem.dao;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.Program;

public interface ProgramDao extends AbstractDaoInterface<Program>{
	
	Program findByProgramCode(String programCode);
	
	Program findByProgramName(String programName);
	
	Program findByProgramLegnth(int programLength);

}
