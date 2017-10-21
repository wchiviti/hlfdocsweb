package tech.hobbs.hlfdocmgmntsystem.services.parameters;

import tech.hobbs.hlfdocmgmntsystem.model.parameters.TertiaryInstitution;
import tech.hobbs.hlfdocmgmntsystem.services.genericService.AbstractServiceInterface;

public interface TertiaryInstitutionService extends AbstractServiceInterface<TertiaryInstitution>{

	TertiaryInstitution findByTertiaryCode(String tertiaryCode);
	
	TertiaryInstitution findByTertiaryName(String name);
	
}
