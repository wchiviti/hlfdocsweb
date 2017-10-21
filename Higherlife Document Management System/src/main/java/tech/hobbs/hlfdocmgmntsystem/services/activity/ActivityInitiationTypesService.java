package tech.hobbs.hlfdocmgmntsystem.services.activity;

import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.model.activity.ActivityInitiationType;

public interface ActivityInitiationTypesService {
	
	public List<ActivityInitiationType> findAll();
	
	public void delete(ActivityInitiationType activityInitiationType);
	
	public void saveOrUpdate(ActivityInitiationType activityInitiationType);
	
	public ActivityInitiationType findbyName(String activityInitiationTypeName);

}
