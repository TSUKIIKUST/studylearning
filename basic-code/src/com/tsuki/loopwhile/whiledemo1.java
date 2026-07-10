package com.tsuki.loopwhile;

public class whiledemo1 {
    static void main(String[] args) {
        //银行存款100000元，利息1.7%，多少年后本金翻倍
        double money = 100000;
        int year = 0;
        while (money < 200000) {
            money = money * 1.017;
            year++;
        }
        System.out.println("第" + year + "年后，本金翻倍");
    }
}
