package com.hgy.designpatterns.behavioralpatterns.interpreterpattern;

/**
 * 解释器接口
 * @author Evan
 * @Date 2018/9/12
 */
public interface Expression {
    /**
     * 解释方法
     * @param context
     * @return
     */
    boolean interpreter (String context);
}
