public class Product implements Comparable<Product>{
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
        return (long) Math.round(price * amount * 0.05);
    }
    long getFee(){
        return (long) Math.round(price * amount) + getTransportFee();
    }
    long getBillMoney(){
        long temp = (getFee() + Math.round(0.02 * getFee())) / amount;
        return ((temp + 99) / 100) * 100;
    }

    @Override
    public String toString() {
        return productID + " " + productName + " " + unit + " " + getTransportFee() + " " + getFee() + " " + getBillMoney();
    }

    @Override
    public int compareTo(Product o) {
        if(getBillMoney() < o.getBillMoney())
            return 1;
        return -1;
    }
}
