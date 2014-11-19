package com.coldboold.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coldboold.dao.IUserDao;
import com.coldboold.model.User;

@Repository
public class UserDaoImpl implements IUserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<User> findAllUsers() {
		Session session = sessionFactory.getCurrentSession();
		String hql = "FROM User";
		Query q = session.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> list = q.list();
		return list;
	}

	@Override
	public void insertUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}

	@Override
	public void testRollback(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		int a = 3/0;
		System.out.println(a);
	}

}