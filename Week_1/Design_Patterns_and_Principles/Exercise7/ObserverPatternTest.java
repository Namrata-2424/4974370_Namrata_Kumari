package Exercise7;

public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket("AAPL", 150.00);

        Observer mobileApp = new MobileApp("MobileApp");
        Observer webApp = new WebApp("WebApp");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Change stock price and notify observers
        System.out.println("Stock price updated to 155.00");
        stockMarket.setStockPrice(155.00);

        // Deregister mobile app and change stock price
        stockMarket.deregisterObserver(mobileApp);

        System.out.println("\nStock price updated to 160.00");
        stockMarket.setStockPrice(160.00);
    }
}
