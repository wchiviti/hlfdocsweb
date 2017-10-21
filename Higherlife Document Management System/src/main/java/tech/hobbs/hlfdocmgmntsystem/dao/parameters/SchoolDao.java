package tech.hobbs.hlfdocmgmntsystem.dao.parameters;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.parameters.School;

public interface SchoolDao extends AbstractDaoInterface<School> {
	
	School findBySchoolName(String schoolName);

}
