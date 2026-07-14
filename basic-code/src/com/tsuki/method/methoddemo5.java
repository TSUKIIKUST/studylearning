package com.tsuki.method;

public class methoddemo5  {
    public static void main(String[] args) {
        double a1 = 1.1 ;
        double a2 = 2.2 ;
        double b1 = 3.3 ;
        double b2 = 4.4 ;
        double area1 = getArea(a1,a2);
        double area2 = getArea(b1,b2);
        //比较面积
        if(area1 > area2){
            System.out.println("第一个图形的面积大");
        }else if(area1 < area2){
            System.out.println("第二个图形的面积大");
        }else{
            System.out.println("两个图形的面积一样大");
        }
    }
    //很重要的一个方法，来确保方法定义的正确性
    //写一个保证计算两个图形面积的方法
    public static double getArea(double a,double b){
        return a * b;//a,b分别为长和宽
    }
}
