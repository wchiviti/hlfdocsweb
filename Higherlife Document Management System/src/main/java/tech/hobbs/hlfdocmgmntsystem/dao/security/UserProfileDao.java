package tech.hobbs.hlfdocmgmntsystem.dao.security;

import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.model.security.UserProfile;

public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
