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

    //reflection can break private
    //block reflection with null check
//    Constructor<ConfigManagerThreadMethodSync> constructor = ConfigManagerThreadMethodSync.class.getDeclaredConstructor();
//    constructor.setAccessible(true);
//    ConfigManagerThreadMethodSync hacked = constructor.newInstance();
    // ConfigManagerThreadMethodSync.getInstance(); will not be called directly new ConfigManagerThreadMethodSync() calls
    private ConfigManagerThreadMethodSync() {
        if (instance != null) {
            //throw error so reflection can't create new instance
            throw new RuntimeException("Use getInstance() method");
        }
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

/*
* serialization + deserialised causes singleton to break
* as bytestream creates a new object
* write read resove to sove this
* ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("config.ser"));
oos.writeObject(ConfigManagerThreadMethodSync.getInstance());
oos.close();

ObjectInputStream ois = new ObjectInputStream(new FileInputStream("config.ser"));
ConfigManagerThreadMethodSync deserialized = (ConfigManagerThreadMethodSync) ois.readObject();

*
* ConfigManagerThreadMethodSync original = ConfigManagerThreadMethodSync.getInstance();
System.out.println(original == deserialized); // ❌ false
return existing obj than newly created obj
* */
    protected Object readResolve() {
        return instance;
    }

    /*
    ConfigManagerThreadMethodSync s1 = ConfigManagerThreadMethodSync.getInstance();
    ConfigManagerThreadMethodSync s2 = (ConfigManagerThreadMethodSync) s1.clone();
    can break with this if impl Clomeable
    creates low level copy of instance without constructor, even if it's private
    */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    /*
    * Class loader issue - each class loader creates a new byte code of the .java class
    * So we can end up with different instance per class loaded
    * ClassLoader loader1 = new CustomClassLoader();
ClassLoader loader2 = new CustomClassLoader();

Class<?> class1 = loader1.loadClass("ConfigManagerThreadMethodSync");
Class<?> class2 = loader2.loadClass("ConfigManagerThreadMethodSync");

Object obj1 = class1.getMethod("getInstance").invoke(null);
Object obj2 = class2.getMethod("getInstance").invoke(null);

System.out.println(obj1 == obj2); // ❌ false — two Singletons!

* each class has it's own static variables so instane gets created twice
* use shared class loader loaded by parent, bootstrap class loader or system classloader
*
    * */
}
