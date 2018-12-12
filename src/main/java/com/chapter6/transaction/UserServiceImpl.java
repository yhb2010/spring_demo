package com.chapter6.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;
import com.chapter5.jdbcTemp.User;

public class UserServiceImpl {

	@Autowired
	private TransactionTemplate txTemplate;
	@Autowired
	private UserDao userDao;

	public void saveSpittle(final User user) {
		txTemplate.execute(new TransactionCallback<Void>() {
			public Void doInTransaction(TransactionStatus txStatus) {
				try {
					userDao.addUser(user);
				} catch (RuntimeException e) {
					txStatus.setRollbackOnly();
					throw e;
				}
				return null;
			}
		});
	}

}
