package com.tsuki.oopextendtest4;

public class SmartDevice {
    //属性，品牌，价格
    String name;
    double price;
    //方法,计算折扣价格
    public double payment(double payment){
       if(price>=0 && price <1000){
           return price;
       }else if(price>=1000 && price <5000){
           return price*0.9;
       }else if (price>=5000 && price <10000){
           return price*0.8;
       }else if (price>=10000){
           return price*0.7;
       }else{
           return 0;
       }
    }
}
