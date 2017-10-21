package tech.hobbs.hlfdocmgmntsystem.dao.activity.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import tech.hobbs.hlfdocmgmntsystem.dao.activity.ActivityDetailsDao;
import tech.hobbs.hlfdocmgmntsystem.model.activity.ActivityDetail;

@Repository
public class ActivityDetailsDaoImpl implements ActivityDetailsDao {

	@Override
	public ActivityDetail findByImpartedPeople(int numberOfImpartedPeople) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ActivityDetail> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(ActivityDetail activity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteActivity(ActivityDetail activity) {
		// TODO Auto-generated method stub

	}

}
