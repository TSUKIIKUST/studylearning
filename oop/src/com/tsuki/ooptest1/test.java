package com.tsuki.ooptest1;

public class test {
    static void main(String[] args) {
        //创建一个狗对象,管理小狗的信息
        Dog dog1 = new Dog();
        //给狗对象赋值
        dog1.name = "旺财";
        dog1.age = 3;
        dog1.color = "黄色";
        dog1.weight = 10.5;
        //输出小狗的信息
        System.out.println("小狗的姓名是：" + dog1.name);
        System.out.println("小狗的年龄是：" + dog1.age);
        System.out.println("小狗的颜色是：" + dog1.color);
        System.out.println("小狗的重量是：" + dog1.weight);
    }
}
