import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Time implements Comparable<Time>{
    private String userName;
    private Date onlineStart;
    private Date onlineEnd;
    private long onlineTimeNumber;

    public Time(String userName, String onlineStart, String onlineEnd) throws ParseException {
        this.userName = userName;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.onlineStart = dateFormat.parse(onlineStart);
        this.onlineEnd = dateFormat.parse(onlineEnd);
        this.onlineTimeNumber = ChronoUnit.MINUTES.between(this.onlineStart.toInstant(), this.onlineEnd.toInstant());
    }

    @Override
    public String toString() {
        return userName + " " + onlineTimeNumber;
    }

    @Override
    public int compareTo(Time o) {
        if(this.onlineTimeNumber != o.onlineTimeNumber)
            return (int) (o.onlineTimeNumber - this.onlineTimeNumber);
        return this.userName.compareTo(o.userName);
    }
}
