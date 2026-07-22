package com.tsuki.finaltest;

public class FinalTest {
    public static void main(String[] args) {
        //创建一个学生对象
        final Student STU = new Student();
        //调用方法
        /*System.out.println(STU.getName());
        System.out.println(STU.getAge());*/
        System.out.println(STU.name);
        System.out.println(STU.age);
    }
}
