package tech.hobbs.hlfdocmgmntsystem.dao.activity.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import tech.hobbs.hlfdocmgmntsystem.dao.activity.ActivityInitiationTypesDao;
import tech.hobbs.hlfdocmgmntsystem.model.activity.ActivityInitiationType;

@Repository
public class ActivityInitiationTpesDaoImpl implements ActivityInitiationTypesDao {

	@Override
	public List<ActivityInitiationType> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(ActivityInitiationType activityInitiationType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveOrUpdate(ActivityInitiationType activityInitiationType) {
		// TODO Auto-generated method stub

	}

	@Override
	public ActivityInitiationType findbyName(String activityInitiationTypeName) {
		// TODO Auto-generated method stub
		return null;
	}

}
