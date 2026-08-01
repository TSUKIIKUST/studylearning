package com.tsuki.treemapdemo1;

import java.util.Comparator;
import java.util.TreeMap;

public class test1 {
    public static void main(String[] args) {
        //创建一个treemap集合，姓名作为键，年龄作为值，添加元素
        TreeMap<Integer,String> m = new TreeMap<>(new Comparator<Integer>() {
            //重写compare方法，实现倒序排序
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        //添加元素
        m.put(18, "张三");
        m.put(19, "李四");
        m.put(20, "王五");
        m.put(18, "赵六");

        //输出正序
        System.out.println(m);
    }
}
