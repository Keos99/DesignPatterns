package BF.Observer.WeatherStation;

import BF.Observer.WeatherStation.Display.CurrentConditionsDisplay;
import BF.Observer.WeatherStation.Display.ForecastDisplay;
import BF.Observer.WeatherStation.Display.StatisticsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay cCDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMesurments(32,40,800);
        weatherData.setMesurments(25,60,850);
        weatherData.setMesurments(20,80,820);
        weatherData.setMesurments(15, 70, 700);
    }
}
