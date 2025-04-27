package org.example.observer.subject;

import org.example.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private int temp;
    private int humidity;
    private int pressure;
    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public void setData(int temp, int humidity, int pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    public int getTemp() {
        return temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }
}
