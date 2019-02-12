public interface Observer {
    // Every Observer must implement this interface
    public void update(float temp, float humidity, float pressure);
}