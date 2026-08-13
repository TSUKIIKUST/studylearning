package com.tsuki.controller;

import cn.hutool.core.io.IoUtil;
import cn.hutool.json.JSONUtil;
import com.tsuki.service.UserService;
import com.tsuki.service.impl.UserServiceImpl;
import com.tsuki.springbootweb01.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.xpath.XPathNamespace;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    /*@RequestMapping("/list")
    public String list() throws Exception {
        //1.从数据库中查询所有用户信息
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
        ArrayList<String> lines = IoUtil.readLines(in, StandardCharsets.UTF_8,new ArrayList<>());
        //解析用户信息，封装为User对象，到list集合中
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

        //3.将List<User>对象转换为JSON字符串
        return JSONUtil.toJsonStr(userList);

    }
*/
    //调用service层的方法
    @Autowired
    //将service层的对象注入到controller层
    private UserService userService ;

    @RequestMapping("/list")
    public String list() throws Exception {
        List<User> userList = userService.findAll();
        return JSONUtil.toJsonStr(userList);
    }
}
