import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Athlete implements Comparable<Athlete>{
    private String athleteID, athleteName;
    private String location, time;
    private Date date;
    private double timeAchievement, speed;

    public String processName(String s){
        StringBuilder sb = new StringBuilder();
        String[] words = s.trim().split("\\s+");
        for(String x : words){
            sb.append(x.substring(0, 1).toUpperCase());
        }
        return sb.toString();
    }
    public Athlete(String athleteName, String location, String time) throws ParseException {
        this.athleteID = processName(location) + processName(athleteName);
        this.athleteName = athleteName;
        this.location = location;
        this.time = time;
        SimpleDateFormat format = new SimpleDateFormat("h:mm");
        this.date = format.parse(time);
        Date startTime = format.parse("6:00");
        this.timeAchievement =   ((double)(date.getTime() - (double)startTime.getTime()) / 1000 / 60 / 60);
    }
    public double getAchievement(){
        return 120 / timeAchievement;
    }

    @Override
    public String toString() {
        return athleteID + " " + athleteName + " " + location + " " + Math.round(getAchievement()) + " " + "Km/h";
    }

    @Override
    public int compareTo(Athlete o) {
        if (o.getAchievement() > getAchievement())
            return 1;
        return -1;
    }
}
