package com.hgy.designpatterns.structuralpatterns.decoratorpattern;

/**
 *  E技能
 * @author Evan
 * @Date 2018/9/11
 */
public class SkillsE extends Skills {
    private String skillName;

    public SkillsE(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了技能E:" +skillName);
        super.learnSkills();
    }
}
