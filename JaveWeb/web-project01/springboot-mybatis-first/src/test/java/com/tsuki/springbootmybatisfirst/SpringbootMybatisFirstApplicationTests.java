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

    @Test
    void testDeleteById() {
        userMapper.deleteById(5);
    }

    @Test
    void testInsert() {
        User user = new User(null,"admin", "123456", "张三", 18);
        userMapper.insert(user);
    }

    @Test
    void testUpdate() {
        User user = new User(1, "niko", "123456", "张三", 18);
        userMapper.update(user);
    }

    @Test
    void testFindByUsernameAndPassword() {
        User user = userMapper.findByUsernameAndPassword("niko", "123456");
        System.out.println(user);
    }



}