package tech.hobbs.hlfdocmgmntsystem.dao.activity;

import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.model.activity.ActivityDetail;

public interface ActivityDetailsDao {
	
	public ActivityDetail findByImpartedPeople(int numberOfImpartedPeople);
	
	public List<ActivityDetail> findAll();

	public void saveOrUpdate(ActivityDetail activity);

	public void deleteActivity(ActivityDetail activity);

}
