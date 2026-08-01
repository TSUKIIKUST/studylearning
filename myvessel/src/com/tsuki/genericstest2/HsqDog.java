package com.tsuki.genericstest2;

public class HsqDog extends Dog {
    @Override
    public void eat() {
        //输出一个狗的具体信息包括名字，年龄和行为
        System.out.println("我是一个" + getName() + "的" + getAge() + "岁的狗,我正在吃狗粮，并且在拆家");
    }
}
