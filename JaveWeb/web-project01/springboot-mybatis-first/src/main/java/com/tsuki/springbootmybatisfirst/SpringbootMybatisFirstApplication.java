package com.tsuki.springbootmybatisfirst;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tsuki.mapper")
public class SpringbootMybatisFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisFirstApplication.class, args);
    }

}