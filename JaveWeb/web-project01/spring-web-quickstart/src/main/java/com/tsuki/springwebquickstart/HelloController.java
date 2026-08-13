package com.tsuki.springwebquickstart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //写一个注解，表示当前类是一个请求处理类
public class HelloController {
    @RequestMapping("/hello")
    public String hello(String name){
        return "hello " + name;
    }
}
