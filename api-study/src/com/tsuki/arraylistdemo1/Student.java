package com.tsuki.arraylistdemo1;

public class Student {
    //属性id，姓名，年龄
    private String id;
    private String name;
    private int age;
    //定义无参构造方法
    public Student() {

    }
    //定义参数构造方法
    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    //定义getter和setter方法
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
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
