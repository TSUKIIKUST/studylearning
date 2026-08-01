package com.tsuki.collectiontest1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class test1 {
    public static void main(String[] args) {
        //迭代器的遍历方法
        Collection<String> coll = new ArrayList<>();
        //添加元素
        coll.add("qqq");
        coll.add("bwab");
        coll.add("dwab");
        coll.add("dwad");
        coll.add("bdb");
        //迭代器的遍历方法
        Iterator<String> it  = coll.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

    }

}
