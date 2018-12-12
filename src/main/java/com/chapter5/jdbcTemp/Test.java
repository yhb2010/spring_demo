package com.chapter5.jdbcTemp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class Test extends JdbcDaoSupport {
	// JdbcDaoSupport类已经有了public final void setDataSource(DataSource
	// dataSource)了
	// 不用重写也不能重写

	public void insert(User u) {
		String sql = "insert into _user " + "values(null, ?, ?)";// 普通的sql语句
		this.getJdbcTemplate().update(sql,
				new Object[] { u.getName(), u.getPassword() });
	}

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chapter5/jdbcTemp/xml/jdbc.xml");
		Test t = (Test) ctx.getBean("test");

		User u = new User();
		u.setName("dd");
		u.setPassword("dd");
		t.insert(u);
	}

}
