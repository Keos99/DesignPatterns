package BF.Observer.Display;

public class CurrentConditionsDisplay implements Display {
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("CurrentConditionsDisplay: " + temp + humidity + pressure);
    }
}
