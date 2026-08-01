package com.tsuki.genericstest2;

public abstract class Animal {
    //名字，年龄属性
    private String name;
    private int age;
    //标准javabean
    public Animal() {
    }
    //标准javabean
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //标准javabean
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
    //还有一个吃的抽象方法
    public abstract void eat();
}
