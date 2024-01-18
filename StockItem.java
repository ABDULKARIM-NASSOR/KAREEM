
/**
 * Write a description of class Stock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StockItem
{
 
   
    private int stockNumber;
    private String name;
    private double price;
    private int totalInStock;
    
    public StockItem(int stockNumber, String name, double price) {
        this.stockNumber = stockNumber;
        this.name = name;
        this.price = price;
        this.totalInStock = 0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    public void addToStock(int quantity) {
        totalInStock += quantity;
    }
    
    public double calculateTotalValue() {
        return price * totalInStock;
    }

    public int getStockNumber() {
        return stockNumber;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getTotalInStock() {
        return totalInStock;
    }

    
    public String toString() {
        return "StockNumber: " + stockNumber +
                ", Name: " + name +
                ", Price: " + price +
                ", TotalInStock: " + totalInStock;
    }

    public static void main(String[] args) {
        StockItem item1 = new StockItem(1, "Appliance1", 49.99);

        System.out.println("Initial Details: " + item1);

        item1.setPrice(59.99);
        item1.addToStock(10);

        System.out.println("Updated Details: " + item1);

        double totalValue = item1.calculateTotalValue();
        System.out.println("Total Value of Items in Stock: $" + totalValue);
    }
}
    