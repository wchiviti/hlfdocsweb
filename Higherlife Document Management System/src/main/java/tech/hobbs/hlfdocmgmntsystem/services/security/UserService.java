package tech.hobbs.hlfdocmgmntsystem.services.security;

import tech.hobbs.hlfdocmgmntsystem.model.security.User;
import tech.hobbs.hlfdocmgmntsystem.services.genericService.AbstractServiceInterface;

public interface UserService extends AbstractServiceInterface<User>{

	void saveOrUpdate(User user);
	
	User findById(int id);
	
	User findBySso(String sso);
	
}