public class Product {
    public static int count = 1;
    private String productID;
    private String productName;
    private String unit;
    private long price;
    private long amount;

    public Product(String productName, String unit, int price, int amount) {
        this.productID = "MH" + String.format("%02d", count++);
        this.productName = productName;
        this.unit = unit;
        this.price = price;
        this.amount = amount;
    }
    long getTransportFee(){
        return (long) Math.ceil((float)(price * amount * 5 / 100));
    }
    long getFee(){
        return (long) Math.ceil((float)(price * amount) + getTransportFee());
    }
    long getBillMoney(){
        return (long) Math.ceil((getFee() * 1.0 + getFee() * 2.0 / 100));
    }

    @Override
    public String toString() {
        return productID + " " + productName + " " + unit + " " + getTransportFee() + " " + getFee() + " " + getBillMoney();
    }
}
