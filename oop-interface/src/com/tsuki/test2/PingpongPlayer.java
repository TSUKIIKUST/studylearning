package com.tsuki.test2;

public class PingpongPlayer extends Player implements English {

    //构造方法
    public PingpongPlayer() {
    }

    public PingpongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球选手会说英语");
    }

    @Override
    public void study() {
        System.out.println("乒乓球选手学习乒乓球");

    }
}
