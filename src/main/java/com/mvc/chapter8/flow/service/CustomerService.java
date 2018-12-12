package com.mvc.chapter8.flow.service;

import java.util.List;

import com.mvc.chapter8.flow.CustomerNotFoundException;
import com.mvc.chapter8.flow.domain.Customer;

public interface CustomerService {

	public List<Customer> getInitCustomerList();

	void init();

	Customer lookupCustomer(String phoneNumber)
			throws CustomerNotFoundException;

}