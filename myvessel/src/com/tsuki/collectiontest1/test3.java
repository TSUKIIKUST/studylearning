package com.tsuki.collectiontest1;

import java.util.ArrayList;
import java.util.Collection;

public class test3 {
    public static void main(String[] args) {
        //使用lambda表达式遍历集合
        Collection<String> coll = new ArrayList<>();
        //添加元素
        coll.add("qqq");
        coll.add("bwab");
        coll.add("dwab");
        coll.add("dwad");
        //使用lambda表达式遍历集合
        coll.forEach(str -> System.out.println(str));
    }
}

