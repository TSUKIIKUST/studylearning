package com.tsuki.toolclasstest;

public class ArrayUitl {
    //私有化构造方法，防止外部创建对象
    private ArrayUitl() {
    }
    //提供一个方法printArr，用于遍历数组。
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                System.out.print(arr[i]+"]");
            }else{
                System.out.print(arr[i] + ",");
            }
        }
    }
    //提供一个方法getAverage，用于返回平均分。
    public static double getAverage(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}