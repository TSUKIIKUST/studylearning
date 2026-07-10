package com.tsuki.loopfor;

public class fordemo2 {
    public static void main(String[] args) {
        //累加求和
        int sum = 0; //sum的初识值要放在循环的外面，否则每次循环都会被重新赋值为0
        for (int i = 1; i <= 5; i++) {

            sum = sum + i;
        }
        System.out.println(sum);
    }
}
