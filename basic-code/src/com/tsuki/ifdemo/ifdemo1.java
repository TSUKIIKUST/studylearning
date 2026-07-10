package com.tsuki.ifdemo;

public class ifdemo1 {
    //判断一个人体温是否大于38度
    public static void main(String[] args) {
        double temperature = 37.5;
        if (temperature > 38) {
            System.out.println("发烧");
        } else {
            System.out.println("正常");
        }
    }
}
