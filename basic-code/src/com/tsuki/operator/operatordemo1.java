package com.tsuki.operator;

import java.util.Scanner;

public class operatordemo1 {
    static void main() {
        //键盘录入一个三位数，将其拆分为个位、十位、百位后，打印在控制台
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ge = a % 10;
        int shi = a / 10 % 10;
        int bai = a / 100;
        System.out.println("个位：" + ge);
        System.out.println("十位：" + shi);
        System.out.println("百位：" + bai);
    }
}
