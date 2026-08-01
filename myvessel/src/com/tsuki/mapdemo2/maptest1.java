package com.tsuki.mapdemo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class maptest1 {
    public static void main(String[] args) {
        //创建一个map对象
        Map<String, String> m = new HashMap<>();
        //添加元素
        m.put("猎鹰", "软脚虾");
        m.put("弓箭手", "宫监");
        m.put("解说一哥", "玩宝宝");
        //获取所有的键，放到一个单列集合中
        Set<String> set = m.keySet();
        //遍历集合
        for(String key : set){
            //System.out.println(key);
            //获取对应的值
            String value = m.get(key);
            System.out.println(key + "=" + value);
        }
        //使用迭代器的方法遍历集合
    }
}
