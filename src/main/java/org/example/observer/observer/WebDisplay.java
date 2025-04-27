package org.example.observer.observer;

import org.example.observer.subject.WeatherData;

public class WebDisplay implements Observer, Display{
    WeatherData weatherData;

    int temp;
    int humidity;
    int pressure;

    public WebDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
    }

    @Override
    public void update() {
        this.humidity = weatherData.getHumidity();
        this.temp = weatherData.getTemp();
        this.pressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("Web Display");
        System.out.println(temp+" "+humidity+" "+pressure);
    }
}
