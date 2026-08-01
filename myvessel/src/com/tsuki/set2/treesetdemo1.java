package com.tsuki.set2;

import java.util.Comparator;
import java.util.TreeSet;

public class treesetdemo1 {
    public static void main(String[] args) {
        //创建一个treeset对象
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
           //重写compare方法,根据字符串的长度进行比较
           @Override
           public int compare(String o1, String o2) {
               int i = o1.length() - o2.length();
               i = i == 0 ? o1.compareTo(o2) : i;
               return i;
           }
        });
        //添加元素
        ts.add("c");
        ts.add("ab");
        ts.add("wfewfw");
        ts.add("df");
        ts.add("qwer");
        //遍历元素
        System.out.println(ts);
    }
}
