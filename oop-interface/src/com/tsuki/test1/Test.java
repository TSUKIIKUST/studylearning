package com.tsuki.test1;

public class Test {
    public static void main(String[] args) {
        //创建一个狗对象
        Dog dog = new Dog("旺财", "黄色");
        //输出狗的姓名和颜色
        System.out.println(dog.getName() + "是" + dog.getColor() + "的");
        //调用狗的吃方法
        dog.eat();
        //调用狗的游泳方法
        dog.swim();
    }
}
