package com.tsuki.apitest2;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //键盘录入一个字符串，实现在控制台遍历该数组
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = input.nextLine();
        //遍历字符串,length()来获取字符串的长度，for循环遍历字符串的每个字符，获取每个字符的索引，再通过charAt()方法获取每个字符
        for(int i = 0;i<str.length();i++){
            //获取字符串的第i个字符,这是个方法，charAt(i)
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
