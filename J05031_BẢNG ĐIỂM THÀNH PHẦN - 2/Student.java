public class Student implements Comparable<Student>{
    private String studentId;
    private String studentName;
    private String studentClass;
    private double score_1, score_2, score_3;

    public Student(String studentId, String studentName, String studentClass, double score_1, double score_2, double score_3) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.score_1 = score_1;
        this.score_2 = score_2;
        this.score_3 = score_3;
    }

    @Override
    public String toString() {
        return studentId + " " + studentName + " " + studentClass + " " + String.format("%.1f %.1f %.1f", score_1, score_2, score_3);
    }

    @Override
    public int compareTo(Student o) {
        return this.studentName.compareTo(o.studentName);
    }
}
