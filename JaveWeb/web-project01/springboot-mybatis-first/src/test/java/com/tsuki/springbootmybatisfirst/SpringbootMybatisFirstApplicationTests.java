package com.tsuki.springbootmybatisfirst;

import com.tsuki.mapper.UserMapper;
import com.tsuki.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class SpringbootMybatisFirstApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testFindAll() {
        List<User> users = userMapper.findAll();
        users.forEach(System.out::println);
    }



}
