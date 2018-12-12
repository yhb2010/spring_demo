package com.mvc.chapter7.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.mvc.chapter7.domain.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	public static List<User> recentSpittles = null;

	public List<User> getRecentUsers(int count) {
		if (recentSpittles == null) {
			recentSpittles = new ArrayList<User>(count);
			recentSpittles.add(new User(1, "zhang1", "123"));
			recentSpittles.add(new User(2, "zhang2", "123"));
			recentSpittles.add(new User(3, "zhang3", "123"));
			recentSpittles.add(new User(4, "zhang4", "123"));
			recentSpittles.add(new User(5, "zhang5", "123"));
		}
		return recentSpittles;
	}

	@Override
	public User getUserByName(String name) {
		List<User> l = getRecentUsers(10);
		for (User user : l) {
			if (user.getName().equals(name)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public void saveUser(User user) {
		if (recentSpittles != null) {
			recentSpittles.add(user);
		}
	}

}
