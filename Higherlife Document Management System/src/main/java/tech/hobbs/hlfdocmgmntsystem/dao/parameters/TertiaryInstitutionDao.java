package tech.hobbs.hlfdocmgmntsystem.dao.parameters;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.parameters.TertiaryInstitution;

public interface TertiaryInstitutionDao extends AbstractDaoInterface<TertiaryInstitution>{

	TertiaryInstitution findByTertiaryCode(String tertiaryCode);
	
	TertiaryInstitution findByTertiaryName(String name);
	
}
