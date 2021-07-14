package book_observer_weather.observer;

import book_observer_weather.subject.Subject;

/**
 * Package:book_observer_weather.observer
 * Description:
 *
 * @author:鲍嘉鑫
 */
public interface Observer {
    void update(float temp,float humidity,float pressure);
    void update(Subject subject);
}
