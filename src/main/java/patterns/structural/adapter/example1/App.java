package patterns.structural.adapter.example1;

public class App {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(new MiniSDCardAdapter(new MiniSDCard()));
        laptop.readDataFromCard();
    }
}
