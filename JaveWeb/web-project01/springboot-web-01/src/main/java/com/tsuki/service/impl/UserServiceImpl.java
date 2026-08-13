package com.tsuki.service.impl;

import com.tsuki.dao.UserDao;
import com.tsuki.dao.impl.UserDaoImpl;
import com.tsuki.service.UserService;
import com.tsuki.springbootweb01.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    //将dao层的对象注入到service层
    private UserDao userDao;


    @Override
    public List<User> findAll() {
        //1.lines没数据，去dao中调取
        List<String> lines = userDao.findAll();

        List<User> userList = lines.stream()
                .map(line -> {
                    String[] parts = line.split(",");
                    Integer id = Integer.parseInt(parts[0]);
                    String username = parts[1];
                    String password = parts[2];
                    String name = parts[3];
                    Integer age = Integer.parseInt(parts[4]);
                    LocalDateTime updateTime = LocalDateTime.parse(parts[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                    return new User(id, username, password, name, age, updateTime);
                }).toList();
        return userList;
    }
}
