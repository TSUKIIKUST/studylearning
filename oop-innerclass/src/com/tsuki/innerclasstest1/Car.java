package com.tsuki.innerclasstest1;

public class Car {
    //属性,品牌，车龄，颜色
    private String brand;
    private int age;
    private String color;

    //写一个内部类，表示引擎
    private class Engine {
        //属性,品牌，功率
        private String brand;
        private int power;
    }
}
