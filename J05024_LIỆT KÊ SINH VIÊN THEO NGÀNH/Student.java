public class Student{
    private String studentId, studentName, studentClass, studentEmail;

    public Student(String studentId, String studentName, String studentClass, String studentEmail) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.studentEmail = studentEmail;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    @Override
    public String toString(){
        return this.studentId + " " + this.studentName + " " + this.studentClass + " " + this.studentEmail;
    }
}
