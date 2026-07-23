package com.tsuki.oopextendstest5;

public class Teacher extends Person {
    //教师特有属性
    String subject;

    //构造，无参构造
    public Teacher() {
    }
    //构造，有参构造
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    //get/set方法
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    //教师特有方法
    public void teach(){
        System.out.println("我在教学");
    }
}
