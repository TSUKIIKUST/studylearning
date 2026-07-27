package com.tsuki.arraylistdemo1;

import javax.management.Query;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class test3 {
    static void main(String[] args) {
        //定义一个集合，添加学生对象，学生对象包含id，姓名，年龄
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("1","张三",18);
        Student s2 = new Student("2","李四",19);
        Student s3 = new Student("3","王五",20);
               list.add(s2);
               list.add(s1);
               list.add(s3);
        //遍历list，输出每个学生的信息
        for (Student s : list) {
            System.out.println(s.getId() + " " + s.getName() + " " + s.getAge());
        }
        //调用queryStudent方法，查询id为2的学生信息
        int index = queryStudent(list, "8");
        System.out.println(index);
    }




    //写一个方法，根据id查询学生信息，存在：返回索引，不存在：返回-1
    public static int queryStudent(ArrayList<Student> list, String id) {

        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
