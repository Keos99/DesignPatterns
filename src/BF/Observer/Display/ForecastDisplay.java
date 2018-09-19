package BF.Observer.Display;

public class ForecastDisplay implements Display{
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("ForecastDisplay: " + temp + humidity + pressure);
    }
}
