package com.tsuki.apitest5;

public class test1 {
    static void main(String[] args) {
        //定义两个字符串，记录为非负整数
        String str1 = "123456";
        String str2 = "789";
        //将两个字符串转换为整数
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        //将两个整数相加，将结果转换为字符串
        String sum = String.valueOf(num1 + num2);
        //输出结果
        System.out.println(sum);
    }
}
