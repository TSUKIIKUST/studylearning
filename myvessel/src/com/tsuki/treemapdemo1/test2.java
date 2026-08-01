package com.tsuki.treemapdemo1;

import java.util.TreeMap;

public class test2 {
    public static void main(String[] args) {
        //创建一个treemap集合，键是学生对象，值是籍贯，
        //   同姓名同年龄认为是同一个人
        TreeMap<Student, String> m = new TreeMap<>();
        //添加元素
        Student s1 = new Student("zhangsan", 188);
        Student s2 = new Student("lisi", 19);
        Student s3 = new Student("wangwu", 200);
        m.put(s1, "北京");
        m.put(s2, "上海");
        m.put(s3, "广州");
        //遍历元素
        System.out.println(m);
    }
}
