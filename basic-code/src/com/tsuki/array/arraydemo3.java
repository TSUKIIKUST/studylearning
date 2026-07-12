package com.tsuki.array;

import java.util.Scanner;

public class arraydemo3 {
    //已知一个数组里的元素
    public static void main(String[] args) {
        int[] arr = {33,44,55,66,77,33};
        //键盘输入一个数值，判断这个数是否在数组中
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                System.out.println("找到了");
                break;
            }

        }
        System.out.println("没有找到"); //这段代码要放在for循环的外面
    }
}
