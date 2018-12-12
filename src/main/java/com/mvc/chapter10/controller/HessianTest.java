package com.mvc.chapter10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.chapter10.service.HelloService;

@Controller
public class HessianTest {

	@Autowired
	private HelloService helloServiceHessian;

	@RequestMapping(value = { "/clientSayHessian" }, method = RequestMethod.GET)
	public void clientSay(@RequestParam("name") String name) {
		String s = helloServiceHessian.sayHello(name);
		System.out.println("Hssian client:" + s);
	}

}
