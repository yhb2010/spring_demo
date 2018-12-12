package com.mvc.chapter8.flow.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mvc.chapter8.flow.CustomerNotFoundException;
import com.mvc.chapter8.flow.domain.Customer;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	public static List<Customer> initCustomerList = null;

	public void init() {
		if (initCustomerList == null) {
			initCustomerList = new ArrayList<Customer>();
			Customer customer = new Customer();
			customer.setId(123);
			customer.setName("张苏磊");
			customer.setAddress("武胜北路16号");
			customer.setCity("北京");
			customer.setState("朝阳区");
			customer.setZipCode("100022");
			customer.setPhoneNumber("13269606741");
			initCustomerList.add(customer);
		}
	}

	public CustomerServiceImpl() {
	}

	public Customer lookupCustomer(String phoneNumber)
			throws CustomerNotFoundException {

		for (Customer c : initCustomerList) {
			if (c.getPhoneNumber().equals(phoneNumber)) {
				return c;
			}
		}

		throw new CustomerNotFoundException();
	}

	@Override
	public List<Customer> getInitCustomerList() {
		return initCustomerList;
	}

}
