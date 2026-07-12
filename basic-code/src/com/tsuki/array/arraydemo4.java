package com.tsuki.array;

public class arraydemo4 {
    public static void main(String[] args) {
    //找最值，找出里面的最大值
        int[] arr = {10,20,30,40,50};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
    //输出最大值
            System.out.println("最大值为"+max);
    }
}
