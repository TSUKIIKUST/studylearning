package com.tsuki.test3;

public abstract class Animal {
    //属性,名字，颜色
    String name;
    String color;

    //方法,构造方法
    public Animal() {
    }
    //有参构造方法

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }
    //GET/SET


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //方法,吃
    public abstract void eat();
    //喝水
    public void drink() {
        System.out.println("喝水");
    }
}

