public class Student implements Comparable<Student>{
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

    @Override
    public String toString() {
        return studentId + " " + studentName + " " + studentClass + " " + studentEmail;
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}

