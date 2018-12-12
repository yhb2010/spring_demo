package com.mvc.chapter9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.chapter9.service.CustomerService;

@Controller
public class LoginController2 {
	@Autowired
	@Qualifier("loginService2")
	private CustomerService customerService;

	@RequestMapping(value = "/security2/exec", method = RequestMethod.GET)
	public String exec() {
		try {
			customerService.execAuth("输出了");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "login/exec";
	}

	@RequestMapping(value = "/security2/exec2", method = RequestMethod.POST)
	public String exec2(@RequestParam("inputs") String input) {
		try {
			customerService.execAuth2(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "login/exec";
	}

}
