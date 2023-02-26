package NoLessonTests.HFDP2E.Chapter2.WeatherStation;

public class WeatherData {
//    private float temp;
//    private float humidity;
//    private float pressure;

    public float getTemperature() {
        return 1;
    }

    public float getHumidity() {
        return 1;
    }

    public float getPressure() {
        return 1;
    }

    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }
}
