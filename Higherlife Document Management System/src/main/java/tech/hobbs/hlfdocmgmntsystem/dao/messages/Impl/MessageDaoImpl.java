package tech.hobbs.hlfdocmgmntsystem.dao.messages.Impl;

import java.util.List;

import javax.mail.Message;

import org.springframework.stereotype.Repository;

import tech.hobbs.hlfdocmgmntsystem.dao.messages.MessageDao;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;

@Repository
public class MessageDaoImpl implements MessageDao {

	@Override
	public List<Message> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Message model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Message model) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Message> findByRecipientFileno(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> findBySenderFileno(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> findByReadStatus(Boolean status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> findAllTrashed() {
		// TODO Auto-generated method stub
		return null;
	}

}
