package com.coldboold.dao.impl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.coldboold.dao.IUserDao;
import com.coldboold.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/applicationContext.xml" })
public class UserDaoImplTest extends AbstractJUnit4SpringContextTests{
	
	@Autowired
	private IUserDao dao;
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
	}
	
	@Before
	public void before(){
		System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
	}
	
	@Test
	public void testInsert(){
		User user = new User();
		user.setAge(21);
		user.setUsername("u2");
		user.setPassword("p2");
		dao.insertUser(user);
	}
	
	@Test
	public void testFindAll(){
		System.out.println(dao.findAllUsers());
	}
	
	@Test
	public void testRollback(){
		User user = new User();
		user.setAge(21);
		user.setUsername("u22");
		user.setPassword("p22");
//		dao.testRollback(user);
		System.out.println(12321);
	}
	
	@After
	public void after(){
		System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
	}
}
