package tech.hobbs.hlfdocmgmntsystem.dao.parameters;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.parameters.Program;

public interface ProgramDao extends AbstractDaoInterface<Program>{
	
	Program findByProgramCode(String programCode);
	
	Program findByProgramName(String programName);
	
	Program findByProgramLegnth(int programLength);

}
