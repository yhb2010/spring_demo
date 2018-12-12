package com.mvc.chapter8.flow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mvc.chapter8.flow.CustomerNotFoundException;
import com.mvc.chapter8.flow.domain.Customer;
import com.mvc.chapter8.flow.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	public Customer lookupCustomer(String phoneNumber)
			throws CustomerNotFoundException {
		customerService.init();
		Customer customer = customerService.lookupCustomer(phoneNumber);
		if (customer != null) {
			return customer;
		} else {
			throw new CustomerNotFoundException();
		}
	}

	public boolean checkDeliveryArea(String zipCode) {
		return "100022".equals(zipCode);
	}

	public void addCustomer(Customer customer) {
		List<Customer> initCustomerList = customerService.getInitCustomerList();
		initCustomerList.add(customer);
	}

}
