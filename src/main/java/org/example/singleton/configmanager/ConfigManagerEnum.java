package org.example.singleton.configmanager;


//all safe, class loader, serialization + deserialization, threads, reflection, clone
//can't extend another class as enum extend Enum
//Spring preferes class based singleton
//always eager init, not lazy
/*
Eager Initialization
Instance created at class load time.

Simple and thread-safe.

        Drawback: instance created even if never used.

        2. Lazy Initialization (Non-thread-safe)
Instance created only when needed.

Not safe in multithreaded environment.

Risk of multiple instances if accessed concurrently.

        3. Lazy Initialization with Synchronization
Thread-safe lazy initialization.

Synchronization adds overhead.

Can be optimized using Double-Checked Locking for better performance.

        4. Enum Singleton
Simplest and safest approach.

Handles serialization and reflection attacks internally.

Does not support lazy loading.

Cannot extend other classes (enums extend java.lang.Enum).*/
public enum ConfigManagerEnum {
    INSTANCE;

    public void loadConfig() {
        System.out.println("ConfigManagerEnum");
    }
}
