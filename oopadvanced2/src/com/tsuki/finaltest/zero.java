package com.tsuki.finaltest;

public class zero {
    //创建一个圆的属性，半径和圆周率
    double radius;
    final double pi = 3.14;

    //构造方法
    public zero(double radius) {
        this.radius = radius;
    }

    //get/set

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getPi() {
        return pi;
    }

    //提供一个方法，用于计算圆的面积
    public double getArea() {
        return pi * radius * radius;
    }

    //提供一个方法，用于计算圆的周长
    public double getPerimeter() {
        return 2 * pi * radius;
    }
}
