package com.tsuki.oopextendstest5;

public class Student extends Person {
    //学生特有属性
    String grade;

    //构造，无参构造
    public Student() {
    }
    //构造，有参构造
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    //get/set方法
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }


    //学生特有方法
    public void study(){
        System.out.println("我在学习");
    }
}
