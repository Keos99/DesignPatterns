package BF.Observer;

import BF.Observer.Display.CurrentConditionsDisplay;
import BF.Observer.Display.ForecastDisplay;
import BF.Observer.Display.StatisticsDisplay;

public class WheatherData {

    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
    ForecastDisplay forecastDisplay = new ForecastDisplay();

    public float getTemperature() {
        return (float) 24;
    }

    public float getHumidity() {
        return (float) 76;
    }

    public float getPressure() {
        return (float) 770;
    }

    public void mesurmrntsChanged() {

        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionsDisplay.update(temp,humidity,pressure);
        statisticsDisplay.update(temp,humidity,pressure);
        forecastDisplay.update(temp,humidity,pressure);
    }
}
