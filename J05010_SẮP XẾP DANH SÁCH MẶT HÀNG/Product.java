public class Product implements Comparable<Product>{
    public static int count = 1;
    private int productId;
    private String productName;
    private String productRole;
    private double buyPrice, sellPrice;

    public Product(String productName, String productRole, double buyPrice, double sellPrice) {
        this.productId = count++;
        this.productName = productName;
        this.productRole = productRole;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }
    public double getProfit(){
        return sellPrice - buyPrice;
    }

    @Override
    public String toString() {
        return productId + " " + productName + " " + productRole + " " + String.format("%.2f", getProfit());
    }

    @Override
    public int compareTo(Product o) {
        if(this.getProfit() > o.getProfit())
            return -1;
        else if(this.getProfit() < o.getProfit())
            return 1;
        return 0;
    }
}

