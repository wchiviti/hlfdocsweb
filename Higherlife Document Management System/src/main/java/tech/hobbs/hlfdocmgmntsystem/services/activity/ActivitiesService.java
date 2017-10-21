package tech.hobbs.hlfdocmgmntsystem.services.activity;

import java.time.LocalDate;
import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.model.activity.Activity;

public interface ActivitiesService {
	
	public List<Activity> findAll();
	
	public Activity findActivityById(String activityId);
	
	public Activity findByOrgarnizer(String organizer);
	
	public Activity findByActivityName(String name);
	
	public Activity findByDateOfActivity(LocalDate date);
	
	public void saveOrUpdate(Activity activity);
	
	public void deleteActivity(Activity activity);

}
