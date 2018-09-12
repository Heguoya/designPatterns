package com.hgy.designpatterns.behavioralpatterns.chainpattern;

import com.hgy.designpatterns.behavioralpatterns.chainpattern.AbstractLogger;

/**
 * @author Evan
 * @Date 2018/9/12
 */
public class ConsoleAbstractLoggerImpl extends AbstractLogger {
    /**
     *
     * @param level
     */
    public ConsoleAbstractLoggerImpl(int level) {
        this.level=level;
    }

    /**
     * 写消息方法
     *
     * @param message
     */
    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
