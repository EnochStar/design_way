package observer_weather.subject;

import observer_weather.WeatherStation;
import observer_weather.observer.Observer;

/**
 * Package:observer_weather
 * Description:
 *
 * @author:鲍嘉鑫
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
