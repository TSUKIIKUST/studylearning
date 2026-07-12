package com.tsuki.array;

public class arraydemo1 {
    //数组元素的初始化，获取修改，遍历
    //获取长度
    public static void main(String[] args) {
        //初始化数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(arr.length); //获取长度
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]); //遍历数组
        }
    }
}
