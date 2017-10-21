package tech.hobbs.hlfdocmgmntsystem.services.activity.Impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tech.hobbs.hlfdocmgmntsystem.model.activity.ActivityInitiationType;
import tech.hobbs.hlfdocmgmntsystem.services.activity.ActivityInitiationTypesService;

@Service
@Transactional
public class ActivityInitiationTpesServiceImpl implements ActivityInitiationTypesService {

	@Override
	public List<ActivityInitiationType> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(ActivityInitiationType activityInitiationType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveOrUpdate(ActivityInitiationType activityInitiationType) {
		// TODO Auto-generated method stub

	}

	@Override
	public ActivityInitiationType findbyName(String activityInitiationTypeName) {
		// TODO Auto-generated method stub
		return null;
	}

}
