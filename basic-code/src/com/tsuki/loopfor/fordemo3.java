package com.tsuki.loopfor;

public class fordemo3 {
    static void main(String[] args) {
        //求偶数的和
        int sum = 0;
        for(int i = 1; i <= 100; i++)
        {
            if(i % 2 == 0)
            {
                sum = sum + i;

            }
        }
        System.out.println("1到100偶数的和为："+ sum);
    }
}
