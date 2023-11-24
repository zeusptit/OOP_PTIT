public class Student implements Comparable<Student>{
    public static int count = 1;
    private String studentID;
    private String studentName;
    private double studentGpa;
    private String studentRole;
    private int studentRank;

    public Student(String studentName, double studentGpa) {
        this.studentID = "HS" + String.format("%02d", count++);
        this.studentName = studentName;
        this.studentGpa = studentGpa;
        if(studentGpa >= 9)this.studentRole = "Gioi";
        else if(studentGpa >= 7)this.studentRole = "Kha";
        else if(studentGpa >= 5)this.studentRole = "Trung Binh";
        else this.studentRole = "Yeu";
    }

    public double getStudentGpa() {
        return studentGpa;
    }

    public void setStudentRank(int studentRank) {
        this.studentRank = studentRank;
    }

    @Override
    public String toString() {
        return studentID + " " + studentName + " " + String.format("%.1f", studentGpa) + " " + studentRole + " " + studentRank;
    }

    @Override
    public int compareTo(Student o) {
        if(studentGpa < o.studentGpa)
            return 1;
        return -1;
    }
}

