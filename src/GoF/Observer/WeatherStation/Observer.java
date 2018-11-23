package GoF.Observer.WeatherStation;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
