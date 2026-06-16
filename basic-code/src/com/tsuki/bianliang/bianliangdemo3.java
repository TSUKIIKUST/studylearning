package com.tsuki.bianliang;

public class bianliangdemo3 {
    //计算bmi=体重/身高^2

    public static void main(String[] args) {
        //输入体重
        double weight = 60;
        //输入身高
        double height = 1.8;
        double bmi = weight / Math.pow(height, 2);
        System.out.println(bmi);
        //计算出当前身高，在标准bmi下，最多是多少个kg，正常bmi=18.5-23.9
        double max =23.9*1.8*1.8;
        System.out.println("最多是" + max + "kg");
    }


}
