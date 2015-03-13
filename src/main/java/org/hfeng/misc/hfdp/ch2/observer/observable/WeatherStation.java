package org.hfeng.misc.hfdp.ch2.observer.observable;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionDisplay =
            new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.2f);
    }
}

//////////////////////////////////////////////////////////
// <===================OUTPUT===================>       //
// Forecast: Watch out for cooler, rainy weather        //
// Avg/Max/Min temperate = 82.0/82.0/82.0               //
// Current conditions: 82.0F degrees and 82.0% humidity //
//                                                      //
// Forecast: More of the same                           //
// Avg/Max/Min temperate = 82.0/82.0/82.0               //
// Current conditions: 82.0F degrees and 82.0% humidity //
//////////////////////////////////////////////////////////
