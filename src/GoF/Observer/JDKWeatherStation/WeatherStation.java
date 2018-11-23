package GoF.Observer.JDKWeatherStation;

import GoF.Observer.JDKWeatherStation.Display.CurrentConditionsDisplay;
import GoF.Observer.JDKWeatherStation.Display.ForecastDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new  ForecastDisplay(weatherData);

        weatherData.setMesurments(32,40,800);
        weatherData.setMesurments(25,60,850);
        weatherData.setMesurments(20,80,820);
    }
}
