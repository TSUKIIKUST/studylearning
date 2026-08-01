package com.tsuki.generics;

public class ListUtil {
    private ListUtil(){}
    //定义一个泛型方法,用于添加元素到集合中
    public static <E> void add(MyArrayList<E> list, E e1, E e2){
        list.add(e1);
        list.add(e2);
    }
    //定义一个普通方法show,用于遍历集合
    /*public static void show(MyArrayList<?> list){
        System.out.println(list);
    }*/
}
