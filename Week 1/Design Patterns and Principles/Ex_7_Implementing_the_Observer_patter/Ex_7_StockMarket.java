//2. Implement Concrete Subject
import java.util.ArrayList;
import java.util.List;

public class Ex_7_StockMarket implements Ex_7_Stock {
    private List<Ex_7_Observer> observers = new ArrayList<>();
    private double stockPrice;

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        notifyObservers();
    }

    @Override
    public void registerObserver(Ex_7_Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregisterObserver(Ex_7_Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Ex_7_Observer observer : observers) {
            observer.update(stockPrice);
        }
    }
}
