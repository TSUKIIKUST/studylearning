package com.tsuki.mapdemo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class maptest2 {
    public static void main(String[] args) {
        //创建一个map对象
        Map<String, String> m = new HashMap<>();
        //添加元素
        m.put("猎鹰", "软脚虾");
        m.put("弓箭手", "宫监");
        m.put("解说一哥", "玩宝宝");
        //map的第二种遍历方式
        //遍历键值对
        Set<Map.Entry<String, String>> entries = m.entrySet();
        //遍历集合
        for(Map.Entry<String, String> entry : entries){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
