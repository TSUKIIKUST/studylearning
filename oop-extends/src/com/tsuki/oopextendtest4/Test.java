package com.tsuki.oopextendtest4;

public class Test {
    public static void main(String[] args) {
        //创建一个Phone对象
        Phone phone = new Phone();
        //设置属性
        phone.name = "iphone14";
        phone.price = 5000;
        double payment = phone.payment(5000);
        //调用方法
        System.out.println(payment);
        System.out.println("-------------------");
        //pad
        Pad pad = new Pad();
        //设置属性
        pad.name = "ipad Pro";
        pad.price = 8999;
        double payment2 = pad.payment(8999);
        System.out.println(payment2);
    }
}
