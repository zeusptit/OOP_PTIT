import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Customer implements Comparable<Customer>{
    public static int count = 1;
    private String customerID;
    private String customerName;
    private String customerRoom;
    private Date dayIn;
    private Date dayOut;
    private long dayStay;
    private long fee;
    private long bill;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public String stdName(String name){
        StringBuilder sb = new StringBuilder("");
        String[] word = name.split(" ");
        for(String x : word){
            if(!x.isEmpty()){
                x = x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase();
                sb.append(x).append(" ");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
    public Customer(String customerName, String customerRoom, String dayIn, String dayOut, long bill) throws ParseException {
        this.customerID = "KH" + String.format("%02d", count++);
        this.customerName = customerName;
        this.customerRoom = customerRoom;
        this.dayIn = sdf.parse(dayIn);
        this.dayOut = sdf.parse(dayOut);
        this.dayStay = ChronoUnit.DAYS.between(this.dayIn.toInstant(), this.dayOut.toInstant()) + 1;
        switch (customerRoom.charAt(0))
        {
            case '1':
                fee = 25;
                break;
            case '2':
                fee = 34;
                break;
            case '3':
                fee = 50;
                break;
            default:
                fee = 80;
        }
        this.bill = bill + dayStay * fee;
    }

    @Override
    public String toString() {
        return customerID + " " + stdName(customerName) + " " + customerRoom + " " + dayStay + " " + bill;
    }

    @Override
    public int compareTo(Customer o) {
        return (int) (o.bill - this.bill);
    }
}
