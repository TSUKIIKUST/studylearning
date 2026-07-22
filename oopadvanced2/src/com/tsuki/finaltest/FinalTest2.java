package com.tsuki.finaltest;

public class FinalTest2 {
    public static void main(String[] args) {
        //创建一个圆对象
        zero c1 = new zero(5);
        //调用方法
        System.out.println("圆的半径是：" + c1.getRadius());
        System.out.println("圆的圆周率是：" + c1.getPi());
        System.out.println("圆的面积是：" + c1.getArea());
        System.out.println("圆的周长是：" + c1.getPerimeter());
    }
}
