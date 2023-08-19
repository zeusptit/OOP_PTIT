import java.util.Date;

public class Hotel implements Comparable<Hotel>{
    private static int count = 1;
    private String customerId;
    private String customerName;
    private String roomID;
    private Date inDay;
    private Date outDay;
    private long stayDay;

    public Hotel(String customerName, String roomID, Date inDay, Date outDay) {
        this.customerId = "KH" + String.format("%02d", count++);
        this.customerName = customerName;
        this.roomID = roomID;
        this.inDay = inDay;
        this.outDay = outDay;
        this.stayDay = (outDay.getTime() - inDay.getTime()) / (1000L * 60 * 60 * 24);
    }

    @Override
    public String toString() {
        return customerId + " " + customerName + " " + roomID + " " + stayDay;
    }

    @Override
    public int compareTo(Hotel o) {
        return (int)(o.stayDay - this.stayDay);
    }
}