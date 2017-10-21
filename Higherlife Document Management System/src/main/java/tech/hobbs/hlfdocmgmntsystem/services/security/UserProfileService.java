package tech.hobbs.hlfdocmgmntsystem.services.security;

import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.model.security.UserProfile;
import tech.hobbs.hlfdocmgmntsystem.model.security.UserProfileType;
import tech.hobbs.hlfdocmgmntsystem.services.genericService.AbstractServiceInterface;


public interface UserProfileService extends AbstractServiceInterface<UserProfile>{

	List<UserProfile> findAll();
	
	UserProfile findByType(UserProfileType userProfileType);
	
	UserProfile findById(int id);
}
