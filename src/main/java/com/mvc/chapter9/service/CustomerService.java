package com.mvc.chapter9.service;

import com.mvc.chapter7.domain.User;

public interface CustomerService {

	public void execAuth(String s);

	public void execAuth2(String s);

	public void execAuth3(String s, String username);

	public User execAuth4(String s);

}