public class Stock {
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;

    public Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;

    }

    public double getChangePercent() {
        double changePercent = (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
        return changePercent;

    }

    public void displayObject() {
        System.out.println("Symbol: " + symbol);
        System.out.println("Name: " + name);
        System.out.println("Previous Closing Price: " + previousClosingPrice);
        System.out.println("Current Price: " + currentPrice);
        System.out.println("Price Change: " + getChangePercent() + "%");

    }
}
