package patterns.behavioral.observer.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

    private static final Logger LOGGER = LoggerFactory.getLogger(YoutubeChannel.class);

    private List<Observer> observers;

    YoutubeChannel() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        LOGGER.info("Adding new subscriber...");
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        LOGGER.info("Removing subscriber...");
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        LOGGER.info("New video published! - notifying all subscribers ...");
        for(Observer observer : observers){
            observer.update();
        }
    }

    @Override
    public List<Observer> getObservers() {
        return observers;
    }
}
