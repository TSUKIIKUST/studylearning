package com.tsuki.oopextendstest5;

public class Person {
    //共有属性
    String name;
    int age;

    //构造，无参构造
    public Person() {
    }
    //构造，有参构造
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
//get/set方法
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

    //共有方法
    public void eat(){
        System.out.println("我在吃");
    }
    public void sleep(){
        System.out.println("我在睡");
    }
}
