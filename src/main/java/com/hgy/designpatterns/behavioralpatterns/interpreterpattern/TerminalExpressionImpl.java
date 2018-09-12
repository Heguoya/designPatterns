package com.hgy.designpatterns.behavioralpatterns.interpreterpattern;

/**
 * @author Evan
 * @Date 2018/9/12
 */
public class TerminalExpressionImpl implements Expression {

    private String data;

    public TerminalExpressionImpl(String data) {
        this.data = data;
    }

    /**
     * 解释方法
     *
     * @param context
     * @return
     */
    @Override
    public boolean interpreter(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
