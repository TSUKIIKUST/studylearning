package com.tsuki.array;

public class arraytest5 {
    public static void main(String[] args) {
    //给定一个递增的有序数组，去掉重复元素
        //使用双指针/快和慢
        int arr [] = {1,1,2,2,2,2,3,3,3,3};
        //定义双指针
        int slow = 0;
        int fast = 1;
        while (fast < arr.length){
        //进行判断
            if (arr[slow] == arr[fast]){
                fast++;

            }else{
                slow++;
                arr[slow] = arr[fast];
                fast++;
            }
        }
        //输出
        for (int i = 0; i < slow; i++) {
            System.out.println(arr[i]);
        }
    }
}
