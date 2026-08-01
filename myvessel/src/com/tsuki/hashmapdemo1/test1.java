package com.tsuki.hashmapdemo1;

import java.util.HashMap;

public class test1 {
    public static void main(String[] args) {
        //创建一个hashmap集合，学生对象作为键，籍贯作为值，添加元素，
        //   同姓名同年龄认为是同一个人
        HashMap<Student, String> m = new HashMap<>();
        //创建学生对象
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 19);
        Student s3 = new Student("王五", 20);
        Student s4 = new Student("张三", 18);

        //添加元素
        m.put(s1, "北京");
        m.put(s2, "上海");
        m.put(s3, "广州");
        m.put(s4, "河南");

        //遍历集合
        for (Student s : m.keySet()) {
            System.out.println(s + "=" + m.get(s));
        }
    }
}
