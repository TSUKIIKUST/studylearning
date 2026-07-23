package com.tsuki.oopextendstest5;

public class MajorTeacher extends Teacher {
    //构造，无参构造
    public MajorTeacher() {
    }
    //构造，有参构造
    public MajorTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    //教书方法
    @Override
    public void teach() {
        System.out.println("教专业课");
    }
}
