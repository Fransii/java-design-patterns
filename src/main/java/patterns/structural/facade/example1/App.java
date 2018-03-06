package patterns.structural.facade.example1;

public class App {
    public static void main(String[] args) {
        Facade facade = new Facade(new FirstComplicatedClass(), new SecondComplicatedClass(), new ThirdComplicatedClass());
        facade.doSomething();
    }
}
