package com.tsuki.test1;

public class Dog extends Animal implements Swim {
    //空构造
    public Dog() {
    }
    //参数有
    public Dog(String name, String color) {
        super(name, color);
    }
    //写吃方法
    @Override
    public void eat() {
        System.out.println("吃骨头");
    }
    //写游泳方法
    @Override
    public void swim() {
        System.out.println("狗游泳...狗刨");
    }
}
