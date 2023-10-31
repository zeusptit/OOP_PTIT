public class Student {
    public static int count = 1;
    private String studentID;
    private String studentName;
    private String studentClass;
    private String studentDob;
    private Double studentGpa;

    public Student(String studentName, String studentClass, String studentDob, Double studentGpa) {
        this.studentID = "B20DCCN" + String.format("%03d", count++);
        this.studentName = studentName;
        this.studentClass = studentClass;
        StringBuilder sb = new StringBuilder(studentDob);
        if(sb.charAt(1) == '/')sb.insert(0, "0");
        if(sb.charAt(4) == '/')sb.insert(3, "0");
        this.studentDob = sb.toString();
        this.studentGpa = studentGpa;
    }

    @Override
    public String toString() {
        return studentID + " " + studentName + " " + studentClass + " " + studentDob + " " + String.format("%.2f", studentGpa);
    }
}
