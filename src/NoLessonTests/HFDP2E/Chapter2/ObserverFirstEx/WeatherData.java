package NoLessonTests.HFDP2E.Chapter2.ObserverFirstEx;

public class WeatherData implements Subject{
    @Override
    public void registerObserver() {

    }

    @Override
    public void removeObserver() {

    }

    @Override
    public void notifyObservers() {

    }

    int getTemperature() {
        return 1;
    }

    int getHumidity() {
        return 1;
    }

    int getPressure() {
        return 1;
    }

    int measurementsChanged() {
        return 1;
    }
}
