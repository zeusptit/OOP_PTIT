public class Trade extends Product{
    private int inValue;
    private int inAmount;
    private int outValue;
    private int outAmount;
    private int price;

    public Trade(String productID, String productName, String productRole, int inAmount, int price, int outAmount) {
        super(productID, productName, productRole);
        this.inAmount = inAmount;
        this.price = price;
        this.outAmount = outAmount;
        this.inValue = this.inAmount * this.price;
        this.outValue = this.outAmount * this.price * (100 + profit(productRole)) / 100;
    }
    public int profit(String role){
        if(role.equals("A"))return 8;
        else if(role.equals("B"))return 5;
        return 2;
    }

    @Override
    public String toString() {
        return getProductID() + " " + getProductName() + " " + inValue + " " + outValue;
    }
}
