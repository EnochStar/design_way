package java_util_observer;

import java.util.Observable;

/**
 * Package:java_util_observer
 * Description:
 * 自带对观察者对增删 提醒  所以自身不需要维护观察者
 * 采用notifyObservers() 代表由观察者拉需要的数据
 * 采用notifyObservers(Object o) 表示将数据封装起来 全部发送给观察者
 * @author:鲍嘉鑫
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure) {
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
