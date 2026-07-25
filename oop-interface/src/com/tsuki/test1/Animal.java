package com.tsuki.test1;

public abstract class Animal {
    //属性。名字，颜色
     private String name;
     private String color;
    //参数空
    public Animal() {

    }
    //参数有
    public Animal(String name, String color) {
        this.name = name;
        this.color = color;

    }
    //get/set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //写吃方法
    public abstract void eat();
}
