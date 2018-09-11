package com.hgy.designpatterns.structuralpatterns.decoratorpattern;

/**
 *  英雄盲僧实现类
 * @author Evan
 * @Date 2018/9/11
 */
public class BlindMonk implements Hero {
    /**
     * 英雄的名字
     */
    private String name;

    /**
     *
     * @param name
     */
    public BlindMonk(String name) {
        this.name = name;
    }

    /**
     * 学习技能
     */
    @Override
    public void learnSkills() {
        System.out.println(name+"学习了以上技能");
    }
}
