package com.tsuki.homework;

public class test {
    public static void main(String[] args) {
        //数据的脱敏
        //定义一个字符串，记录为手机号
        String phone = "13800000000";
        //从手机号的第4位开始，后面4位替换为星号，进行拼接
        phone = phone.substring(0,3) + "****" + phone.substring(7);
        System.out.println(phone);

    }
}
