package com.tsuki.test2;

public abstract class Person {
    //属性，姓名，年龄
    private String name;
    private int age;
    //空构造
    public Person() {

    }
    //参数有
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //写姓名和年龄的getter和setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
