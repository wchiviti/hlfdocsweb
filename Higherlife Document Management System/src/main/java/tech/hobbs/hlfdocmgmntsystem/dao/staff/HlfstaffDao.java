package tech.hobbs.hlfdocmgmntsystem.dao.staff;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.staff.HlfStaffMember;

public interface HlfstaffDao extends AbstractDaoInterface<HlfStaffMember> {
	
	HlfStaffMember findByFileno(String fileNo);
	
	HlfStaffMember findByName(String name);
	
	HlfStaffMember findByEmailAddress(String emailAddrees);
	
	HlfStaffMember findBySurname(String surname);

}
