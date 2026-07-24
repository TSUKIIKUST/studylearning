package com.tsuki.test1;

public class Admin extends Person {
    //构造方法
    public Admin() {
    }
    //构造方法,姓名,账号，密码
    public Admin(String name, String account, String password) {
        super(name, account, password);
    }
    //行为管理，重写work方法
    @Override
    public void work() {
        System.out.println("管理员在管理网站");
    }
}
