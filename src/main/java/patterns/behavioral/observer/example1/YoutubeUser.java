package patterns.behavioral.observer.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class YoutubeUser implements Observer{

    private static final Logger LOGGER = LoggerFactory.getLogger(YoutubeUser.class);

    private String name;

    YoutubeUser(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        LOGGER.info("Hey " + name + ", the channel you subscribe has added new video!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }//jjjjjjjj
}
