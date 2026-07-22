package com.tsuki.ooptest4;

public class Test {
    static void main(String[] args) {
        //创建一个学生对象,管理学生的信息
        Student student1 = new Student();
        //不赋值，输出默认值
        System.out.println("学生1的姓名是：" + student1.getName());
        System.out.println("学生1的年龄是：" + student1.getAge());
        System.out.println("学生1的性别是：" + student1.getSex());
        System.out.println("学生1的身高是：" + student1.getHeight());
        //调用有参数的构造方法，给学生对象赋值
        Student student2 = new Student("张三", 18, "男", 1.75);
        //输出学生2的信息
        System.out.println("学生2的姓名是：" + student2.getName());
        System.out.println("学生2的年龄是：" + student2.getAge());
        System.out.println("学生2的性别是：" + student2.getSex());
        System.out.println("学生2的身高是：" + student2.getHeight());
    }
}
