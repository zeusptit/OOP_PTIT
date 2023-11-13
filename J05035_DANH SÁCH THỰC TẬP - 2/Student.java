public class Student implements Comparable<Student>{
    public static int count = 1;
    private int order;
    private String studentID;
    private String studentName;
    private String studentClass;
    private String studentEmail;
    private String Company;

    public Student(String studentID, String studentName, String studentClass, String studentEmail, String Company) {
        this.order = count++;
        this.studentID = studentID.trim();
        this.studentName = studentName.trim();
        this.studentClass = studentClass.trim();
        this.studentEmail = studentEmail;
        this.Company = Company;
    }

    public String getCompany() {
        return Company;
    }

    @Override
    public int compareTo(Student o) {
        return studentID.compareTo(o.studentID);
    }

    @Override
    public String toString() {
        return order + " " + studentID + " " + studentName + " " + studentClass + " " + studentEmail + " " + Company;
    }
}
