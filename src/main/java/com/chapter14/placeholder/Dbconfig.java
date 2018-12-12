package com.chapter14.placeholder;

import org.springframework.beans.factory.annotation.Value;

import com.chapter2.constructor.PerformanceException;

public class Dbconfig {

	private String url;
	private String username;
	private String password;
	@Value("${db.password2}")
	private String password2;

	public void show() throws PerformanceException {
		System.out.print("url=" + url + ", username=" + username
				+ ", password=" + password + ", password2=" + password2);
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
