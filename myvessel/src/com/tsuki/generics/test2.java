package com.tsuki.generics;

public class test2 {
    public static void main(String[] args) {
        //创建一个MyArrayList对象
        MyArrayList<String> list1 = new MyArrayList<>();
        //添加元素
        ListUtil.add(list1, "qqq", "www");
        //输出集合
        System.out.println(list1);
    }
}
