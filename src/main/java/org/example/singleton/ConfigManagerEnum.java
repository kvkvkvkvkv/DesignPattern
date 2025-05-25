package org.example.singleton;


//all safe, class loader, serialization + deserialization, threads, reflection, clone
//can't extend another class as enum extend Enum
//Spring preferes class based singleton
//always eager init, not lazy
public enum ConfigManagerEnum {
    INSTANCE;

    public void loadConfig() {
        System.out.println("ConfigManagerEnum");
    }
}
