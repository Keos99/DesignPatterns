package GoF.Observer.WeatherStation.Display;

import GoF.Observer.WeatherStation.Observer;
import GoF.Observer.WeatherStation.WeatherData;

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
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
