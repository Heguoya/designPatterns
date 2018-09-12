package com.hgy.designpatterns.behavioralpatterns.chainpattern;

/**
 * @author Evan
 * @Date 2018/9/12
 */
public class ChainPatternDemo {
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorAbstractLoggerImpl(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileAbstractLoggerImpl(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleAbstractLoggerImpl(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
