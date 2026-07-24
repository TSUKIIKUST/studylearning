package com.tsuki.test2;

public class Test {
    public static void main(String[] args) {
        //创建一个人员对象
        Person person = new Person("猪头", 18, "男");
        //输出人员对象的信息
        System.out.println("姓名：" + person.getName() + "，年龄：" + person.getAge() + "，性别：" + person.getSex());

        //创建一个汽车对象
        Car car = new Car("奔驰e300", 100);
        //创建一个自行车对象
        Bicycle bicycle = new Bicycle("二八大杠", 10);

        //调用人员对象（person里去调用drive方法，根据参数判断是汽车还是自行车）的drive方法
        person.drive(car);
        person.drive(bicycle);
    }
}
