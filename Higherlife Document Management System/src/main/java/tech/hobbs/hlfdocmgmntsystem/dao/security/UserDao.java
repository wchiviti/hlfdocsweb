package tech.hobbs.hlfdocmgmntsystem.dao.security;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.security.User;

public interface UserDao extends AbstractDaoInterface<User>{
	
	User findById(int id);
	
	User findBySSO(String sso);
}

