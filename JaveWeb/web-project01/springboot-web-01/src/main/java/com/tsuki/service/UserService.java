package com.tsuki.service;

import com.tsuki.springbootweb01.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
}
