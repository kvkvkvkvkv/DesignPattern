package org.example.singleton.logger;

public class Logger {

    private static volatile Logger instance = null;

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

    public void log(String message, String level) {
        System.out.println(level+" "+message);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve() {
        return getInstance();
    }
}
