public class Product implements Comparable<Product>{
    public static int count = 1;
    private String productID;
    private String productName;
    private String productRole;
    private Double buy, sell;

    public Product(String productName, String productRole, Double buy, Double sell) {
        this.productID = "MH" + String.format("%02d", count++);
        this.productName = productName;
        this.productRole = productRole;
        this.buy = buy;
        this.sell = sell;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.2f", productID, productName, productRole, sell - buy);
    }

    @Override
    public int compareTo(Product o) {
        return (int) ((o.sell - o.buy) - (this.sell - this.buy));
    }
}
