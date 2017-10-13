package tech.hobbs.hlfdocmgmntsystem.dao;

import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.model.ActivityDetails;

public interface ActivityDetailsDao {
	
	public ActivityDetails findByImpartedPeople(int numberOfImpartedPeople);
	
	public List<ActivityDetails> findAll();

	public void saveOrUpdate(ActivityDetails activity);

	public void deleteActivity(ActivityDetails activity);

}
