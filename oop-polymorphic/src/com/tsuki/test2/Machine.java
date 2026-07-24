package com.tsuki.test2;

public class Machine {
    //属性,品牌,速度
    String brand;
    int speed;
    //参数
    //默认构造方法
    public Machine() {
    }
    //有参构造方法
    public Machine(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    //get/set

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //方法
    //move
    public void move() {
        //输出详细移动机器信息
        System.out.println("移动机器：" + brand + "，速度：" + speed);
    }
}
