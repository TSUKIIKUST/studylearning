package com.tsuki.loopwhile;

import java.util.Scanner;

public class whiledemo3 {
    public static void main(String[] args) {
    //输入一个数，求这个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int a = sc.nextInt();

        int sum = 0;
        //要确保是正数
        if(a<=0){
            a = -a;
        }
        System.out.println("数据为："+a);
        //进行循环
        while(a !=0){
            //获取个位
            System.out.println(a%10);
            sum += a%10;
            //去掉个位
            a = a/10;
        }
System.out.println("和为："+sum);


    }
}
