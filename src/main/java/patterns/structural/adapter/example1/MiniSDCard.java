package patterns.structural.adapter.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiniSDCard {

    private Logger LOGGER = LoggerFactory.getLogger(MiniSDCard.class);

    public void readData(){
        LOGGER.info("Reading data...");
    }
}
