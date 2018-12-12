package com.mvc.chapter9.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.mvc.chapter7.domain.User;

@Service("loginService2")
public class CustomerServiceImpl2 implements CustomerService {

	@Override
	public void execAuth(String s) {
		System.out.println("CustomerServiceImpl2.execAuth=" + s);
	}

	@Override
	@PreAuthorize("#s == '123'")
	public void execAuth2(String s) {
		System.out.println("CustomerServiceImpl2.execAuth2=" + s);
	}

	@Override
	public void execAuth3(String s, String username) {
		// TODO Auto-generated method stub

	}

	@Override
	public User execAuth4(String s) {
		// TODO Auto-generated method stub
		return null;
	}

}
