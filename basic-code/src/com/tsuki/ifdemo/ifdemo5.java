package com.tsuki.ifdemo;

import java.util.Scanner;

public class ifdemo5 {
    static void main(String[] args) {
        //阶梯计算电费
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入使用电量：");
        int a = sc.nextInt();
        if (a <= 100) {
            System.out.println("电费为：" + a * 0.5);
        } else if (a > 100 && a <= 200) {
            System.out.println("电费为：" + (100 * 0.5 + (a - 100) * 0.8));
        } else if (a > 200) {
            System.out.println("电费为：" + (100 * 0.5 + 100 * 0.8 + (a - 200) * 1.2));
        }
    }
}
