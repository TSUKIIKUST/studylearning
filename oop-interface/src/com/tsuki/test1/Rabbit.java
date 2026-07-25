package com.tsuki.test1;

public class Rabbit extends Animal  {
    //空构造
    public Rabbit() {
    }
    //参数有
    public Rabbit(String name, String color) {
        super(name, color);
    }

    //写吃方法
    @Override
    public void eat() {
        System.out.println("兔子吃草");
    }

}

