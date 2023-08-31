public class Contest implements Comparable<Contest> {
    public static int count = 1;
    private String id;
    private String day;
    private String time;
    private String room;

    public Contest(String day, String time, String room) {
        this.id = "C" + String.format("%03d", count++);
        this.day = day;
        this.time = time;
        this.room = room;
    }

    @Override
    public String toString() {
        return id + " " + day + " " + time + " " + room;
    }

    @Override
    public int compareTo(Contest o) {
        if(this.day.compareTo(o.day) == 0){
            return this.time.compareTo(o.time);
        }
        return this.day.compareTo(o.day);
    }
}
