package com.tsuki.method;

public class methoddemo1 {
    //定义一个方法来求和
    public static void main(String[] args) {
        int add = getSum(10,20);
        System.out.println(add);
    }
    //定义方法
    public static int getSum(int a,int b){
        int sum = a + b;
        return sum;
    }
}
