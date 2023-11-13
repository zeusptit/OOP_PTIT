public class Customer implements Comparable<Customer>{
    public static int count = 1;
    private String customerID;
    private String roleID;
    private int oldIndex;
    private int newIndex;
    private int coefficient;
    private int invoice;
    private int additional;

    public Customer(String roleID, int oldIndex, int newIndex) {
        this.customerID = "KH" + String.format("%02d", count++);
        this.roleID = roleID;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
        if(roleID.equals("KD"))this.coefficient = 3;
        else if(roleID.equals("NN"))this.coefficient = 5;
        else if(roleID.equals("TT"))this.coefficient = 4;
        else this.coefficient = 2;
        this.invoice = (newIndex - oldIndex) * this.coefficient * 550;
        if(newIndex - oldIndex > 100)this.additional = this.invoice;
        else if(newIndex - oldIndex >= 50)this.additional = (int) Math.ceil(this.invoice * 0.35);
        else this.additional = 0;
    }
    public long getTotal(){
        return additional + invoice;
    }

    @Override
    public String toString() {
        return customerID + " " + coefficient + " " + invoice + " " + additional + " " + getTotal();
    }

    @Override
    public int compareTo(Customer o) {
        return (int)(o.getTotal() - getTotal());
    }
}
