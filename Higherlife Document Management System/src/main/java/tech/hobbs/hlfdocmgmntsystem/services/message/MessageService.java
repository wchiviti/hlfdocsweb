package tech.hobbs.hlfdocmgmntsystem.services.message;

import java.util.List;

import javax.mail.Message;

import tech.hobbs.hlfdocmgmntsystem.model.student.Student;
import tech.hobbs.hlfdocmgmntsystem.services.genericService.AbstractServiceInterface;

public interface MessageService extends AbstractServiceInterface<Message>{
	
	List<Message> findByRecipientFileno(Student student);
	
	List<Message> findBySenderFileno(Student student);
	
	List<Message> findByReadStatus(Boolean status);
	
	List<Message> findAllTrashed();

}
