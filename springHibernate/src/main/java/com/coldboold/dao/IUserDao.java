package com.coldboold.dao;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.coldboold.model.User;

@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public interface IUserDao {
	public List<User> findAllUsers();
	public void insertUser(User user);
	public void testRollback(User user);
}
