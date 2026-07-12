package com.tsuki.array;

import java.util.Scanner;

public class arraydemo2 {
    public static void main(String[] args) {
        //动态建立一个数组，并依次赋值
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //键盘录入
            System.out.println("请输入第" + (i + 1) + "个元素");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
