public class Course implements Comparable<Course>{
    private String courseID;
    private String courseName;
    private String groupID;
    private String lecturerName;

    public Course(String courseID, String courseName, String groupID, String lecturerName) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.groupID = groupID;
        this.lecturerName = lecturerName;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return groupID + " " + lecturerName;
    }

    @Override
    public int compareTo(Course o) {
        return groupID.compareTo(o.groupID);
    }
}
