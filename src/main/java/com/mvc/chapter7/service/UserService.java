package com.mvc.chapter7.service;

import java.util.List;
import com.mvc.chapter7.domain.User;

public interface UserService {

	List<User> getRecentUsers(int count);

	User getUserByName(String name);

	void saveUser(User user);

}
