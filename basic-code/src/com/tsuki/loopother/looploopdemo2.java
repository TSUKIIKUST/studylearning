package com.tsuki.loopother;

public class looploopdemo2 {
    static void main(String[] args) {
        //表
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
                //制表符·t
            }
            System.out.println();
            


        }
    }
}
