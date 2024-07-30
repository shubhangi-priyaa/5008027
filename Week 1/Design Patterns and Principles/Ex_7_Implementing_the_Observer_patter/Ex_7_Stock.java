//1. Define Subject Interface
public interface Ex_7_Stock {
    void registerObserver(Ex_7_Observer observer);
    void deregisterObserver(Ex_7_Observer observer);
    void notifyObservers();
}
