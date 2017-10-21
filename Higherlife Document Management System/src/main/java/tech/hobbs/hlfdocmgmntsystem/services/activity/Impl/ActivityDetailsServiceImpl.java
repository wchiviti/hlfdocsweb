package tech.hobbs.hlfdocmgmntsystem.services.activity.Impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tech.hobbs.hlfdocmgmntsystem.model.activity.ActivityDetail;
import tech.hobbs.hlfdocmgmntsystem.services.activity.ActivityDetailsService;

@Service
@Transactional
public class ActivityDetailsServiceImpl implements ActivityDetailsService {

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
