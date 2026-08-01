package com.tsuki.hashmapdemo1;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    //构造方法
    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //get/set方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //重写equals方法和hashCode方法，使学生对象作为键时，根据姓名和年龄判断是否是同一个人

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
