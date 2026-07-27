package com.tsuki.apitest3;

public class test1 {
    public static void main(String[] args) {
        //保留用户名中的第一个字符，后面三个字符用*号代替
        String username = "tsuki";
        //也可以用substring()方法来实现，substring()方法的参数是开始索引，结束索引，不包含结束索引的字符，所以要+1
        System.out.println(username.charAt(0) + "***");
        //保留用户名中的第一个字符，后面三个字符用*号代替，输出结果为t***i
        System.out.println(username.charAt(0) + "***" + username.charAt(3));
    }
}
