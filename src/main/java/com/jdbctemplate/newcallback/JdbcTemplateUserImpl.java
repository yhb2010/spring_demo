package com.jdbctemplate.newcallback;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdbctemplate.User;

public class JdbcTemplateUserImpl {

	// 匿名类方式
	public Object query(final String sql) throws Exception {

		JdbcTemplate jt = new JdbcTemplate();
		return jt.query(sql, new ResultSetCallback() {

			public Object doInStatement(ResultSet rs) throws SQLException {
				List<User> userList = new ArrayList<User>();

				User user = null;
				while (rs.next()) {

					user = new User();
	                user.setAdminID(rs.getInt("adminID"));
	                user.setAdminName(rs.getString("adminName"));
	                userList.add(user);
				}
				return userList;

			}
		});

	}

}
