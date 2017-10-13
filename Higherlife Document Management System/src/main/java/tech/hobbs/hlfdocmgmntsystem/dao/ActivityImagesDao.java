package tech.hobbs.hlfdocmgmntsystem.dao;

import java.awt.Image;
import java.time.LocalDate;
import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.model.Activity;
import tech.hobbs.hlfdocmgmntsystem.model.ActivityImage;

public interface ActivityImagesDao {
	
	public List<ActivityImage> findAll();
	
	public List<ActivityImage> findByActivityName(String activityName);
	
	public List<ActivityImage> findByDateOfActivity(LocalDate date);
	
	public void deleteActivityImage(ActivityImage image);
	
	public void deleteAllActivityImages(Activity activity);
	
	public void saveImages(List<Image> images);

}
