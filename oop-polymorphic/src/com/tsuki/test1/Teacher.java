package com.tsuki.test1;

public class Teacher extends Person {
    //构造方法
    public Teacher() {
    }
    //构造方法,姓名,账号，密码
    public Teacher(String name, String account, String password) {
        super(name, account, password);
    }
    //行为教书，重写work方法
    @Override
    public void work() {
        System.out.println("教师在教书");
    }
}