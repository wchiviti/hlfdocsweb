package tech.hobbs.hlfdocmgmntsystem.dao.parameters.Impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import tech.hobbs.hlfdocmgmntsystem.dao.parameters.SchoolDao;
import tech.hobbs.hlfdocmgmntsystem.model.parameters.School;

@Repository
public class SchoolDaoImpl implements SchoolDao {

	@Override
	public List<School> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(School model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(School model) {
		// TODO Auto-generated method stub

	}

	@Override
	public School findBySchoolName(String schoolName) {
		// TODO Auto-generated method stub
		return null;
	}

}
