package com.tsuki.ooptest2;

public class Test {
    static void main(String[] args) {
        //创建一个教师对象,管理老师的信息
        Teacher teacher1 = new Teacher();
        //给教师对象赋值
        teacher1.name = "玩机器";
        teacher1.age = 30;
        //输出教师的信息
        System.out.println("教师的姓名是：" + teacher1.name);
        System.out.println("教师的年龄是：" + teacher1.age);
        //调用教师对象的方法
        teacher1.teach();
        teacher1.eat();
        teacher1.sleep();
    }
}
