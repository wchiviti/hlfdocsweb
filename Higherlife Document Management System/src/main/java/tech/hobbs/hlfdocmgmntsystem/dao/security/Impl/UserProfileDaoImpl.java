package tech.hobbs.hlfdocmgmntsystem.dao.security.Impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tech.hobbs.hlfdocmgmntsystem.dao.security.UserProfileDao;
import tech.hobbs.hlfdocmgmntsystem.model.security.UserProfile;
import tech.hobbs.hlfdocmgmntsystem.model.security.UserProfileType;

@Repository("userProfileDao")
public class UserProfileDaoImpl implements UserProfileDao{
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<UserProfile> findAll(){
		Session session = sessionFactory.getCurrentSession();
		TypedQuery<UserProfile> query = session.createNamedQuery("UserProfile.findAll",UserProfile.class);
		List<UserProfile> userProfilelist = query.getResultList();
		session.flush();
		return userProfilelist;
	}
	
	@Override
	public UserProfile findById(int id) {
		Session session = sessionFactory.getCurrentSession();
		TypedQuery<UserProfile> query = session.createNamedQuery("UserProfile.findByGroupId",UserProfile.class)
				.setParameter("groupId", id);
		UserProfile userProfile = query.getSingleResult();
		session.flush();
		return userProfile;
	}
	
	@Override
	public UserProfile findByType(UserProfileType userProfileType) {
		Session session = sessionFactory.getCurrentSession();
		TypedQuery<UserProfile> query = session.createNamedQuery("UserProfile.findByGroupName",UserProfile.class)
				.setParameter("groupName", userProfileType.getUserProfileType());
		UserProfile userProfile = query.getSingleResult();
		session.flush();
		return userProfile;
	}

	@Override
	public void saveOrUpdate(UserProfile model) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(model);
		session.flush();
	}

	@Override
	public void delete(UserProfile model) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(model);
		session.flush();
	}

}
