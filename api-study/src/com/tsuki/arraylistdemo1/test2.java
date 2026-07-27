package com.tsuki.arraylistdemo1;

import java.util.ArrayList;

public class test2 {
    static void main(String[] args) {
        //创建一个arra ylist对象,添加数字，并进行遍历
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        //遍历list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
