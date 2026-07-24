package com.tsuki.test1;

public class StudentManger {
    //定义一个方法表示注册用户
    //参数person可以传递本身，也可以传递子类对象
    public void register(Person person) {
        //姓名张三，账号zhangsan123，密码123456
        System.out.println("注册用户：" + person.getName() + "，账号：" + person.getAccount() + "，密码：" + person.getPassword());
        //调用学生对象的work方法
        person.work();
    }
}
