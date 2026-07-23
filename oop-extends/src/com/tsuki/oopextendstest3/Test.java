package com.tsuki.oopextendstest3;

public class Test {
    public static void main(String[] args) {
        //创建一个FirstgeneralPhone对象
        FirstgeneralPhone firstgeneralPhone = new FirstgeneralPhone();
        //调用方法
        firstgeneralPhone.call();
        System.out.println("-----------------");
        //创建一个SecondgeneralPhone对象
        SecondgeneralPhone secondgeneralPhone = new SecondgeneralPhone();
        //调用方法
        secondgeneralPhone.sendMsg();
        System.out.println("-----------------");
        //创建一个ThirdgeneralPhone对象
        ThirdgeneralPhone thirdgeneralPhone = new ThirdgeneralPhone();
        //调用方法
        thirdgeneralPhone.call();
        thirdgeneralPhone.sendMsg();
        thirdgeneralPhone.playGame();
    }

}
