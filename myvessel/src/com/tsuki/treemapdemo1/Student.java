package com.tsuki.treemapdemo1;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    //构造方法
    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //重写toString方法，实现姓名和年龄的toString方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //根据年龄比较，年龄一样按姓名字母排序，同姓名年龄也认为是同一个人
        if (this.age != o.age) {
            //年龄不一样，按年龄排序
            return this.age - o.age;
        }
        //年龄一样，按姓名字母排序
        return this.name.compareTo(o.name);
    }
}
