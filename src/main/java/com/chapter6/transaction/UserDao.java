package com.chapter6.transaction;

import java.util.List;

import com.chapter5.jdbcTemp.User;

public interface UserDao {
	void addUser(User user);

	User getSpitterById(int id);

	List<User> getRecentSpittle();

}
