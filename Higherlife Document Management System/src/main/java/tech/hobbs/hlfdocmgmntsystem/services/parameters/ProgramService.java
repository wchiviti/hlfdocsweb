package tech.hobbs.hlfdocmgmntsystem.services.parameters;

import tech.hobbs.hlfdocmgmntsystem.model.parameters.Program;
import tech.hobbs.hlfdocmgmntsystem.services.genericService.AbstractServiceInterface;

public interface ProgramService extends AbstractServiceInterface<Program>{
	
	Program findByProgramCode(String programCode);
	
	Program findByProgramName(String programName);
	
	Program findByProgramLegnth(int programLength);

}
