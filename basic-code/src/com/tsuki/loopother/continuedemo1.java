package com.tsuki.loopother;

public class continuedemo1 {
    static void main(String[] args) {
        //continue就是本次循环结束，继续下一次循环
        //逢7过
        for (int i = 1; i <= 100; i++) {
            if(i%10 == 7|| i/10%10 == 7|| i%7 == 0){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
