package com.tsuki.test;

import java.util.Random;

public class test3 {
    public static void main(String[] args) {
           /* 学校选举学生会主席，有5个候选人
            全校1000名同学参与投票（每人一票，可以弃权，或者选1-5号）。
            投票使用Random模拟。0：弃权，1 ~ 5：给对应的候选人投票
            要求1：
            统计每个候选人的得票数和得票率，找出得票最多的候选人？
            要求2：
            统计弃票数和弃票率是多少？*/
        // 1. 定义数组，用于存储每个候选人的得票数
        int[] arr  = new int[6];
        //随机投票
        Random r = new Random();
        for (int i = 0; i < 1000; i++) {
            int vote = r.nextInt(0,6);
            arr[vote]++;
        }
        for (int i = 1; i < arr.length; i++) {
            //一共5个候选人，0是弃权
            System.out.println("候选人" + (i) + "的得票数为：" + arr[i]);
        }
        //统计弃票数和弃票率
        int max = arr[1];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //得票最多
        System.out.println("得票最多为：" + (max));
        //得票最多的候选人为：
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == max) {
                System.out.println("候选人" + (i) + "的得票数为：" + arr[i]);
            }
        }
        //统计弃票数和弃票率
        int discard = arr[0];
        double discardRate = (double) discard / 1000;
        System.out.println("弃票数为：" + discard);
        System.out.println("弃票率为为：" + discardRate*100 + "%");
    }
}
