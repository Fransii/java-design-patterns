package patterns.creational.singleton.example5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Singleton {
    private static final Logger LOGGER = LoggerFactory.getLogger(Singleton.class);

    private volatile static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }

    public void doSomething() {
        LOGGER.info("Using singleton method...");
    }
}