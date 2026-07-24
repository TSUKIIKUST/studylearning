package com.tsuki.test3;

public class Cat extends Animal {
    //默认构造方法
    public Cat() {
    }
    //有参构造方法
    public Cat(String name, String color) {
        super(name, color);
    }
    //GET/SET
    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    //抓老鼠
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
