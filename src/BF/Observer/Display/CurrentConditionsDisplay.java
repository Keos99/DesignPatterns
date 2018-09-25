package BF.Observer.Display;

import BF.Observer.Observer;
import BF.Observer.Subject;

public class CurrentConditionsDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject wheatherdata){
        this.weatherData = wheatherdata;
        wheatherdata.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display(){
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
