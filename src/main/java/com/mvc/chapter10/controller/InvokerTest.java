package com.mvc.chapter10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.chapter10.service.HelloService;
import com.mvc.chapter10.domain.User;

@Controller
public class InvokerTest {

	@Autowired
	private HelloService helloServiceInvoker;

	@RequestMapping(value = { "/clientSayInvoker" }, method = RequestMethod.GET)
	public void clientSay(@RequestParam("name") String name) {
		User u = helloServiceInvoker.sayHello2(name);
		System.out.println("Invoker client:" + u);
	}

}
