package com.tsuki.innerclasstest2;

import com.tsuki.innerclasstest1.Car;

public class Test {
    public static void main(String[] args) {

        //这是常规方式,创建一个学生对象,调用游泳方法，需要多创建一个java类
        //也就是student类
        /*Student s = new Student();
        goSwim(s);*/

        //这是匿名内部类方式,创建一个学生对象,调用游泳方法，不需要多创建一个java类
        /*      匿名内部类=没有名字的java类+继承或实现接口+重写方法+创建对象
                格式理解为没有名字的java类的对象
                new 类名/接口名（）{
                    重写类的方法或接口的方法
        }*/
//这个相当于swim的对象，复制给s变量
        Swim s = new Swim(){
            @Override
            public void swim() {
                System.out.println("学生在游泳");
            }

            @Override
            public void run() {
                System.out.println("学生在跑步");
            }
        };
        goSwim(s);

    }


    //这是一个内部类,表示学生
    public static void goSwim(Swim s) {
        s.swim();
    }
}
