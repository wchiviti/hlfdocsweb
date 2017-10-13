package tech.hobbs.hlfdocmgmntsystem.dao;

import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.Group;
import tech.hobbs.hlfdocmgmntsystem.model.Student;
import tech.hobbs.hlfdocmgmntsystem.model.User;

public interface UserDao extends AbstractDaoInterface<User> {
	
	User findById(int id);
	
	User findByUsername(String username);
	
	List<User> findByGroupId(Group group);
	
	User findByStudentFileNumber(Student student);

}
