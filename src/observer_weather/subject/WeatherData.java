package observer_weather.subject;

import observer_weather.WeatherStation;
import observer_weather.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Package:observer_weather.subject
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class WeatherData implements Subject {

    private List<Observer> observerList = new ArrayList<>();

    private WeatherStation weatherStation;

    private void getState() {
        System.out.println(weatherStation.getHumidity());
        System.out.println(weatherStation.getPressure());
        System.out.println(weatherStation.getTemplate());
    }

    public WeatherData(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public WeatherData(List<Observer> observerList, WeatherStation weatherStation) {
        this.observerList = observerList;
        this.weatherStation = weatherStation;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        if (observerList.isEmpty()) {
            System.out.println("暂无观察者");
            return;
        }
        for (Observer o : observerList) {
            getState();
            o.update();
        }
    }
}
