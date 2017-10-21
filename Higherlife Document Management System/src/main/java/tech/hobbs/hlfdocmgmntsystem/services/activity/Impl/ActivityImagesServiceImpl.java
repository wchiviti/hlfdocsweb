package tech.hobbs.hlfdocmgmntsystem.services.activity.Impl;

import java.awt.Image;
import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tech.hobbs.hlfdocmgmntsystem.model.activity.Activity;
import tech.hobbs.hlfdocmgmntsystem.model.activity.ActivityImage;
import tech.hobbs.hlfdocmgmntsystem.services.activity.ActivityImagesService;

@Service
@Transactional
public class ActivityImagesServiceImpl implements ActivityImagesService {

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
