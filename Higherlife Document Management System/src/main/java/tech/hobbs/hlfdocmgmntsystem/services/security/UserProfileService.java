package tech.hobbs.hlfdocmgmntsystem.services.security;

import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.model.security.UserProfile;


public interface UserProfileService {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
