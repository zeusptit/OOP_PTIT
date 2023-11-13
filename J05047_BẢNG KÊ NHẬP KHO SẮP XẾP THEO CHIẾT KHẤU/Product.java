import java.util.TreeMap;

public class Product implements Comparable<Product>{

    private String productID;
    private String productName;
    private long amount;
    private long price;

    public Product(String productName, long amount, long price) {
        this.productName = productName;
        this.amount = amount;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }
    public long getDiscount(){
        int percent = 0;
        if(amount > 10)percent = 5;
        else if(amount >= 8)percent = 2;
        else if(amount >=5)percent = 1;
        return price * amount * percent / 100;
    }
    public long getBill(){
        return price * amount - getDiscount();
    }

    @Override
    public String toString() {
        return productID + " " + productName + " " + getDiscount() + " " + getBill();
    }

    @Override
    public int compareTo(Product o) {
        return (int) (o.getDiscount() - getDiscount());
    }
}
