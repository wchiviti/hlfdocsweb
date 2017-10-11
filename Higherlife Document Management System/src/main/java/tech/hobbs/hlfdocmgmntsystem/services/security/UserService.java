package tech.hobbs.hlfdocmgmntsystem.services.security;

import tech.hobbs.hlfdocmgmntsystem.model.security.User;

public interface UserService {

	void saveOrUpdate(User user);
	
	User findById(int id);
	
	User findBySso(String sso);
	
}