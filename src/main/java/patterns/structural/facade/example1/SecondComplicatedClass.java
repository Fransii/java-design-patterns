package patterns.structural.facade.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecondComplicatedClass {

    private static final Logger LOGGER = LoggerFactory.getLogger(SecondComplicatedClass.class);

    public void doSecondComplicatedStuff(){
        LOGGER.info("doSecondComplicatedStuff");
    }
}
