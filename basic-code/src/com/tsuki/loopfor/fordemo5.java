package com.tsuki.loopfor;

public class fordemo5 {
    public static void main(String[] args) {
        //数据规律题，有一组特殊的数字，从第三项开始，每一项都是前两项的数字和，请问第10项的数字是多少？
        //0，1，1，2，3，5，8，13，21，34，55，89…

        //想法是使用三个变量abc，三个依次进行赋值
        int a = 0;
        int b = 1;
        int c = 0;

        for(int i = 3; i <= 10; i++){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("第10项的数字是：" + c);


    }

}
