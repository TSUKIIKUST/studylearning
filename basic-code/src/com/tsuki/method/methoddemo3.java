package com.tsuki.method;

public class methoddemo3 {
    //写一个遍历数组的方法，要输出是【1，2，2，2】这种类型的
    public static void main(String[] args) {
        int[] arr = {1,2,2,2};
        printArray(arr);
    }
    public static void printArray(int[] arr){
        System.out.print("【"); //开始结束的方括号很重要
        for (int i = 0; i < arr.length; i++) {

            if(i == arr.length - 1){ //这个if循环细节问题，避免出现最后一个元素后面也有逗号
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("】");
    }
}
