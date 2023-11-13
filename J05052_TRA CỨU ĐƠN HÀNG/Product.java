public class Product {
    private String productName;
    private String productID;
    private int price;
    private int amount;
    private int discount;

    public Product(String productName, String productID, int price, int amount) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.amount = amount;
        if(this.productID.charAt(productID.length() - 1) == '1')this.discount = 5;
        else this.discount = 3;
    }
    public String getOrder(){
        return productID.substring(1, 4);
    }
    public int getDiscount(){
        return (int) Math.ceil(price * amount * discount / 10);
    }

    @Override
    public String toString() {
        return productName + " " + productID + " " + getOrder() + " " + getDiscount() + " " + (price * amount - getDiscount());
    }
}
