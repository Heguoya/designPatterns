package com.hgy.designpatterns.structuralpatterns.decoratorpattern;

/**
 *  R技能
 * @author Evan
 * @Date 2018/9/11
 */
public class SkillsR extends Skills {
    private String skillName;

    public SkillsR(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了技能R:" +skillName);
        super.learnSkills();
    }
}
