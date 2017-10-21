package tech.hobbs.hlfdocmgmntsystem.dao.activity;

import java.awt.Image;
import java.time.LocalDate;
import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.model.activity.Activity;
import tech.hobbs.hlfdocmgmntsystem.model.activity.ActivityImage;

public interface ActivityImagesDao {
	
	public List<ActivityImage> findAll();
	
	public List<ActivityImage> findByActivityName(String activityName);
	
	public List<ActivityImage> findByDateOfActivity(LocalDate date);
	
	public void deleteActivityImage(ActivityImage image);
	
	public void deleteAllActivityImages(Activity activity);
	
	public void saveImages(List<Image> images);

}
