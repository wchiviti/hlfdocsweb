package tech.hobbs.hlfdocmgmntsystem.services.parameters;

import tech.hobbs.hlfdocmgmntsystem.model.parameters.TertiaryLevel;
import tech.hobbs.hlfdocmgmntsystem.services.genericService.AbstractServiceInterface;

public interface TertiaryLevelService extends AbstractServiceInterface<TertiaryLevel>{
	
	TertiaryLevel findByLevelName(String levelName);
	
	TertiaryLevel findByLevelId(int levelId);

}
