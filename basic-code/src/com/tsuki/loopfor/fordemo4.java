package com.tsuki.loopfor;

import java.util.Scanner;

public class fordemo4 {
    public static void main(String[] args) {  // ✅ 添加 public
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();

        // 找出最大值和最小值
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        // 统计既能被3整除又能被5整除的数字
        int count = 0;
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("找到：" + i);
                count++;
            }
        }
        System.out.println("在 " + min + " 到 " + max + " 范围内，");
        System.out.println("既能被3整除又能被5整除的数字有 " + count + " 个");
    }

}
