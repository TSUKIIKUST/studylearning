package com.tsuki.mapper;

import com.tsuki.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    //查询所有用户,有返回值，返回一个List<User>
    //注解: 用于指定查询语句
    //参数: 1. 查询语句
    //返回值: 查询结果
    @Select("select * from user")
    public List<User> findAll();
}
