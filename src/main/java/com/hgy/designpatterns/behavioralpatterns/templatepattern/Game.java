package com.hgy.designpatterns.behavioralpatterns.templatepattern;

/**
 * @author Evan
 * @Date 2018/9/12
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
