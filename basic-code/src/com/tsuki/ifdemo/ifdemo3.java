package com.tsuki.ifdemo;

import java.util.IdentityHashMap;
import java.util.Scanner;

public class ifdemo3 {
    static void main(String[] args) {
        //输入一个价格
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个价格：");
        double price = sc.nextDouble();
        //有两个平台，饿了吗和美团，进行选择分别计算两个平台优惠价格
        if(price>30){
            System.out.println("饿了吗优惠价格："+(price*0.9));
            System.out.println("美团优惠价格："+(price-10));
        }else {
            System.out.println("饿了吗优惠价格："+(price*0.9));
            System.out.println("美团优惠价格："+price);
        }

    }
}
