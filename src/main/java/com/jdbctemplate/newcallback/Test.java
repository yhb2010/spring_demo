package com.jdbctemplate.newcallback;

import java.util.List;
import com.jdbctemplate.User;

//http://blog.csdn.net/kimsoft/article/details/7466109
public class Test {

	public static void main(String[] args) throws Exception {
		 String sql = "select top 5 adminID, adminName from rad_admin_user";
		 JdbcTemplateUserImpl jt = new JdbcTemplateUserImpl();
		 List<User> userList = (List<User>) jt.query(sql);

		 for (User user : userList) {
			System.out.println(user);
		}
	}

}
