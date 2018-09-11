package com.hgy.designpatterns.structuralpatterns.decoratorpattern;

/**
 *  Q技能
 * @author Evan
 * @Date 2018/9/11
 */
public class SkillsQ extends Skills {
    private String skillName;

    public SkillsQ(Hero hero,String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了技能Q:" +skillName);
        super.learnSkills();
    }
}
