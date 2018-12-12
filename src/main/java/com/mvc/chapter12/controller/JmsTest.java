package com.mvc.chapter12.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.mvc.chapter10.domain.User;
import com.mvc.chapter12.service.HelloServiceJms;

@Controller
public class JmsTest {

	@Autowired
	private HelloServiceJms helloServiceJms;

	@RequestMapping(value = { "/clientSayJms" }, method = RequestMethod.GET)
	public void clientSay(@RequestParam("name") String name) {
		User u = helloServiceJms.sayHello2(name);
		System.out.println("jms client:" + u);
	}

}
