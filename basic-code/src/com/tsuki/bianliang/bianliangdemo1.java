package com.tsuki.bianliang;

public class bianliangdemo1 {
   /* 微信余额：100元
    支付宝余额：10元
    银行卡余额：20元
    问题一：请问现在一共有多少钱？
    问题二：微信收了10元红包，又发了2元红包，余额多少？*/
    public static void main(String[] args) {
        double weixin = 100;
        double zhifubao = 10;
        double bank = 20;
        System.out.println("现在有：" + (weixin + zhifubao + bank) + "元");
        weixin = weixin - 10 - 2;
        System.out.println("微信余额：" + weixin);
    }







}
