package patterns.structural.facade.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThirdComplicatedClass {

    private static final Logger LOGGER = LoggerFactory.getLogger(ThirdComplicatedClass.class);

    public void doThirdComplicatedStuff(){
        LOGGER.info("doThirdComplicatedStuff");
    }
}
