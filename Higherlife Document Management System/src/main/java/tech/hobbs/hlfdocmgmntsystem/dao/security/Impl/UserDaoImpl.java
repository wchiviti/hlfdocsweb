package tech.hobbs.hlfdocmgmntsystem.dao.security.Impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tech.hobbs.hlfdocmgmntsystem.dao.security.UserDao;
import tech.hobbs.hlfdocmgmntsystem.model.security.User;



@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User findById(int id) {
		Session session = sessionFactory.getCurrentSession();
		TypedQuery<User> query = session.createNamedQuery("User.findById",User.class)
				.setParameter("id", id);
		User user = query.getSingleResult();
		session.flush();
		return user;
	}

	@Override
	public User findBySSO(String ssoId) {
		Session session = sessionFactory.getCurrentSession();
		TypedQuery<User> query = session.createNamedQuery("User.findBySsoId",User.class)
				.setParameter("ssoId", ssoId);
		User user = query.getSingleResult();
		session.flush();
		return user;
	}

	@Override
	public List<User> findAll() {
		Session session = sessionFactory.getCurrentSession();
		TypedQuery<User> query = session.createNamedQuery("User.findAll",User.class);
		List<User> allUserList = query.getResultList();
		session.flush();
		return allUserList;
	}

	@Override
	public void saveOrUpdate(User model) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(model);
		session.flush();
	}

	@Override
	public void delete(User model) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(model);
		session.flush();
	}

}
