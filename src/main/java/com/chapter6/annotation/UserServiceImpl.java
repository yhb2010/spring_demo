package com.chapter6.annotation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.chapter5.jdbcTemp.User;
import com.chapter6.transaction.UserDao;

@Service("spitterService")
@Transactional(propagation = Propagation.REQUIRED)
public class UserServiceImpl {

	@Autowired
	private UserDao userDao;

	public void saveSpittle(User user) {
		userDao.addUser(user);
	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<User> getRecentSpittles(int count) {
		return userDao.getRecentSpittle();
	}

	public void saveSpitter(User user) {
		if (user.getId() == 0) {
			userDao.addUser(user);
		} else {
			userDao.addUser(user);
		}
	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public User getSpitter(int id) {
		return userDao.getSpitterById(id);
	}

}
