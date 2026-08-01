package com.tsuki.mapdemo1;

import java.util.HashMap;
import java.util.Map;

public class maptest {
    public static void main(String[] args) {
        //创建一个map对象
        Map<String, String> m = new HashMap<>();
        //添加元素
        m.put("猎鹰", "软脚虾");
        m.put("痱子咳烂", "宫监");
        m.put("解说一哥", "玩宝宝");
        //删除元素
        //m.remove("解说一哥");

        //清空元素
        //m.clear();
        //判断是否包含某个键
        //System.out.println(m.containsKey("猎鹰"));
        //判断是否包含某个值
        //System.out.println(m.containsValue("软脚虾"));

        //System.out.println(m.size());

        //判断是否为空
        System.out.println(m.isEmpty());
        //遍历元素
        System.out.println(m);
    }
}
