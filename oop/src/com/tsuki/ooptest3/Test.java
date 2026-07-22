package com.tsuki.ooptest3;

public class Test {
    static void main(String[] args) {
        //创建一个狗对象,管理小狗的信息
        Dog dog1 = new Dog();
        //给狗对象赋值
        dog1.name = "小白";
        dog1.setAge(2);
        //调用小狗对象的方法
        dog1.eat();
        //输出小狗的信息，两岁的小白在吃骨头
        System.out.println("我是" + dog1.name + "，我正在吃骨头，我是一个" + dog1.getAge() + "岁的小白");
    }
}
