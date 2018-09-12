package com.hgy.designpatterns.behavioralpatterns.templatepattern;

/**
 * @author Evan
 * @Date 2018/9/12
 */
public class FootballGame extends Game {
    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
