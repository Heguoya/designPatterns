package com.hgy.designpatterns.behavioralpatterns.interpreterpattern;

/**
 * @author Evan
 * @Date 2018/9/12
 */
public class InterpreterPatternDemo {
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpressionImpl("Robert");
        Expression john = new TerminalExpressionImpl("John");
        return new OrExpressionImpl(robert, john);
    }

    public static Expression getMarriedWomenExpression() {
        Expression julie = new TerminalExpressionImpl("Julie");
        Expression married = new TerminalExpressionImpl("Married");
        return new AndExpressionImpl(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomenExpression();
        System.out.println("John is male? " + isMale.interpreter("John"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpreter("Married Julie"));
    }
}
