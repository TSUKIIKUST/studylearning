package com.tsuki.apitest4;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //输入任意字符串，按长度为8分组，长度不足8的组，用0填充
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = input.nextLine();
        //先把字符串长度转补为8的倍数
        //计算最后一行的字符数
        int lastLine = str.length() % 8;
        //需要填充的字符数为8减去最后一行的字符数
        int padding = 8 - lastLine;
        //用0填充不足8的组，使字符串的长度为8的倍数
        str = str + "0".repeat(padding);
        System.out.println(str);
        //遍历字符串，按8个字符一组，输出
        for(int i = 0;i<str.length();i+=8){
            System.out.println(str.substring(i,i+8));
        }



    }
}
