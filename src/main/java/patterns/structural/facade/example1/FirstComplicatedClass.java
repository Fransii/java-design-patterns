package patterns.structural.facade.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstComplicatedClass {

    private static final Logger LOGGER = LoggerFactory.getLogger(FirstComplicatedClass.class);

    public void doFirstComplicatedStuff(){
        LOGGER.info("doFirstComplicatedStuff");
    }
}
