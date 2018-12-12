package com.mvc.chapter7.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.mvc.chapter7.domain.User;
import com.mvc.chapter7.service.UserService;

@Controller
public class HomeController {

	private UserService userService;

	@Autowired
	public HomeController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String showHomePage(Map<String, Object> model) {
		model.put("users", userService.getRecentUsers(10));
		return "home";
	}

	// params=new：请求中必须包含名为new的参数
	@RequestMapping(method = RequestMethod.GET, params = "new")
	public String createUser(Model model) {
		model.addAttribute(new User());
		return "user/edit";
	}

}
