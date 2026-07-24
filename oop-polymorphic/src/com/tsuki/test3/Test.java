package com.tsuki.test3;

public class Test {
    public static void main(String[] args) {
       Cat cat = new Cat("Tom", "灰色");
       //输出猫的信息
        System.out.println("猫的信息：" + cat.getName() + "，颜色：" + cat.getColor());
       cat.eat();
       cat.catchMouse();
    }
}
