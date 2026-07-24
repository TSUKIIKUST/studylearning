package com.tsuki.test2;

import java.util.concurrent.Callable;

public class Person {
    //属性,姓名,年龄，性别
    String name;
    int age;
    String sex;
    //参数
    //默认构造方法
    public Person() {
    }
    //有参构造方法
    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    //get/set

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    //写多态方法，可以驾驶不同类型的机器，drive方法在这。
    //test来这个里面调用，依次调用汽车和自行车的move方法和honk方法和ringBell方法
    public void drive(Machine machine) {
       //调用机器的move方法，
        machine.move();//
        if (machine instanceof Car) {
            //判断是否是汽车，如果是汽车，进行强制类型转换，调用汽车的honk方法
            Car c = (Car) machine;
            c.honk();
                }else if (machine instanceof Bicycle) {
            Bicycle b = (Bicycle) machine;
            b.ringBell();
        }else{
            System.out.println("未知机器类型");
        }
    }
}
