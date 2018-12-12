package com.mvc.chapter8.flow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.mvc.chapter8.flow.domain.Order;
import com.mvc.chapter8.flow.service.CustomerService;

@Controller
public class OrderController {

	@Autowired
	private CustomerService customerService;

	public void saveOrder(Order order) {
		System.out.println(order);
	}

}
