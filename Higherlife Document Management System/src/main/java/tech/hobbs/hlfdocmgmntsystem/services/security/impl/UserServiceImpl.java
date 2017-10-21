package tech.hobbs.hlfdocmgmntsystem.services.security.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tech.hobbs.hlfdocmgmntsystem.dao.security.UserDao;
import tech.hobbs.hlfdocmgmntsystem.model.security.User;
import tech.hobbs.hlfdocmgmntsystem.services.security.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	
	public void saveOrUpdate(User user){
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userDao.saveOrUpdate(user);
	}
	
	public User findById(int id) {
		return userDao.findById(id);
	}

	public User findBySso(String sso) {
		return userDao.findBySSO(sso);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public void delete(User model) {
		userDao.delete(model);
	}
	
}
