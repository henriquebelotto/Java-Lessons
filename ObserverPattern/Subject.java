public interface Subject {
    // Every Subject must implement this interface
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();

}