package tech.hobbs.hlfdocmgmntsystem.dao.parameters.Impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import tech.hobbs.hlfdocmgmntsystem.dao.parameters.TertiaryInstitutionDao;
import tech.hobbs.hlfdocmgmntsystem.model.parameters.TertiaryInstitution;

@Repository
public class TertiaryInstitutionDaoImpl implements TertiaryInstitutionDao {

	@Override
	public List<TertiaryInstitution> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(TertiaryInstitution model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TertiaryInstitution model) {
		// TODO Auto-generated method stub

	}

	@Override
	public TertiaryInstitution findByTertiaryCode(String tertiaryCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TertiaryInstitution findByTertiaryName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
