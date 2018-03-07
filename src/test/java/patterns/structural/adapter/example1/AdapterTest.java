package patterns.structural.adapter.example1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

class AdapterTest {

    private SDCard laptop;

    private SDCard sdCard;

    @BeforeEach
    void setUp() {
        sdCard = spy(new MiniSDCardAdapter(new MiniSDCard()));
        laptop = new Laptop(sdCard);
    }

    @Test
    void adapterTest(){
        laptop.readDataFromCard();
        verify(sdCard).readDataFromCard();
    }
}