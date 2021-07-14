package book_observer_weather.observer;

import book_observer_weather.subject.Subject;
import book_observer_weather.subject.WeatherData;

/**
 * Package:book_observer_weather.observer
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;

    private Subject weatherData;

    public CurrentConditionsDisplay() {

    }

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}');
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof WeatherData) {
            this.temperature = ((WeatherData) subject).getTemperature();
            this.humidity = ((WeatherData) subject).getHumidity();
            this.pressure = ((WeatherData) subject).getPressure();
            display();
        }
    }


}
