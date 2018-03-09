package patterns.creational.builder.example1;

public class App {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("Notebook")
                .setProcessor(Processor.INTEL)
                .setStorage(Storage.SSD)
                .build();

        System.out.println(computer);
    }
}
