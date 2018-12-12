package com.jdbctemplate.old;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 使用模板模式的时机到了！！！

通过观察我们发现上面步骤中大多数都是重复的，可复用的，只有在遍历ResultSet并封装成集合的这一步骤是可定制的，
因为每张表都映射不同的java bean。这部分代码是没有办法复用的，只能定制。那就让我们用一个抽象的父类把它们封装一下吧：
 *
 *
 *在下面这个抽象类中，封装了SUN JDBC API的主要流程，而遍历ResultSet这一步骤则放到抽象方法doInStatement()中，由子类负责实现。
好，我们来定义一个子类，并继承上面的父类：
 */
public abstract class JdbcTemplate {

	//template method
    public final Object execute(String sql) throws SQLException, ClassNotFoundException{

    	String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";   //加载JDBC驱动
    	String dbURL = "jdbc:sqlserver://127.0.0.250:port;DatabaseName=dbName";   //连接服务器和数据库sample
    	String userName = "sa";   //默认用户名
    	String userPwd = "123";   //密码

    	Class.forName(driverName);
    	Connection con = DriverManager.getConnection(dbURL, userName, userPwd);
        Statement stmt = null;
        try {

            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            Object result = doInStatement(rs);//abstract method
            return result;
        }
        catch (SQLException ex) {
             ex.printStackTrace();
             throw ex;
        }
        finally {

            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(!con.isClosed()){
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    //implements in subclass
    protected abstract Object doInStatement(ResultSet rs);

}
