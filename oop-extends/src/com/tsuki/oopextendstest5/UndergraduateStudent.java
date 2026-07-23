package com.tsuki.oopextendstest5;

public class UndergraduateStudent extends Student {
    //构造，无参构造
    public UndergraduateStudent() {
    }
    //构造，有参构造
    public UndergraduateStudent(String name, int age, String grade) {
        super(name, age, grade);
    }
    //get/set方法


    //重写学习方法
    @Override
    public void study() {
        System.out.println("攻读本科生学位");
    }
}
