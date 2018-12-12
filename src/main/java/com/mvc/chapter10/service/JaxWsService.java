package com.mvc.chapter10.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.mvc.chapter10.domain.User;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface JaxWsService {

	@WebMethod
	String sayHello(String name);

	@WebMethod
	User sayHello2(String name);

}
