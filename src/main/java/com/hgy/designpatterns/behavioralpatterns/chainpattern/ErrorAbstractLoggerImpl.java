package com.hgy.designpatterns.behavioralpatterns.chainpattern;

import com.hgy.designpatterns.behavioralpatterns.chainpattern.AbstractLogger;

/**
 * @author Evan
 * @Date 2018/9/12
 */
public class ErrorAbstractLoggerImpl extends AbstractLogger {
    /**
     *
     * @param level
     */
    public ErrorAbstractLoggerImpl(int level) {
        this.level=level;
    }

    /**
     * 写消息方法
     *
     * @param message
     */
    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
