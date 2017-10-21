package tech.hobbs.hlfdocmgmntsystem.dao.activity.impl;

import java.awt.Image;
import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import tech.hobbs.hlfdocmgmntsystem.dao.activity.ActivityImagesDao;
import tech.hobbs.hlfdocmgmntsystem.model.activity.Activity;
import tech.hobbs.hlfdocmgmntsystem.model.activity.ActivityImage;

@Repository
public class ActivityImagesDaoImpl implements ActivityImagesDao {

	@Override
	public List<ActivityImage> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ActivityImage> findByActivityName(String activityName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ActivityImage> findByDateOfActivity(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteActivityImage(ActivityImage image) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllActivityImages(Activity activity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveImages(List<Image> images) {
		// TODO Auto-generated method stub

	}

}
