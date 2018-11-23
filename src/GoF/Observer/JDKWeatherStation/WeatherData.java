package GoF.Observer.JDKWeatherStation;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
    }

    public void mesurmentChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMesurments(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this. pressure = pressure;
        mesurmentChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
