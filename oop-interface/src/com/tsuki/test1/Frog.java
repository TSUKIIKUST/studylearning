package com.tsuki.test1;

public class Frog extends Animal implements Swim {
    //空构造
    public Frog() {

    }
    //参数有
    public Frog(String name, String color) {
        super(name, color);

    }

    //写吃方法
    @Override
    public void eat() {
        System.out.println("青蛙吃虫");
    }
    //写游泳方法
    @Override
    public void swim() {
        System.out.println("青蛙游泳...蛙泳");
    }
}
