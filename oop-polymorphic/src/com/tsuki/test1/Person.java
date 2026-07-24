package com.tsuki.test1;

public class Person {
    //属性,姓名,账号，密码
    private String name;
    private String account;
    private String password;
    //构造方法
    public Person() {
    }
    //构造方法,姓名,账号，密码
    public Person(String name, String account, String password) {
        this.name = name;
        this.account = account;
        this.password = password;
    }
    //方法,姓名,账号，密码
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    //方法work
    public void work() {
        System.out.println("在工作");
    }
}
