package tech.hobbs.hlfdocmgmntsystem.dao.security;

import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.security.UserProfile;
import tech.hobbs.hlfdocmgmntsystem.model.security.UserProfileType;

public interface UserProfileDao extends AbstractDaoInterface<UserProfile> {

	List<UserProfile> findAll();
	
	UserProfile findByType(UserProfileType userProfileType);
	
	UserProfile findById(int id);
	
}
