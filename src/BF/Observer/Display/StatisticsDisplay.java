package BF.Observer.Display;

public class StatisticsDisplay implements Display {
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("StatisticsDisplay: " + temp + humidity + pressure);
    }
}
