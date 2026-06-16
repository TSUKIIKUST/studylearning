package com.tsuki.bianliang;

public class bianliangdemo2 {
    /*我方：叉子           对方：长手
    攻击：220            攻击：210
    防御：85             防御：80
    血量：1012.5         血量：1223.3
    技能加成:  1.2       技能加成: 1.3

    技能造成伤害的公式：攻击力 * 技能加成 – 对方防御力
    普攻造成伤害的公式：攻击力 – 对方防御力

    计算：
    我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量？
    我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量？

    规则：经常发生改变的数据，用变量记录*/
    static void main(String[] args) {
        double myAttack = 220;
        double myDefense = 85;
        double myHealth = 1012.5;
        double mySkillAdd = 1.2;

        double enemyAttack = 210;
        double enemyDefense = 80;
        double enemyHealth = 1223.3;
        double enemySkillAdd = 1.3;

        //我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量？
        double myAttackDamage = myAttack - enemyDefense;
        enemyHealth -= myAttackDamage;
        System.out.println("对方还剩余多少血量: "+enemyHealth);

        //我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量？
        double mySkillDamage = myAttack * mySkillAdd - enemyDefense;
        enemyHealth -= mySkillDamage;
        System.out.println("对方还剩余多少血量: "+enemyHealth);
    }

}
