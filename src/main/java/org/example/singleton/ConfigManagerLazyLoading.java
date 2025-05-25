package org.example.singleton;

public class ConfigManagerLazyLoading {

    private static ConfigManagerLazyLoading instance = null;

    private ConfigManagerLazyLoading() {
    }

    public static ConfigManagerLazyLoading getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            instance = new ConfigManagerLazyLoading();
        }
        return instance;
    }

    public void loadConfig() {
        System.out.println("ConfigManagerLazyLoading");
    }
}
