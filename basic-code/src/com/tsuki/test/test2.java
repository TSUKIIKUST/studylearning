package com.tsuki.test;

import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        //红包问题
        /*给你两个整数M和N，M表示红包的总额， N表示红包的个数
        现在又N个人来抽红包，每个人都是随机的，打印每个人领的红包金额*/
        //定义红包总额和红包个数，红包的金额最好用分来表示
        int money = 200;
        int n = 5;
        //随机生成红包金额
        //判断金额数量
        if (money < n) {
            System.out.println("金额数量不足");
            return;
        } else {
            Random r = new Random();
            for (int i = 1; i < n; i++) {
                int myMoney = r.nextInt(money - (n - i)) + 1;//金额的范围很重要
                money -= myMoney;
                //打印每个人领的红包金额
                System.out.println("第" + (i) + "个人领的红包金额为：" + myMoney);
            }
//最后一个人领的红包金额为剩余金额
            System.out.println("第" + (n) + "个人领的红包金额为：" + money);

        }
    }}
