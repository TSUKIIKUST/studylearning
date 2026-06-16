package com.tsuki.bianliang;

import java.util.Scanner;

public class bianliangdemo6 {
    static void main() {
        //计算bmi=体重/身高^2
        //定义scanner
        Scanner sc = new Scanner(System.in);
        //输入体重
        System.out.println("请输入体重：");
        double weight = sc.nextDouble();
        System.out.println("请输入身高：");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("bmi="+bmi);
    }
}
