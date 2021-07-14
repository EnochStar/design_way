package book_observer_weather.observer;

import book_observer_weather.subject.Subject;

/**
 * Package:book_observer_weather.observer
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class HeatIndexDisplay implements DisplayElement,Observer {

    private float temperature;
    private float humidity;
    private float heatIndex;

    private Subject weather;

    public HeatIndexDisplay(Subject weather) {
        this.weather = weather;
        weather.registerObserver(this);
    }

    private float getHeatIndex() {
        heatIndex = (float) (0.75 * humidity + 0.8 * temperature);
        return heatIndex;
    }

    @Override
    public void display() {
        System.out.println("heatInde is :" + heatIndex);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        heatIndex = getHeatIndex();
        display();
    }

    @Override
    public void update(Subject subject) {

    }
}
