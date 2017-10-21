package tech.hobbs.hlfdocmgmntsystem.services.activity.Impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tech.hobbs.hlfdocmgmntsystem.model.activity.Activity;
import tech.hobbs.hlfdocmgmntsystem.model.activity.ActivityVideo;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;
import tech.hobbs.hlfdocmgmntsystem.services.activity.ActivityVideoService;

@Service
@Transactional
public class ActivityVideoServiceImpl implements ActivityVideoService {

	@Override
	public List<ActivityVideo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(ActivityVideo model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(ActivityVideo model) {
		// TODO Auto-generated method stub

	}

	@Override
	public ActivityVideo findByActivityName(Activity activity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActivityVideo findByUploader(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

}
