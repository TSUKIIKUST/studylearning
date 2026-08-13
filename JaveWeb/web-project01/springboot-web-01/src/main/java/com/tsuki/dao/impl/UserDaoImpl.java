package com.tsuki.dao.impl;

import cn.hutool.core.io.IoUtil;
import com.tsuki.dao.UserDao;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Component//将当前类交给IOC容器管理
public class UserDaoImpl implements UserDao {
    @Override
    public List<String> findAll() {
        //1.从数据库中查询所有用户信息
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
        ArrayList<String> lines = IoUtil.readLines(in, StandardCharsets.UTF_8,new ArrayList<>());
        return lines;
    }
}
