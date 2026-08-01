package com.tsuki.hashmapdemo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class test2 {
    static void main(String[] args) {
        /*
        班级80个学生进行秋游，有四个景点（A,B,C,D），每个学生随机选择一个景点，
        并统计每个景点的人数。
         */
        //定义一个数组存储景点
        String[] arr = {"A", "B", "C", "D"};
        //学生随机选择景点，用arraylist存储选择的景点
        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 80; i++) {
            int index = random.nextInt(arr.length);
            list.add(arr[index]);
        }
        //统计每个景点的人数
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : list) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(map);
        //找出选择最多的景点
        int max = 0;
        String maxKey = "";
        for (String s : map.keySet()) {
            if (map.get(s) > max) {
                max = map.get(s);
                maxKey = s;
            }
        }
        System.out.println("选择最多的景点是：" + maxKey);
        System.out.println("选择最多的景点的人数是：" + max);
    }
}

