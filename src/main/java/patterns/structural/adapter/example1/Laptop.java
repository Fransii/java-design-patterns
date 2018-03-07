package patterns.structural.adapter.example1;

public class Laptop implements SDCard{

    private SDCard sdCard;

    Laptop(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    @Override
    public void readDataFromCard() {
        sdCard.readDataFromCard();
    }
}
