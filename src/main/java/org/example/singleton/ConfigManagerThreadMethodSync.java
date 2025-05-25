package org.example.singleton;

public class ConfigManagerThreadMethodSync {

    //use volatile keyword
    //any write by one thread is visible to all thread
    //JVM reorders instructions - allocate memory, assign reference to instance, call contructor
    // If reorderred then we another thread might see instance!=null beofre on thread completes above instructions
    // volatile presenebt instruction reordering and visible to all threads
    // constructior is fully finished before all threads
    // use volatile for state sharing, avioid loc overhead like sync
    private static volatile ConfigManagerThreadMethodSync instance = null;

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
