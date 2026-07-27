package com.tsuki.apitest1;

public class Test {
    public static void main(String[] args) {
        //string的学习，定义，空参，有参
        String str1 = "hello";
        System.out.println(str1);
        //有参构造函数
        String str2 = new String("hello");
        System.out.println(str2);
        //数组
        char[] str3 = {'h','e','l','l','o'};
        System.out.println(str3);
        //字节
        byte[] str5 = {97,98,99,100,101};
        String str6 = new String(str5);
        System.out.println(str5);

    }
}
