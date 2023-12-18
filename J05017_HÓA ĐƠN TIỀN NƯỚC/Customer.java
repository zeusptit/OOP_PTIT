public class Customer implements Comparable<Customer>{
    public static int count = 1;
    private String customerID, customerName;
    private long start, end, price, total, fee, finalBill;

    public Customer(String customerName, int start, int end) {
        this.customerID = "KH" + String.format("%02d", count++);
        this.customerName = customerName;
        this.start = start;
        this.end = end;
        this.total = this.end - this.start;
        this.finalBill = Math.min(50, this.total) * 100;
        this.fee = Math.round(this.finalBill * 0.02);
        if(this.total > 50){
            this.finalBill += Math.min(50, this.total - 50) * 150;
            this.fee = Math.round(this.finalBill * 0.03);
        }
        if(this.total > 100){
            this.finalBill += (this.total - 100) * 200;
            this.fee = Math.round(this.finalBill * 0.05);
        }
        this.finalBill += this.fee;
    }

    @Override
    public String toString() {
        return customerID + " " + customerName + " " + finalBill;
    }

    @Override
    public int compareTo(Customer o) {
        if(o.finalBill < finalBill)
            return -1;
        return 1;
    }
}
