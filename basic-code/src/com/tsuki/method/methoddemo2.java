package com.tsuki.method;

import java.util.Random;

public class methoddemo2 {
    public static void main(String[] args) {
        //获取10个1到100的随机数并存入到数组中，要求保证数据的唯一
        int[] arr = new int[10];
        //生成随机数
        Random r = new Random();
        //下面for循环要换位置
        for (int i = 0; i < arr.length; ) {
            int data = r.nextInt(101);
            //进行判断，看是否存在，两种经典方法
            int count = 0;
            //------------------------------
            //-------------------------------
            if (!contains(arr, data)) { //只改变了这个，用bool来判断
                arr[i] = data;
                i++;
                //这个加加要放在这个地方，避免生成的数组，里面的0重复，这个里面的0，会重复
                //他是数组默认的值
            }
        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    //  使用方法
    public static boolean contains(int[] arr,int data){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                //看是否符合条件，返回ture
                return true;
            }
        }
        return false;
    }

    }


