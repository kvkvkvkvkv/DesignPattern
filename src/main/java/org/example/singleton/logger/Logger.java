package org.example.singleton.logger;

public class Logger {

    private static volatile Logger instance = null;

    private enum LogLevel{
        INFO,
        WARN,
        DEBUG,
        ERROR
    }

    private Logger() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method");
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    private void log(String message, LogLevel logLevel) {
        System.out.println(logLevel.name()+" "+message);
    }

    public void info(String message) {
        log(message, LogLevel.INFO);
    }

    public void debug(String message) {
        log(message, LogLevel.DEBUG);
    }

    public void warn(String message) {
        log(message, LogLevel.WARN);
    }

    public void error(String message) {
        log(message, LogLevel.ERROR);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve() {
        return getInstance();
    }
}
