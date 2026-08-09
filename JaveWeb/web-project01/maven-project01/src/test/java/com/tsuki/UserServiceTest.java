package com.tsuki;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {
    @Test
    public void testGetAge(){
        UserService userService = new UserService();
        Integer age = userService.getAge("44030419900101001X");
        System.out.println(age);
    }
    @Test
    public void testGetGender(){
        UserService userService = new UserService();
        String gender = userService.getGender("44030419900101001X");
        // 断言
        assertEquals("男", gender, "性别错误");
        System.out.println(gender);
    }
}
