package com.tsuki.test2;

public abstract class Coach extends Person {
    //空构造
    public Coach() {
    }
    //参数有
    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
