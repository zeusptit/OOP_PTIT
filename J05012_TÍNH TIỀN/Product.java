public class Product implements Comparable<Product>{
    private String productID, productName;
    private long amount, price, discount;

    public Product(String productID, String productName, long amount, long price, long discount) {
        this.productID = productID;
        this.productName = productName;
        this.amount = amount;
        this.price = price;
        this.discount = discount;
    }
    public long getBill(){
        return amount * price - discount;
    }

    @Override
    public String toString() {
        return productID + " " + productName + " " + amount + " " + price + " " + discount + " " + getBill() ;
    }

    @Override
    public int compareTo(Product o) {
        if(o.getBill() < getBill())
            return -1;
        return 1;
    }
}
