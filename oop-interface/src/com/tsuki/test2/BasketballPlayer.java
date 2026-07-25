package com.tsuki.test2;

public class BasketballPlayer extends Player  {
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球选手学习篮球");

    }
}
