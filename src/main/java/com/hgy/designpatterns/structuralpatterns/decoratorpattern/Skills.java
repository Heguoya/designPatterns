package com.hgy.designpatterns.structuralpatterns.decoratorpattern;

/**
 * 技能栏
 * @author Evan
 * @Date 2018/9/11
 */
public class Skills implements Hero {
    /**
     * 英雄接口
     */
    private Hero hero;

    public Skills(Hero hero) {
        this.hero = hero;
    }

    /**
     * 学习技能
     */
    @Override
    public void learnSkills() {
        if (hero != null) {
            hero.learnSkills();
        }
    }
}
