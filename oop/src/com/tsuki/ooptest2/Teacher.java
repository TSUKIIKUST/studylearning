package com.tsuki.ooptest2;

public class Teacher {
    //定义一个教师类，包含属性：姓名、年龄
    String name;
    int age;
    //定义老师类的方法，包括授课，吃饭，睡觉
    public void teach() {
        System.out.println("我是" + name + "，我正在教学生");
    }
    public void eat() {
        System.out.println("我是" + name + "，我正在吃饭");
    }
    public void sleep() {
        System.out.println("我是" + name + "，我正在睡觉");
    }
}
