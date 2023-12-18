public class Course extends Subject implements Comparable<Course>{
    public static int count = 1;

    private String groupID, day, session, teacherName, room;

    public Course(String subjectID, String subjectName, int creditNumber,String day, String session, String teacherName, String room) {
        super(subjectID, subjectName, creditNumber);
        this.groupID = "HP" + String.format("%03d", count++);
        this.day = day;
        this.session = session;
        this.teacherName = teacherName;
        this.room = room;
    }

    public static int getCount() {
        return count;
    }

    public String getGroupID() {
        return groupID;
    }

    public String getDay() {
        return day;
    }

    public String getSession() {
        return session;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getRoom() {
        return room;
    }

    @Override
    public String toString() {
        return groupID + " " + getSubjectName() + " " + day + " " + session + " " + room;
    }

    @Override
    public int compareTo(Course o) {
        if(!day.equals(o.day))
            return day.compareTo(o.day);
        if(!session.equals(o.session))
            return session.compareTo(o.session);
        return teacherName.compareTo(o.teacherName);
    }
}
