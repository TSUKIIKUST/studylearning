package com.tsuki.array;

import java.util.Random;

public class arraytest4 {
    public static void main(String[] args) {
    //获取10个1到100的随机数并存入到数组中，要求保证数据的唯一
        int [] arr = new int[10];
        //生成随机数
        Random r = new Random();
        //下面for循环要换位置
        for (int i = 0; i < arr.length; ) {
            int data = r.nextInt(101);
            //进行判断，看是否存在，两种经典方法
            int count = 0;
            //-------------------------------
            for (int j = 0; j < i; j++) {
                if (arr[j] == data) {
                    count++;
                    break; //break跳出内循环
                }
            }
            //-------------------------------
            if (count == 0) {
                arr[i] = data;
                i++;
                //这个加加要放在这个地方，避免生成的数组，里面的0重复，这个里面的0，会重复
                //他是数组默认的值
            }


        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

}
