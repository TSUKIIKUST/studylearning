package com.tsuki.bianliang;

import java.util.Scanner;

public class bianliangdemo5 {
    static void main(String[] args) {
        //找到sacnner
        Scanner sc = new Scanner(System.in);
        //输入第一个整数
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();

        //输入第二个整数
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        //求和
        int sum = a + b;
        System.out.println("两个整数的和为：" + sum);

    }
}
