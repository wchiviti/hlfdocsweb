package tech.hobbs.hlfdocmgmntsystem.dao.activity.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import tech.hobbs.hlfdocmgmntsystem.dao.activity.ActivitiesDao;
import tech.hobbs.hlfdocmgmntsystem.model.activity.Activity;

@Repository
public class ActivitiesDaoimpl implements ActivitiesDao{

	@Override
	public List<Activity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Activity findActivityById(String activityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Activity findByOrgarnizer(String organizer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Activity findByActivityName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Activity findByDateOfActivity(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Activity activity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteActivity(Activity activity) {
		// TODO Auto-generated method stub
		
	}
	
	

}
