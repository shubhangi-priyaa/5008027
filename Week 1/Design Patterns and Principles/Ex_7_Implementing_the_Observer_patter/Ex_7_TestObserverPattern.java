public class Ex_7_TestObserverPattern {
    public static void main(String[] args) {
        Ex_7_StockMarket stockMarket = new Ex_7_StockMarket();

        Ex_7_MobileApp mobileApp = new Ex_7_MobileApp("StockMobileApp");
        Ex_7_WebApp webApp = new Ex_7_WebApp("StockWebApp");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        System.out.println("Updating stock price to $150.00");
        stockMarket.setStockPrice(150.00);

        System.out.println("\nUpdating stock price to $200.00");
        stockMarket.setStockPrice(200.00);
    }
}
