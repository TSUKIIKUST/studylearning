package com.tsuki.ooptest3;

public class Dog {
    //定义一个狗类，包含属性：姓名、年龄
     String name;
    private int age;
    //小狗的年龄有要求是0-15岁
    public void setAge(int age) {
        if (age >= 0 && age <= 15) {
            this.age = age;
        } else {
            System.out.println("小狗的年龄必须在0-15岁之间");
        }
    }
    //定义一个方法，用于获取小狗的年龄
    public int getAge() {
        return age;
    }
    //定义狗类的方法，包括吃骨头
    public void eat() {
        System.out.println("我是" + name + "，我正在吃骨头");
    }
}
