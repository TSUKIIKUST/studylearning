package com.tsuki.mapper;

import com.tsuki.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    //查询所有用户,有返回值，返回一个List<User>
    //注解: 用于指定查询语句
    //参数: 1. 查询语句
    //返回值: 查询结果
    @Select("select * from user")
    public List<User> findAll();

    @Delete("delete from user where id = #{id}")
    public void deleteById(Integer id);

    @Insert("insert into user (username, password, name, age) values (#{username}, #{password}, #{name}, #{age})")
    public void insert(User user);

    @Update("update user set username = #{username}, password = #{password}, name = #{name}, age = #{age} where id = #{id}")
    public void update(User user);

    @Select("select * from user where username = #{username} and password = #{password}")
    public User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}
