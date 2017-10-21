package tech.hobbs.hlfdocmgmntsystem.services.security.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tech.hobbs.hlfdocmgmntsystem.dao.security.UserProfileDao;
import tech.hobbs.hlfdocmgmntsystem.model.security.UserProfile;
import tech.hobbs.hlfdocmgmntsystem.model.security.UserProfileType;
import tech.hobbs.hlfdocmgmntsystem.services.security.UserProfileService;



@Service()
@Transactional
public class UserProfileServiceImpl implements UserProfileService{
	
	@Autowired
	UserProfileDao userProfileDao;
	
	public List<UserProfile> findAll() {
		return userProfileDao.findAll();
	}

	public UserProfile findByType(UserProfileType userProfileType){
		return userProfileDao.findByType(userProfileType);
	}

	public UserProfile findById(int id) {
		return userProfileDao.findById(id);
	}

	@Override
	public void saveOrUpdate(UserProfile model) {
		userProfileDao.saveOrUpdate(model);		
	}

	@Override
	public void delete(UserProfile model) {
		userProfileDao.delete(model);
	}
}
