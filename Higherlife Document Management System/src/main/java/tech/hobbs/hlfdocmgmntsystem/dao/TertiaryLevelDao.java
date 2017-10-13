package tech.hobbs.hlfdocmgmntsystem.dao;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.TertiaryLevel;

public interface TertiaryLevelDao extends AbstractDaoInterface<TertiaryLevel>{
	
	TertiaryLevel findByLevelName(String levelName);
	
	TertiaryLevel findByLevelId(int levelId);

}
