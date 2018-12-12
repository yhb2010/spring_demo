package com.mvc.chapter10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.chapter10.domain.User;
import com.mvc.chapter10.service.JaxWsService;

@Controller
public class JaxWsTest {

	@Autowired
	private JaxWsService jaxWsService;

	@RequestMapping(value = { "/clientSayJaxWs" }, method = RequestMethod.GET)
	public void clientSay(@RequestParam("name") String name) {
		User u = jaxWsService.sayHello2(name);
		System.out.println("JaxWs client:" + u);
	}

}
