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

    public String getLecturerName() {
        return lecturerName;
    }

    @Override
    public String toString() {
        return courseID + " " + courseName + " " + groupID;
    }

    @Override
    public int compareTo(Course o) {
        if(!courseID.equals(o.courseID))
            return courseID.compareTo(o.courseID);
        return groupID.compareTo(o.groupID);
    }
}
