package org.example.singleton;

public class ConfigManagerEagerLoading {

    private static ConfigManagerEagerLoading instance = new ConfigManagerEagerLoading();

    private ConfigManagerEagerLoading() {
    }

    public static ConfigManagerEagerLoading getInstance() {
        return instance;
    }

    public void loadConfig() {
        System.out.println("Config loaded Eager");
    }
}
