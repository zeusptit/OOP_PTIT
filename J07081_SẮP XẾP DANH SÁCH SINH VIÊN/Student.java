public class Student implements Comparable<Student>{
    private String studentID;
    private String studentName;
    private String studentPhoneNumber;
    private String studentEmail;
    private String studentFinalName;

    public Student(String studentID, String studentName, String studentPhoneNumber, String studentEmail) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentPhoneNumber = studentPhoneNumber;
        this.studentEmail = studentEmail;
        String[] word = studentName.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String x : word){
            sb = new StringBuilder(x);
        }
        this.studentFinalName = sb.toString();
    }

    @Override
    public String toString() {
        return studentID + " " + studentName + " " + studentPhoneNumber + " " + studentEmail;
    }

    @Override
    public int compareTo(Student o) {
        if(!this.studentFinalName.equals(o.studentFinalName))
            return this.studentFinalName.compareTo(o.studentFinalName);
        if(!this.studentName.equals(o.studentName))
            return this.studentName.compareTo(o.studentName);
        return this.studentID.compareTo(o.studentID);
    }
}
