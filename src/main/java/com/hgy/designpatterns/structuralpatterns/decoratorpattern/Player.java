package com.hgy.designpatterns.structuralpatterns.decoratorpattern;

/**
 * 装饰者测试类
 * @author Evan
 * @Date 2018/9/11
 */
public class Player {
    public static void main(String[] args) {
        //选择英雄
        Hero hero = new BlindMonk("李青");

        Skills skills = new Skills(hero);
        Skills r = new SkillsR(skills,"猛龙摆尾");
        Skills e = new SkillsE(r,"天雷破/摧筋断骨");
        Skills w = new SkillsW(e,"金钟罩/铁布衫");
        Skills q = new SkillsQ(w,"天音波/回音击");
        //学习技能
        q.learnSkills();
    }
}
