package org.hfeng.misc.hfdp.ch2.observer.plain;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperate;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    public void update(float temperature, float humidity, float pressure) {
        this.temperate = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current condition: " + temperate + "F degree and " + humidity + "% humidity");
    }
}
