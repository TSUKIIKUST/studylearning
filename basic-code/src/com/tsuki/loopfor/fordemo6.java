package com.tsuki.loopfor;

import java.util.Scanner;

public class fordemo6 {
    static void main(String[] args) {
        //数列之和
        //输入数列的个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数列的个数：");
        int n = sc.nextInt();
        //进入循环
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            //奇数的话是加，偶数是减
            if (i % 2 == 0) {
                sum = sum - i;
            } else {
                sum = sum + i;
            }
        }
        System.out.println("数列的和为：" + sum);
    }
}
