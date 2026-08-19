package com.tsuki;

import com.tsuki.pojo.User;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class   JdbcTest {

    @Test
    public void testUpdate() throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/web01", "root", "123456789");
        //获取语句对象,用于执行SQL语句,更新数据库
        Statement stmt = conn.createStatement();
        //执行SQL语句,更新数据库
        int i = stmt.executeUpdate("update user set age = 99 where id = 1");
        System.out.println("更新的行数为:" + i);
        //释放资源
        stmt.close();
        conn.close();
    }

    @Test
    public void testQuery() throws ClassNotFoundException, SQLException {
        // 1. 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. 获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/web01", "root", "123456789");

        // 3. 获取语句对象
        Statement stmt = conn.createStatement();

        // 4. 执行SQL语句，查询数据
        String sql = "select id, username, password, name, age from user where username = 'daqiao' and password = '123456'";
        ResultSet rs = stmt.executeQuery(sql);

        // 5. 处理结果集，将每行记录封装到User实体中
        List<User> userList = new ArrayList<>();
        while (rs.next()) {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setName(rs.getString("name"));
            user.setAge(rs.getInt("age"));
            userList.add(user);
        }

        // 6. 输出查询结果到控制台
        System.out.println("查询到 " + userList.size() + " 条记录：");
        for (User user : userList) {
            System.out.println("User{id=" + user.getId()
                    + ", username='" + user.getUsername() + '\''
                    + ", password='" + user.getPassword() + '\''
                    + ", name='" + user.getName() + '\''
                    + ", age=" + user.getAge() + '}');
        }

        // 7. 释放资源
        rs.close();
        stmt.close();
        conn.close();
    }
}