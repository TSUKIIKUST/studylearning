package com.tsuki.statictest1;

public class Test {
    public static void main(String[] args) {
        // 共享变量的练习
        Student.teacherName = "玩机器";
        //学生1对象定义
        Student s1 = new Student();
        s1.name = "张三";
        s1.age = 18;
        //改变一个学生老师，所有学生都用这个老师,进行共享，所以所有学生都用蓝宝石
        Student.teacherName = "蓝宝石";
        System.out.println(s1.name + "的老师是：" + Student.teacherName);
        //学生2对象定义
        Student s2 = new Student();
        s2.name = "李四";
        s2.age = 19;
        System.out.println(s2.name + "的老师是：" + Student.teacherName);
    }
}
