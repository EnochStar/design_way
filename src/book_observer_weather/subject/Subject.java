package book_observer_weather.subject;


import book_observer_weather.observer.Observer;

import java.util.Objects;

/**
 * Package:book_observer_weather
 * Description:
 *
 * @author:鲍嘉鑫
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();


    /**
     * 采用拉的方式获取数据 即由观察者主动获取想要的数据
     * @param o
     */
    void notifyObserver(Subject o);
}
