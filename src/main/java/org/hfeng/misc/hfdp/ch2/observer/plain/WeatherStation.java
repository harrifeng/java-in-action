package org.hfeng.misc.hfdp.ch2.observer.plain;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.2f);
    }
}

////////////////////////////////////////////////////////
// <===================OUTPUT===================>     //
// Current condition: 80.0F degree and 65.0% humidity //
// Avg/Max/Min temperate = 80.0/80.0/80.0             //
// Forecast: Improving weather on the day             //
//                                                    //
// Current condition: 82.0F degree and 70.0% humidity //
// Avg/Max/Min temperate = 81.0/82.0/80.0             //
// Forecast: Watch out for cooler, rainy weather      //
////////////////////////////////////////////////////////
