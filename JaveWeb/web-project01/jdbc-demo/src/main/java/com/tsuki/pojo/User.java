package com.tsuki.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //注解: 用于自动生成getter和setter方法
@NoArgsConstructor //注解: 用于自动生成无参构造方法
@AllArgsConstructor //注解: 用于自动生成有参构造方法
public class User {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Integer age;

}
