package tech.hobbs.hlfdocmgmntsystem.services.activity.Impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tech.hobbs.hlfdocmgmntsystem.model.activity.Activity;
import tech.hobbs.hlfdocmgmntsystem.services.activity.ActivitiesService;


@Service
@Transactional
public class ActivitiesServiceImpl implements ActivitiesService{

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
