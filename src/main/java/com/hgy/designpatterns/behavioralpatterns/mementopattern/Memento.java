package com.hgy.designpatterns.behavioralpatterns.mementopattern;

/**
 * @author Evan
 * @Date 2018/9/12
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
