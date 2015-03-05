package org.hfeng.misc.hfdp.ch2.observer.observable;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionDisplay =
            new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(82, 70, 29.2f);
    }
}

//////////////////////////////////////////////////////////
// <===================OUTPUT===================>       //
// Current conditions: 82.0F degrees and 82.0% humidity //
//////////////////////////////////////////////////////////
