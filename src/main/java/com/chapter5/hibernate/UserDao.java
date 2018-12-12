package com.chapter5.hibernate;

import java.util.List;

public interface UserDao {
	void addUser(User user);

	User getSpitterById(int id);

	List<User> getRecentSpittle();

}
