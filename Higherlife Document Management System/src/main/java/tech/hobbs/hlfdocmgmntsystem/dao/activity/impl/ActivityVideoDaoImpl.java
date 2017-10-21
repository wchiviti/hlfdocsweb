package tech.hobbs.hlfdocmgmntsystem.dao.activity.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import tech.hobbs.hlfdocmgmntsystem.dao.activity.ActivityVideoDao;
import tech.hobbs.hlfdocmgmntsystem.model.activity.Activity;
import tech.hobbs.hlfdocmgmntsystem.model.activity.ActivityVideo;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;

@Repository
public class ActivityVideoDaoImpl implements ActivityVideoDao {

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
