package observer_weather;

import observer_weather.observer.WeatherBorderFirst;
import observer_weather.observer.WeatherBorderSecond;
import observer_weather.subject.Subject;
import observer_weather.subject.WeatherData;

/**
 * Package:observer_weather
 * Description:
 * 了解观察者模式前写的
 * @author:鲍嘉鑫
 */
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.setHumidity("60");
        weatherStation.setTemplate("20摄氏度");
        weatherStation.setPressure("气压下降");

        Subject subject = new WeatherData(weatherStation);
        subject.notifyObserver();

        subject.registerObserver(new WeatherBorderFirst());
        subject.notifyObserver();

        subject.registerObserver(new WeatherBorderSecond());
        subject.notifyObserver();

        weatherStation.setTemplate("30摄氏度");
        subject.notifyObserver();
    }
}
