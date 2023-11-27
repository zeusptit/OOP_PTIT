import java.util.ArrayList;

public class Student implements Comparable<Student>{
    private String studentID;
    private String studentName;
    private String studentNP;
    private String studentGroup;

    public Student(String studentID, String studentName, String studentNP, String studentGroup) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentNP = studentNP;
        this.studentGroup = studentGroup;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentNP() {
        return studentNP;
    }

    public String getStudentGroup() {
        return studentGroup;
    }

    @Override
    public String toString() {
        return studentID + " " + studentName + " " + studentNP + " " + studentGroup;
    }

    @Override
    public int compareTo(Student o) {
        return studentID.compareTo(o.studentID);
    }
}
