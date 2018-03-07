package patterns.creational.singleton.example4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Singleton {
    private static final Logger LOGGER = LoggerFactory.getLogger(Singleton.class);

    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void doSomething() {
        LOGGER.info("Using singleton method...");
    }
}