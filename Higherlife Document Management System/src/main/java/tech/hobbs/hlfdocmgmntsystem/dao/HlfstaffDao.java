package tech.hobbs.hlfdocmgmntsystem.dao;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.HlfStaff;

public interface HlfstaffDao extends AbstractDaoInterface<HlfStaff> {
	
	HlfStaff findByFileno(String fileNo);
	
	HlfStaff findByName(String name);
	
	HlfStaff findByEmailAddress(String emailAddrees);
	
	HlfStaff findBySurname(String surname);

}
