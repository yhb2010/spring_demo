package com.mvc.chapter9.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.mvc.chapter7.domain.User;

@Service("loginService")
public class CustomerServiceImpl implements CustomerService {

	@Override
	@Secured("ROLE_TEST")
	public void execAuth(String s) {
		System.out.println("username=" + getAuthenticatedUsername());
		System.out.println("execAuth=" + s);
	}

	// @PreAuthorize，它可以决定一个方法是否可以被调用
	// @PreAuthorize("hasPermission(#contact, 'admin')")
	// 这里我们使用了方法参数作为表达式的一部分来决定是否当前的用户拥有“admin”
	@Override
	@PreAuthorize("(hasRole('ROLE_MVC') and #s.length()==0) or hasRole('ROLE_ADMIN')")
	public void execAuth2(String s) {
		System.out.println("execAuth2=" + s);
	}

	@Override
	// 登录用户必须等于username的值
	@PreAuthorize("#username == principal.username")
	public void execAuth3(String s, String username) {
		System.out.println("execAuth3=" + s);
	}

	@Override
	// 对方法的返回值进行验证
	@PostAuthorize("returnObject.name == principal.username")
	public User execAuth4(String s) {
		List<User> us = getRecentUsers(10);
		for (User user : us) {
			if (user.getName().equals(s)) {
				System.out.println("execAuth4=" + s);
				return user;
			}
		}
		return null;
	}

	public static List<User> recentSpittles = null;

	public List<User> getRecentUsers(int count) {
		if (recentSpittles == null) {
			recentSpittles = new ArrayList<User>(count);
			recentSpittles.add(new User(1, "zhangsulei", "123"));
			recentSpittles.add(new User(2, "chenli", "123"));
			recentSpittles.add(new User(3, "admin", "123"));
		}
		return recentSpittles;
	}

	public static String getAuthenticatedUsername() {
		String username = null;
		// SecurityContext接口表示的是当前应用的安全上下文，通过此接口可以获取和设置当前的认证对象
		SecurityContext context = SecurityContextHolder.getContext();
		// Authentication接口用来表示此认证对象。通过认证对象的方法可以判断当前用户是否已经通过认证，以及获取当前认证用户的相关信息，包括用户名、密码和权限等。
		Authentication auth = context.getAuthentication();
		// 获得当前的认证主体，通常是 UserDetails 接口的实现。
		Object principal = auth.getPrincipal();
		if (principal instanceof UserDetails) {
			username = ((UserDetails) principal).getUsername();
		} else {
			username = principal.toString();
		}
		return username;
	}

}
