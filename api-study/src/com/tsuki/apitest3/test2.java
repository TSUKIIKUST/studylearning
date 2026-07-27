package com.tsuki.apitest3;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //游戏敏感词过滤
        //定义一个字符串，用于存储敏感词
        String arr[] = {"sb","tmd","lj"};
        //键盘录入一个字符串，用于存储用户输入的字符串
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = input.nextLine();
        //遍历数组，判断用户输入的字符串是否包含敏感词
        for(int i = 0;i<arr.length;i++){
            str = str.replace(arr[i],"*");
        }
        System.out.println(str);
    }
}
