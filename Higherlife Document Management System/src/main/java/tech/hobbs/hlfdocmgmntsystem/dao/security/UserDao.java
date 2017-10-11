package tech.hobbs.hlfdocmgmntsystem.dao.security;

import tech.hobbs.hlfdocmgmntsystem.model.security.User;

public interface UserDao {
	User findById(int id);
	
	User findBySSO(String sso);
	void saveOrUpdate(User user);
}

