package com.tsuki.test1;

public class Student extends Person {
    //构造方法
    public Student() {
    }
    //构造方法,姓名,账号，密码
    public Student(String name, String account, String password) {
        super(name, account, password);
    }
    //行为学习，重写work方法
    @Override
    public void work() {
        System.out.println("学生在学习");
    }


}
