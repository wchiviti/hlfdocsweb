package tech.hobbs.hlfdocmgmntsystem.dao.security;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.security.UserPicture;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;

public interface UserPictureDao extends AbstractDaoInterface<UserPicture>{
	
	UserPicture findByFileno(Student student);

}
