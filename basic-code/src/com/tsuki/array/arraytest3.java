package com.tsuki.array;

import java.util.Random;

public class arraytest3 {
    public static void main(String[] args) {
    //数组，进行打乱顺序
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        //随机数
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //获取随机数
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
