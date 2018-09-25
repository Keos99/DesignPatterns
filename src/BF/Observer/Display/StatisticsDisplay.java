package BF.Observer.Display;

import BF.Observer.Observer;
import BF.Observer.WeatherData;

public class StatisticsDisplay implements Observer, Display {

    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public StatisticsDisplay (WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Static Display: " + temperature + humidity + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("StatisticsDisplay: " + temp + humidity + pressure);
        display();
    }
}
