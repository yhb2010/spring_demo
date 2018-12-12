package com.mvc.chapter7.domain;

import java.io.Serializable;

//JSR-303（javax.validation）只是一个规范，而Spring也没有对这一规范进行实现，那么当我们在SpringMVC中需要使用到JSR-303的时候就需要我们提供一个对JSR-303规范的实现，
//Hibernate Validator是实现了这一规范的，这里我将以它作为JSR-303的实现来讲解SpringMVC对JSR-303的支持。
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import org.springframework.stereotype.Repository;

@Repository
public class User implements Serializable {

	private static final long serialVersionUID = 6423882291665407349L;

	@NotNull
	private int id;

	@Size(min = 3, max = 20, message = "用户名长度必须是3-20")
	@Pattern(regexp = "^[a-zA-Z0-9]+$", message = "Username must be alphanumeric with no spaces")
	private String name;

	@Size(min = 3, max = 20, message = "密码长度必须是3-20")
	private String password;

	public User() {
	}

	public User(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password
				+ "]";
	}

}
