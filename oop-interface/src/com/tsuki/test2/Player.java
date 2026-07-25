package com.tsuki.test2;

public abstract class Player extends Person {
    //空构造
    public Player() {
    }
    //参数有
    public Player(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
