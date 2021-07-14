package book_observer_weather.subject;


import book_observer_weather.observer.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Package:book_observer_weather.subject
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temperature,humidity,pressure);
        }
    }

    public void notifyObserver(Subject o) {
        for (Observer observer : observers) {
            observer.update(o);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void changed(float temperature,float humidity,float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
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
