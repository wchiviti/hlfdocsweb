package tech.hobbs.hlfdocmgmntsystem.dao;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.HlfStaffMember;

public interface HlfstaffDao extends AbstractDaoInterface<HlfStaffMember> {
	
	HlfStaffMember findByFileno(String fileNo);
	
	HlfStaffMember findByName(String name);
	
	HlfStaffMember findByEmailAddress(String emailAddrees);
	
	HlfStaffMember findBySurname(String surname);

}
