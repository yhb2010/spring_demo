package com.mvc.chapter11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.mvc.chapter7.service.UserService;

@Controller
@RequestMapping("/restful")
public class RESTFulController {

	private UserService userService;

	@Autowired
	public RESTFulController(UserService userService) {
		this.userService = userService;
	}

	// @PathVariable：使用路径中的占位符变量
	@RequestMapping(value = "/users/{id}/{name}", method = RequestMethod.GET)
	public String listUserByName(@PathVariable("id") int id,
			@PathVariable("name") String name, Model model) {
		System.out.println(id);
		model.addAttribute(userService.getUserByName(name));
		return "user/detail";
	}

}
