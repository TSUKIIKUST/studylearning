package com.tsuki.loopwhile;

public class whiledemo2 {
    public static void main(String[] args) {
    //珠穆朗玛峰高8848.6米，一张纸0.1毫米，折叠多少次，可以折叠出珠穆朗玛峰的高度？
        double height = 8848860;
        int count = 0;
        double paper = 0.1;
        //循环
        while(paper <  height){
            paper = paper * 2;
            count++;
        }
        System.out.println("折叠了"+count+"次，可以折叠出珠穆朗玛峰的高度");
    }
}
