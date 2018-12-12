//<start id="java_contextualHibernateDao"/> 
package com.chapter6.transaction;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chapter5.jdbcTemp.User;

//@Repository直接被spring的context:component-scan扫描到，不必在xml里声明bean
@Repository
public class UserDaoImpl implements UserDao {
	private SessionFactory sessionFactory;

	// @Autowired自动将sessionFactory注入到HibernateUserDao的sessionFactory属性
	@Autowired
	public UserDaoImpl(SessionFactory sessionFactory) {// <co
		this.sessionFactory = sessionFactory;
	}

	private Session currentSession() {
		return sessionFactory.getCurrentSession();// <co
													// id="co_getCurrentSession"/>
	}

	public void addSpitter(User spitter) {
		currentSession().save(spitter);// <co id="co_useSession"/>
	}

	public User getSpitterById(long id) {
		return (User) currentSession().get(User.class, id);// <co
															// id="co_useSession"/>
	}

	public List<User> getRecentSpittle() {
		// return currentSession().f loadAll(Spittle.class); // this isn't
		// right...just a placeholder for now
		return null;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getSpitterById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}