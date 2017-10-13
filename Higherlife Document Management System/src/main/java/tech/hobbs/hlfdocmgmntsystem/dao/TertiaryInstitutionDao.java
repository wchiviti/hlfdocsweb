package tech.hobbs.hlfdocmgmntsystem.dao;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.TertiaryInstitution;

public interface TertiaryInstitutionDao extends AbstractDaoInterface<TertiaryInstitution>{

	TertiaryInstitution findByTertiaryCode(String tertiaryCode);
	
	TertiaryInstitution findByTertiaryName(String name);
	
}
