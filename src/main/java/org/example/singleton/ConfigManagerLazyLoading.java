package org.example.singleton;

public class ConfigManagerLazyLoading {

    private static ConfigManagerLazyLoading instance = null;

    private ConfigManagerLazyLoading() {
    }

    public static ConfigManagerLazyLoading getInstance() {
        if (instance == null) {
            instance = new ConfigManagerLazyLoading();
        }
        return instance;
    }

    public void loadConfig() {
        System.out.println("Config loaded Lazy");
    }
}
