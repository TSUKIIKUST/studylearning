package com.tsuki.set;

import java.util.TreeSet;

public class Treesetdemo1 {
    //利用treeset存储整数，并进行排序
    public static void main(String[] args) {
        //创建一个treeset对象
        TreeSet<Integer> ts = new TreeSet<>();
        //添加元素
        ts.add(10);
        ts.add(5);
        ts.add(15);
        //遍历元素
        System.out.println(ts);
    }
}
