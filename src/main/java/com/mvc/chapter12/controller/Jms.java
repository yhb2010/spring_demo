package com.mvc.chapter12.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.mvc.chapter12.service.AlertService;
import com.mvc.chapter7.service.UserService;

@Controller
@RequestMapping("/jms")
public class Jms {

	@Autowired
	private AlertService alertService;
	@Autowired
	private UserService userService;

	// 针对/users/user的get请求
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public void listUserByName(@RequestParam("name") String username) {
		for (int i = 1; i <= 5; i++) {
			alertService.sendSpittleAlert(userService.getUserByName(username
					+ i));
		}
	}

}
