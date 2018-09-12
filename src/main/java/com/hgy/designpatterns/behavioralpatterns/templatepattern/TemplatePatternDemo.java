package com.hgy.designpatterns.behavioralpatterns.templatepattern;

/**
 * @author Evan
 * @Date 2018/9/12
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new CricketGame();
        game.play();
        System.out.println();
        game = new FootballGame();
        game.play();
    }
}
