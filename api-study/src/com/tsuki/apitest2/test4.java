package com.tsuki.apitest2;

public class test4 {
    public static void main(String[] args) {
        //拼接字符串
        int[] arr = {1,2,3,4,5};
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += arr[i] + "]";
            }else{
                str += arr[i] + ",";
            }
        }
        System.out.println(str);
    }
}
