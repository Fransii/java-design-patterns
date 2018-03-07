package patterns.structural.adapter.example1;

public class MiniSDCardAdapter implements SDCard {

    private MiniSDCard miniSDCard;

    MiniSDCardAdapter(MiniSDCard miniSDCard) {
        this.miniSDCard = miniSDCard;
    }

    @Override
    public void readDataFromCard() {
        miniSDCard.readData();
    }
}
