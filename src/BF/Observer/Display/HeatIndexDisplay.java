package BF.Observer.Display;

import BF.Observer.Observer;
import BF.Observer.WeatherData;

public class HeatIndexDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public HeatIndexDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
