package com.tsuki.oopextendstest3;

public class ThirdgeneralPhone extends SecondgeneralPhone {
    //功能，涉及一个复用

    @Override
    public void call() {
        System.out.println("打视频");
        System.out.println("打电话");
    }
    public void playGame(){
        System.out.println("我在玩游戏");
    }
}
