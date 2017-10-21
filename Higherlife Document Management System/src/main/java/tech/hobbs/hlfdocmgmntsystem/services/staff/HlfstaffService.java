package tech.hobbs.hlfdocmgmntsystem.services.staff;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.staff.HlfStaffMember;

public interface HlfstaffService extends AbstractDaoInterface<HlfStaffMember> {
	
	HlfStaffMember findByFileno(String fileNo);
	
	HlfStaffMember findByName(String name);
	
	HlfStaffMember findByEmailAddress(String emailAddrees);
	
	HlfStaffMember findBySurname(String surname);

}
