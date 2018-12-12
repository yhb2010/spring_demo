package com.jdbctemplate.newcallback;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 如果我每次用jdbcTemplate时，都要继承一下上面的父类，是不是有些不方面呢？
那就让我们甩掉abstract这顶帽子吧，这时，就该callback（回调）上场了


所谓回调，就是方法参数中传递一个接口，父类在调用此方法时，必须调用方法中传递的接口的实现类。

那我们就来把上面的代码改造一下，改用回调实现吧：

首先，我们来定义一个回调接口：
 *
 */
public interface ResultSetCallback {

	Object doInStatement(ResultSet rs) throws SQLException;

}
