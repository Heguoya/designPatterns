package com.hgy.designpatterns.structuralpatterns.decoratorpattern;

/**
 *  W技能
 * @author Evan
 * @Date 2018/9/11
 */
public class SkillsW extends Skills {
    private String skillName;

    public SkillsW(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了技能W:" +skillName);
        super.learnSkills();
    }
}
