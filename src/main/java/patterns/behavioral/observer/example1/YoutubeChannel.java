package patterns.behavioral.observer.example1;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

    private List<Observer> observers;

    YoutubeChannel() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        System.out.println("Adding new subscriber...");
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        System.out.println("Removing subscriber...");
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("New video published! - notifying all subscribers ...");
        for(Observer observer : observers){
            observer.update();
        }
    }
}
