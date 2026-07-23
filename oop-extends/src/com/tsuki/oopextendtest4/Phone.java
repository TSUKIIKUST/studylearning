package com.tsuki.oopextendtest4;

public class Phone extends SmartDevice {
    //手机有个独特的折扣，比折扣价后再折扣
    @Override
    public double payment(double payment){
        //先计算折扣价
        double discountPrice = super.payment(payment);
        //再计算最终价格
        double finalPrice = discountPrice*0.9;
        return finalPrice;
    }
}
