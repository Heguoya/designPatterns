package com.hgy.designpatterns.behavioralpatterns.chainpattern;

/**
 * @author Evan
 * @Date 2018/9/12
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    protected int level;
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level , String message){
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level,message);
        }
    }

    /**
     * 写消息方法
     * @param message
     */
    protected abstract void write(String message);
}
