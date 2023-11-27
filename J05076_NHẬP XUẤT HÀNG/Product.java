public class Product {
    private String productID;
    private String productName;
    private String productRole;

    public Product(String productID, String productName, String productRole) {
        this.productID = productID;
        this.productName = productName;
        this.productRole = productRole;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductRole() {
        return productRole;
    }
}
