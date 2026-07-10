package com.tsuki.loopother;

import java.util.Random;
import java.util.Scanner;

public class guessdemo {
    static void main(String[] args) {
        //随机生成一个1-100的数字，让用户猜，如果猜对，则结束循环
        // 如果猜错，则提示用户是否继续，如果继续，则继续猜
        //同时加入保底机制，三次提示范围，10次直接告诉答案

        //生成随机数
      Random random = new Random();
      int number = random.nextInt(101);
      System.out.println(number);
      int countA = 0; //小保底
      int countB = 0; //大保底

      while(true){
          //让用户多次输入数
          Scanner sc = new Scanner(System.in);
          System.out.println("请输入数字：");
          int guessNumber = sc.nextInt();
          countA++;
          countB++;
          if(countB == 10){
              System.out.println("你猜的次数已经超过10次，答案是：" + number);
          }
          //比较
          if(guessNumber > number){
              System.out.println("你猜的数字太大了");
          }else if(guessNumber < number){
              System.out.println("你猜的数字太小了");
          }else{
              System.out.println("恭喜你猜对了");
              // 猜中了循环结束
              break;
          }

          // 小保底的业务逻辑，需要写在比较的下面
          // 触发时间：每三次没有猜中，就会触发小保底，此时是比较完毕之后，才能断定用户没有猜中
          if(countA % 3 == 0){
              System.out.println("触发小保底机制，随机数字的范围" + (number - 5) + "~" + (number + 5));
          }

      }

    }
}
