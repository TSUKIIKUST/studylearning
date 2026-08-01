package com.tsuki.set;

import java.util.TreeSet;

public class Treesetdemo2 {
    public static void main(String[] args) {
        //创建一个学生对象
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 19);
        Student s3 = new Student("王五", 20);
        //创建一个treeset对象
        TreeSet<Student> ts = new TreeSet<>();
        //添加元素
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        //遍历元素
        System.out.println(ts);
    }
}
