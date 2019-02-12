import java.util.ArrayList;

public class WeatherData implements Subject {
    // WeatherData is the "distributor" of the information

    // observers is an arrayList that contains all the registered observers
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        // The arrayList is instantiated when the constructor is called
        observers = new ArrayList();
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        // If it finds the observer, the index will be equal or higher than zero
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        // loop through the list and for each observer registered, run the method update (Observer class)
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        // This method call the notifyObservers method
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        // Call the measurementChanged method, which will call the notifyObservers method
        measurementsChanged();
    }

}
