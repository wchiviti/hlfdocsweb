package tech.hobbs.hlfdocmgmntsystem.dao.staff.Impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import tech.hobbs.hlfdocmgmntsystem.dao.staff.HlfstaffDao;
import tech.hobbs.hlfdocmgmntsystem.model.staff.HlfStaffMember;

@Repository
public class HlfStaffDaoImpl implements HlfstaffDao {

	@Override
	public List<HlfStaffMember> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(HlfStaffMember model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(HlfStaffMember model) {
		// TODO Auto-generated method stub

	}

	@Override
	public HlfStaffMember findByFileno(String fileNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HlfStaffMember findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HlfStaffMember findByEmailAddress(String emailAddrees) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HlfStaffMember findBySurname(String surname) {
		// TODO Auto-generated method stub
		return null;
	}

}
