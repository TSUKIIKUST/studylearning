package com.tsuki.test2;

public class Car extends Machine {
    //参数
    //默认构造方法
    public Car() {
    }
    //有参构造方法
    public Car(String brand, int speed) {
        super(brand, speed);
    }
    //重写父类方法move
    @Override
    public void move() {
        //输出详细移动机器信息
        System.out.println("移动汽车：" + brand + "，速度：" + speed);
    }
    //方法honk
    public void honk() {
        System.out.println("滴滴滴滴滴滴滴");
    }
}

