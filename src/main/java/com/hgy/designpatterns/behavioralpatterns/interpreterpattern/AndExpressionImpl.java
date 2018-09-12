package com.hgy.designpatterns.behavioralpatterns.interpreterpattern;

/**
 * @author Evan
 * @Date 2018/9/12
 */
public class AndExpressionImpl implements Expression {

    private Expression  expression;
    private Expression  expression1;

    public AndExpressionImpl(Expression expression, Expression expression1) {
        this.expression = expression;
        this.expression1 = expression1;
    }

    /**
     * 解释方法
     *
     * @param context
     * @return
     */
    @Override
    public boolean interpreter(String context) {
        return expression.interpreter(context) && expression1.interpreter(context);
    }
}
