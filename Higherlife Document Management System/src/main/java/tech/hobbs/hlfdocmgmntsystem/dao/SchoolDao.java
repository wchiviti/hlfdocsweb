package tech.hobbs.hlfdocmgmntsystem.dao;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.School;

public interface SchoolDao extends AbstractDaoInterface<School> {
	
	School findBySchoolName(String schoolName);

}
