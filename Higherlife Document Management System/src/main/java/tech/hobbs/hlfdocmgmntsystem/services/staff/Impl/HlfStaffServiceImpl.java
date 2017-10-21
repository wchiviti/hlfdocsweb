package tech.hobbs.hlfdocmgmntsystem.services.staff.Impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tech.hobbs.hlfdocmgmntsystem.model.staff.HlfStaffMember;
import tech.hobbs.hlfdocmgmntsystem.services.staff.HlfstaffService;

@Service
@Transactional
public class HlfStaffServiceImpl implements HlfstaffService {

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
