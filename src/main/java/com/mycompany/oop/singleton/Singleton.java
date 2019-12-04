package com.mycompany.oop.singleton;

/*public class Singleton {

    private Singleton() {
        if (Holder.INSTANCE != null) {
            throw new IllegalStateException("Singleton already constructed");
        }
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }
}*/
public class Singleton {
    private static volatile Singleton INSTANCE;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (INSTANCE == null)
            synchronized (Singleton.class) {
                if (INSTANCE == null)
                    INSTANCE = new Singleton();
            }
        return INSTANCE;
    }
}