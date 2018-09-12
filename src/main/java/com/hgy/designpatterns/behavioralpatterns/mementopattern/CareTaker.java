package com.hgy.designpatterns.behavioralpatterns.mementopattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evan
 * @Date 2018/9/12
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
