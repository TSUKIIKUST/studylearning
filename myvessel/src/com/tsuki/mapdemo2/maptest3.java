package com.tsuki.mapdemo2;

import java.util.HashMap;
import java.util.Map;

public class maptest3 {
    public static void main(String[] args) {
        //map的第三种遍历方式，使用lambda表达式
        Map<String, String> m = new HashMap<>();
        m.put("猎鹰", "软脚虾");
        m.put("弓箭手", "宫监");
        m.put("解说一哥", "玩宝宝");
        //遍历键值对
        m.forEach((key, value) -> System.out.println(key + "=" + value));
    }
}
