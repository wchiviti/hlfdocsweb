package tech.hobbs.hlfdocmgmntsystem.services.parameters;

import tech.hobbs.hlfdocmgmntsystem.model.parameters.School;
import tech.hobbs.hlfdocmgmntsystem.services.genericService.AbstractServiceInterface;

public interface SchoolService extends AbstractServiceInterface<School> {
	
	School findBySchoolName(String schoolName);

}
