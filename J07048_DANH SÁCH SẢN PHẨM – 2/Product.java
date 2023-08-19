    import java.util.Objects;

public class Product implements Comparable<Product>{
    private String productID;
    private String productName;
    private String productCost;
    private String productPeriod;

    public Product(String productID, String productName, String productCost, String productPeriod) {
        this.productID = productID;
        this.productName = productName;
        this.productCost = productCost;
        this.productPeriod = productPeriod;
    }

    @Override
    public String toString() {
        return productID + " " + productName + " " + productCost + " " + productPeriod;
    }

    @Override
    public int compareTo(Product o) {
        if(!Objects.equals(this.productCost, o.productCost)){
            return Integer.parseInt(o.productCost) - Integer.parseInt(this.productCost);
        }else {
            return this.productID.compareTo(o.productID);
        }
    }
}

