package com.tsuki.ooptest4;

public class Student {
    //利用面向对象的特征，定义一个学生类，包含属性：姓名、年龄、性别、身高
    private String name;
    private int age;
    private String sex;
    private double height;

    //构造方法
    public Student() {

    }
    //重载构造方法
    public Student(String name, int age, String sex, double height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
    }
    //set方法和get方法
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setSex(String sex) {
        this.sex = sex;

    }
    public String getSex() {
        return sex;
    }
    public void setHeight(double height) {
        this.height = height;

    }
    public double getHeight() {
        return height;
    }
}
