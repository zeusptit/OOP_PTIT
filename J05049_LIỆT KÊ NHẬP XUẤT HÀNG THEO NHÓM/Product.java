
public class Product implements Comparable<Product>{
    private String productID;
    private long amountIn;
    private long amountOut;
    private long price;
    private long tax;

    public String getProductID() {
        return productID;
    }

    public Product(String productID, long amountIn) {
        this.productID = productID;
        this.amountIn = amountIn;
        if(productID.charAt(0) == 'A'){
            this.amountOut = (int) Math.round(amountIn * 0.6);
            if(productID.charAt(productID.length() - 1) == 'Y'){
                this.price = 110000;
                this.tax = 8;
            } else{
                this.price = 135000;
                this.tax = 11;
            }
        } else{
            this.amountOut = (long) Math.round(amountIn * 0.7);
            if(productID.charAt(productID.length() - 1) == 'Y'){
                this.price = 110000;
                this.tax = 17;
            } else{
                this.price = 135000;
                this.tax = 22;
            }
        }
    }
    public long getMoney(){
        return amountOut * price;
    }
    public long getTaxMoney(){
        return getMoney() * tax / 100;
    }

    @Override
    public String toString() {
        return productID + " " + amountIn + " " + amountOut + " " + price + " " + getMoney() + " " + getTaxMoney();
    }

    @Override
    public int compareTo(Product o) {
        return (int)(o.getTaxMoney() - getTaxMoney());
    }
}
