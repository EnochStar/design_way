package observer_weather.observer;

/**
 * Package:observer_weather.observer
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class WeatherBorderFirst implements Observer {
    @Override
    public void update() {
        System.out.println("I'm first border");
    }
}
