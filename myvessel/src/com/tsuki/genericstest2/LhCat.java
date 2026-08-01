package com.tsuki.genericstest2;

public class LhCat extends Cat {
    @Override
    public void eat() {
        //输出一个猫的具体信息包括名字，年龄和行为
        System.out.println("我是一个" + getName() + "的" + getAge() + "岁的猫,我正在吃罐头");
    }
}
