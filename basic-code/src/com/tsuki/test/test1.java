package com.tsuki.test;

import javax.lang.model.util.ElementScanner6;

public class test1 {
    //给你一个数组 nums 和一个值 val，你需要删除所有数值等于 val 的元素
    //举例1：
    //输入：nums = [3,2,2,3]    val = 3
    //输出：nums = [2,2]  剩余2个元素
    //举例1：
    //输入：nums = [0,1,2,2,3,0,4,2]    val = 2
    //输出：nums = [0,1,4,0,3]  剩余5个元素
    public static void main(String[] args) {
        //定义数组
        int arr [] = {0,1,2,2,3,0,4,2};
        //定义双指针
        int slow = 0;
        int fast = 0;
        int val = 2;
        //遍历数组
        while (fast < arr.length){
            if (arr[fast] == val){
                fast++;
            }else {
                arr[slow] = arr[fast];
                fast++;
                slow++;
            }

        }
        //遍历
        for (int i = 0; i < slow; i++) {
            System.out.print(arr[i] + "\t");
        }
        //让数组横着输出
        System.out.println();

    }
}
