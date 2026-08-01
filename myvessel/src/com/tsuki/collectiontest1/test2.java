package com.tsuki.collectiontest1;

import java.util.ArrayList;
import java.util.Collection;

public class test2 {
    public static void main(String[] args) {
        //增强for循环的遍历方法
        Collection<String> coll = new ArrayList<>();
        //添加元素
        coll.add("qqq");
        coll.add("bwab");
        coll.add("dwab");
        coll.add("dwad");
        //增强for循环的遍历方法
        for(String str : coll){
            System.out.println(str);

        }

    }
    
}

