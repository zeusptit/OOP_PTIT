public class Student{
    private String studentId;
    private String studentName;
    private String studentClass;
    private String studentEmail;

    public Student(String studentId, String studentName, String studentClass, String studentEmail) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.studentEmail = studentEmail;
    }

    public String getStudentClass() {
        return studentClass;
    }

    @Override
    public String toString() {
        return studentId + " " + studentName + " " + studentClass + " " + studentEmail;
    }


}
