package com.tsuki.test2;

public class Bicycle extends Machine {
    //参数
    //默认构造方法
    public Bicycle() {
    }
    //有参构造方法
    public Bicycle(String brand, int speed) {
        super(brand, speed);
    }
    //重写父类方法move
    @Override
    public void move() {
        //输出详细移动机器信息
        System.out.println("移动自行车：" + brand + "，速度：" + speed);
    }
    //方法ringBell
    public void ringBell() {
        System.out.println("叮叮叮叮叮");
    }
}
