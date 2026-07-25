package com.tsuki.test2;

public class Test {
    public static void main(String[] args) {
        //创建一个篮球选手对象
        BasketballPlayer basketballPlayer = new BasketballPlayer("张三", 18);
        //输出篮球选手的姓名和年龄
        System.out.println(basketballPlayer.getName() + "是" + basketballPlayer.getAge() + "岁的篮球选手");
        //调用篮球选手的学习方法
        basketballPlayer.study();

        //创建一个乒乓球选手对象
        PingpongPlayer pingpongPlayer = new PingpongPlayer("李四", 18);
        //输出乒乓球选手的姓名和年龄
        System.out.println(pingpongPlayer.getName() + "是" + pingpongPlayer.getAge() + "岁的乒乓球选手");
        //调用乒乓球选手的学习方法
        pingpongPlayer.study();
        pingpongPlayer.speakEnglish();
    }
}
