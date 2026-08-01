package com.tsuki.generics;
//自定义ArrayList类,支持泛型,不确定元素的类型\
//定义一个泛型类,用于存储任意类型的元素
public class MyArrayList <E> {
    //自己写一个ArrayList类,支持泛型,不确定元素的类型
    //定义一个数组,用于存储元素
    Object[] obj = new Object[10];
    //定义一个变量,用于记录元素的个数
    int size = 0;

    //定义一个方法,用于添加元素
    public boolean add(E e){
        obj[size] = e;
        size++;
        return true;
    }
    //定义一个方法,用于获取元素
    public E get(int index){
        return (E) obj[index];
    }
    @Override
    public String toString() {
        return "MyArrayList{" +
                "obj=" + java.util.Arrays.toString(obj) +
                ", size=" + size +
                '}';
    }
}
