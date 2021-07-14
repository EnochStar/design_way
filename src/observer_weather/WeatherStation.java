package observer_weather;

/**
 * Package:observer_weather
 * Description:
 * 气象台
 * @author:鲍嘉鑫
 */
public class WeatherStation {
    private String template;
    private String humidity;
    private String pressure;
    void getWeather() {
        System.out.println("The weather is .....");
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }
}
