package com.jdbctemplate.old;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdbctemplate.User;

/**
 * 就是这么简单！！

文章至此仿佛告一段落，莫急！不防让我们更深入一些...

试想，如果我每次用jdbcTemplate时，都要继承一下上面的父类，是不是有些不方面呢？
那就让我们甩掉abstract这顶帽子吧，这时，就该callback（回调）上场了
 *
 */
public class JdbcTemplateUserImpl extends JdbcTemplate {

	@Override
    protected Object doInStatement(ResultSet rs) {
        List<User> userList = new ArrayList<User>();

        try {
            User user = null;
            while (rs.next()) {

                user = new User();
                user.setAdminID(rs.getInt("adminID"));
                user.setAdminName(rs.getString("adminName"));
                userList.add(user);
            }
            return userList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
