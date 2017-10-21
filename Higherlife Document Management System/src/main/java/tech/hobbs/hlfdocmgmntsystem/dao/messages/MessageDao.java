package tech.hobbs.hlfdocmgmntsystem.dao.messages;

import java.util.List;

import javax.mail.Message;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;

public interface MessageDao extends AbstractDaoInterface<Message>{
	
	List<Message> findByRecipientFileno(Student student);
	
	List<Message> findBySenderFileno(Student student);
	
	List<Message> findByReadStatus(Boolean status);
	
	List<Message> findAllTrashed();

}
