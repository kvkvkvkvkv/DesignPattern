package org.example.singleton;

public class ConfigManagerThreadSynchronized {

    private static ConfigManagerThreadSynchronized instance = null;

    private ConfigManagerThreadSynchronized() {
    }

    //cons happens each time. But needs to occur only first time as synchronized
    public static synchronized ConfigManagerThreadSynchronized getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            instance = new ConfigManagerThreadSynchronized();
        }
        return instance;
    }

    public void loadConfig() {
        System.out.println("ConfigManagerThreadSynchronized");
    }
}
