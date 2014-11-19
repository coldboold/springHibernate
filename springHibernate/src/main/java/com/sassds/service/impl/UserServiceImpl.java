package com.sassds.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sassds.dao.IUserDao;
import com.sassds.model.User;
import com.sassds.service.IUserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	IUserDao userDao;

	@Override
	public List<User> findAllUsers() {
		return userDao.findAllUsers();
	}
}