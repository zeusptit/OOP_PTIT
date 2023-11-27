public class Student {
    private String studentID;
    private String studentName;
    private String studentClass;
    private int attendanceGrade;
    private String studentMode;

    public Student(String studentID, String studentName, String studentClass) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        if(attendanceGrade <= 0)
            return studentID + " " + studentName + " " + studentClass + " " + "0" + " " + "KDDK";
        else
            return studentID + " " + studentName + " " + studentClass + " " + attendanceGrade;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setAttendanceGrade(int attendanceGrade) {
        this.attendanceGrade = attendanceGrade;
    }
}
