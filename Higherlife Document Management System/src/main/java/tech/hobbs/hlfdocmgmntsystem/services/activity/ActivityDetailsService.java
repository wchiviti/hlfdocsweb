package tech.hobbs.hlfdocmgmntsystem.services.activity;

import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.model.activity.ActivityDetail;

public interface ActivityDetailsService {
	
	public ActivityDetail findByImpartedPeople(int numberOfImpartedPeople);
	
	public List<ActivityDetail> findAll();

	public void saveOrUpdate(ActivityDetail activity);

	public void deleteActivity(ActivityDetail activity);

}
