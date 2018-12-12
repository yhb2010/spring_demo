package com.mvc.chapter9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.mvc.chapter9.service.CustomerService;

@Controller
public class LoginController {
	@Autowired
	@Qualifier("loginService")
	private CustomerService customerService;

	@RequestMapping(value = "/security/login", method = RequestMethod.GET)
	public String showLogin() {
		return "login/login";
	}

	@RequestMapping(value = "/security/loginsuccess", method = RequestMethod.GET)
	public String loginSuccess() {
		return "login/loginsuccess";
	}

	@RequestMapping(value = "/security/exec", method = RequestMethod.GET)
	public String exec() {
		try {
			customerService.execAuth("输出了");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "login/exec";
	}

	@RequestMapping(value = "/security/exec2", method = RequestMethod.POST)
	public String exec2(@RequestParam("inputs") String input) {
		try {
			customerService.execAuth2(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "login/exec2";
	}

	@RequestMapping(value = "/security/exec3", method = RequestMethod.GET)
	public String exec3() {
		try {
			customerService.execAuth3("输出了", "admin");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "login/exec2";
	}

	@RequestMapping(value = "/security/exec4", method = RequestMethod.POST)
	public String exec4(@RequestParam("searchName") String input) {
		try {
			customerService.execAuth4(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "login/exec2";
	}

}
