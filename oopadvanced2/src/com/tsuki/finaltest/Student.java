package com.tsuki.finaltest;

import java.util.Set;

public class Student {
    /*//学生的属性
    public String name;
    public int age;
    //参数构造方法，空构造方法*/

    //使用final关键字修饰属性，防止被修改、
    final String name = "Steven Jobs";
    final int age = 18;

    public Student() {
    }
    //参数构造方法，有参构造方法
    /*public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }*/
    //提供一个方法，用于设置学生的姓名

    /*public void setName(String name) {
        this.name = name;
    }*/
    public String getName() {
        return name;
    }
    //提供一个方法，用于设置学生的年龄
    /*public void setAge(int age) {
        this.age = age;
    }*/
    public int getAge() {
        return age;
    }
}
