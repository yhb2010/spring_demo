package com.mvc.chapter10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.chapter10.service.HelloService;

@Controller
public class RmiTest {

	@Autowired
	private HelloService helloService;

	@RequestMapping(value = { "/clientSay" }, method = RequestMethod.GET)
	public void clientSay(@RequestParam("name") String name) {
		String s = helloService.sayHello(name);
		System.out.println("rmi client:" + s);
	}

}
