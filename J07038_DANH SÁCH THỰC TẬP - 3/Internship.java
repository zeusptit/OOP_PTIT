public class Internship extends Student implements Comparable<Internship>{
    private String companyID, companyName;
    private int avNumber;

    public Internship(String studentID, String studentName, String studentClass, String studentEmail, String companyID, String companyName, int avNumber) {
        super(studentID, studentName, studentClass, studentEmail);
        this.companyID = companyID;
        this.companyName = companyName;
        this.avNumber = avNumber;
    }

    public String getCompanyID() {
        return companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getAvNumber() {
        return avNumber;
    }

    @Override
    public String toString() {
        return getStudentID() + " " + getStudentName() + " " + getStudentClass();
    }

    @Override
    public int compareTo(Internship o) {
        return getStudentID().compareTo(o.getStudentID());
    }
}
