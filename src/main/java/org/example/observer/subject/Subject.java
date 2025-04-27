package org.example.observer.subject;

import org.example.observer.observer.Observer;

public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}
