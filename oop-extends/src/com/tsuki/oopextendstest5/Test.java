package com.tsuki.oopextendstest5;

public class Test {
    public static void main(String[] args) {

        //创建一个GraduateStudent对象
        GraduateStudent graduateStudent = new GraduateStudent("张三", 20, "硕士");
        System.out.println(graduateStudent.getName());
        System.out.println(graduateStudent.getAge());
        System.out.println(graduateStudent.getGrade());
        //调用方法
        graduateStudent.study();
        graduateStudent.sleep();

    }
}
