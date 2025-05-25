package org.example.singleton;

public class ConfigManagerThreadMethodSync {

    private static ConfigManagerThreadMethodSync instance = null;

    private ConfigManagerThreadMethodSync() {
    }

    //better as sync will be used only if not null
    /*
    * Double check locking
    * Thread A sees null and enters, same time B sees null and enters
    * A takes sync and B will wait for sync. A sees instance null again and creates
    * B gets lock now see instance not null does not create new instance
    * Single time expensive
    * */
    public static ConfigManagerThreadMethodSync getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (ConfigManagerThreadMethodSync.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    instance = new ConfigManagerThreadMethodSync();
                }
            }
        }
        return instance;
    }

    public void loadConfig() {
        System.out.println("ConfigManagerThreadMethodSync");
    }
}
