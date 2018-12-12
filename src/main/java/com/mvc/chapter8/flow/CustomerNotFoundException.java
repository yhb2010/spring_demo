package com.mvc.chapter8.flow;

@SuppressWarnings("serial")
public class CustomerNotFoundException extends Exception {
	public CustomerNotFoundException() {
	}

	public CustomerNotFoundException(String message) {
		super(message);
	}
}
