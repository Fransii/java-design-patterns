package patterns.creational.singleton.example1;

class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();

        return instance;
    }

    public void doSomething() {
        System.out.println("Using singleton method...");
    }
}
