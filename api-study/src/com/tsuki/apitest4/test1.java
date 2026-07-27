package com.tsuki.apitest4;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //录入字符串，反转字符串
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = input.nextLine();
        //遍历字符串，从后往前遍历，将每个字符拼接起来，就是反转后的字符串
        /*String reverse = "";
        for(int i = str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);*/
        //也可以用StringBuilder类来实现，StringBuilder类的reverse()方法可以实现字符串的反转
        StringBuilder sb = new StringBuilder(str);
        //调用reverse()方法，实现字符串的反转
        sb.reverse();
        //调用toString()方法，将StringBuilder类转换为字符串
        System.out.println(sb.toString());
    }
}
