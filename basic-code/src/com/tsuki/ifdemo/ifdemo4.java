package com.tsuki.ifdemo;

import java.util.Scanner;

public class ifdemo4 {
    static void main(String[] args) {
        //键盘录入一个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int a = sc.nextInt();
        //判断这个数
        if(a%2==0){
            System.out.println(a/2);
        }else{
            System.out.println(a*3+1);
        }
    }
}
