package com.tsuki.treemapdemo1;

import java.util.TreeMap;

//统计字符串中每个字符出现的次数
//使用treemap集合实现
public class test3 {
    public static void main(String[] args) {
        //创建一个字符串对象
        String str = "abcaaddc";
        //调用方法
        countChar(str);
    }
    //定义一个方法，统计字符串中每个字符出现的次数
    public static void countChar(String str) {
        //创建一个treemap集合，键是字符，值是字符出现的次数
        TreeMap<Character, Integer> m = new TreeMap<>();
        //添加元素
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (m.containsKey(c)) {
                //字符存在，次数加1
                m.put(c, m.get(c) + 1);
            } else {
                //字符不存在，次数为1
                m.put(c, 1);
            }
        }
        //遍历元素
        System.out.println(m);
    }
}
