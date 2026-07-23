package com.tsuki.oopextendstest5;

public class GraduateStudent extends Student {
    //构造，无参构造
    public GraduateStudent() {
    }
    //构造，有参构造
    public GraduateStudent(String name, int age, String grade) {
        super(name, age, grade);
    }
    //get/set方法

    //重写学习方法
    @Override
    public void study() {
        System.out.println("攻读研究生学位");
    }
    //重写sleep方法
    @Override
    public void sleep() {
        System.out.println("研究生住宿升级");
    }
}
