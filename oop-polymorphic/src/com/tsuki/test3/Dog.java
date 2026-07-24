package com.tsuki.test3;

public class Dog extends Animal {
    //默认构造方法
    public Dog() {
    }
    //有参构造方法
    public Dog(String name, String color) {
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
        System.out.println("狗吃骨头");
    }
    //看门
    public void watchDoor() {
        System.out.println("狗看门");
    }
}
