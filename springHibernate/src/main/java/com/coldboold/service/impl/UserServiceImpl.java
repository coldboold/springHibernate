package com.coldboold.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coldboold.dao.IUserDao;
import com.coldboold.model.User;
import com.coldboold.service.IUserService;

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