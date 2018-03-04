package patterns.creational.singleton.example2;

class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();

        return instance;
    }

    public void doSomething() {
        System.out.println("Using singleton method...");
    }
}
