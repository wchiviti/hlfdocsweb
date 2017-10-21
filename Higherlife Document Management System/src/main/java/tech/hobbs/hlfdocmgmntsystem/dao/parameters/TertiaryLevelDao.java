package tech.hobbs.hlfdocmgmntsystem.dao.parameters;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.parameters.TertiaryLevel;

public interface TertiaryLevelDao extends AbstractDaoInterface<TertiaryLevel>{
	
	TertiaryLevel findByLevelName(String levelName);
	
	TertiaryLevel findByLevelId(int levelId);

}
