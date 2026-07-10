package com.tsuki.ifdemo;

import java.util.Scanner;

public class ifdemo2 {
    /*需求：初始最大生命200，受到X点伤害，技能恢复Y点血，X和Y由键盘录入而来
    假设，游戏人物不会死亡，最少1点血
    问：最终游戏人物血量是多少？*/
    static void main(String[] args) {
        //输入原始血量
        int life = 200;
        //需要手动输入伤害
        System.out.println("请输入伤害：");
        int hurt = new Scanner(System.in).nextInt();
        life -= hurt;
        //判断伤害是否小于0
        if (life < 0) {
            life = 1;
            System.out.println("游戏结束，剩余生命：" + life);
        }
        System.out.println("剩余生命：" + life);
        //需要手动输入技能恢复的血量
        System.out.println("请输入技能恢复的血量：");
        int skill = new Scanner(System.in).nextInt();
        //血量恢复后不能超过200
        life += skill;
        if (life > 200) {
            life = 200;
        }
        System.out.println("技能恢复后剩余生命：" + life);

    }
}
