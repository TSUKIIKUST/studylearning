package com.tsuki.springbootweb01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

//注解: 用于自动生成getter和setter方法
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    //属性
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Integer age;
   //最后更新时间
    private LocalDateTime updateTime;

}
