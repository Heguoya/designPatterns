package com.hgy.designpatterns.behavioralpatterns.chainpattern;

import com.hgy.designpatterns.behavioralpatterns.chainpattern.AbstractLogger;

/**
 * @author Evan
 * @Date 2018/9/12
 */
public class FileAbstractLoggerImpl extends AbstractLogger {
    /**
     *
     * @param level
     */
    public FileAbstractLoggerImpl(int level) {
        this.level=level;
    }

    /**
     * 写消息方法
     *
     * @param message
     */
    @Override
    protected void write(String message) {
        System.out.println("File Console::Logger: " + message);
    }
}
