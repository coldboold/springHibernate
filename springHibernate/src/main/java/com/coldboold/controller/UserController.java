package com.coldboold.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coldboold.model.User;
import com.coldboold.service.IUserService;

@Controller
public class UserController {
	@Autowired
	IUserService userService;

	public UserController() {
	}

	@RequestMapping(value = "/show")
	public ModelAndView myMethod(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap)
			throws Exception {
		List<User> ulst = userService.findAllUsers();
		modelMap.put("users", ulst);
		return new ModelAndView("showUser", modelMap);
	}

	@RequestMapping(value = "/t")
	public ModelAndView t() {
		return new ModelAndView("t");
	}

}