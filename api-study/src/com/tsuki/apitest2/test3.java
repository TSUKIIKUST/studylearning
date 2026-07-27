package com.tsuki.apitest2;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        //键盘录入一个字符串，统计字符串中大写字符和小写字符和数字的出现次数
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = input.nextLine();
        //定义三个变量，用于统计大写字符和小写字符和数字的出现次数
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        //遍历字符串,length()来获取字符串的长度，for循环遍历字符串的每个字符，获取每个字符的索引，再通过charAt()方法获取每个字符
        for (int i = 0; i < str.length(); i++) {
            //获取字符串的第i个字符,这是个方法，charAt(i)
            char c = str.charAt(i);
           if (c>= 'a'&&c<='z'){
               countLower++;
           }
           else if (c>= 'A'&&c<='Z'){
               countUpper++;
           }
           else if (c>= '0'&& c<='9'){
               countNumber++;
           }
        }
        System.out.println("大写字符的出现次数为" + countUpper);
        System.out.println("小写字符的出现次数为" + countLower);
        System.out.println("数字的出现次数为" + countNumber);
    }
}