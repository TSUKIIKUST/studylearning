package com.tsuki.test1;

import java.util.concurrent.ForkJoinWorkerThread;

public class Test {
    public static void main(String[] args) {
        //创建一个学生管理系统对象
        StudentManger sm = new StudentManger();
        //第一步创建一个学生对象
        Student stu = new Student("张三", "zhangsan123", "123456");
        //调用学生管理对象的注册方法
        sm.register(stu);


        //创建一个管理员对象
        Admin admin = new Admin("李四", "lisi123", "123456");
        //调用管理员管理对象的注册方法
        sm.register(admin);

    }
}
