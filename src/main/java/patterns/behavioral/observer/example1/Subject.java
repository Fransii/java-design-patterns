package patterns.behavioral.observer.example1;

import java.util.List;

public interface Subject {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
    List<Observer> getObservers();
}
