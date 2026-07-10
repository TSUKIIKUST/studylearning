package com.tsuki.loopother;

public class looploopdemo {
    static void main(String[] args) {
        //打印正三角
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
