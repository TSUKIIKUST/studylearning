package com.tsuki.generics;

public class test1 {
    public static void main(String[] args) {
        //创建一个MyArrayList对象
        MyArrayList<String> list = new MyArrayList<>();
        //添加元素
        list.add("qqq");
        list.add("bwab");
        list.add("dwab");
        list.add("dwad");
        //获取元素
        System.out.println(list.get(0));
    }
}
