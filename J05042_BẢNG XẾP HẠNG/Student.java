public class Student implements Comparable<Student>{
    private String studentName;
    private int acceptSubmission;
    private int submit;

    public Student(String studentName, int acceptSubmission, int submit) {
        this.studentName = studentName;
        this.acceptSubmission = acceptSubmission;
        this.submit = submit;
    }

    @Override
    public String toString() {
        return studentName + " " + acceptSubmission + " " + submit;
    }

    @Override
    public int compareTo(Student o) {
        if(acceptSubmission != o.acceptSubmission)
            return o.acceptSubmission - acceptSubmission;
        if(submit != o.submit)
            return submit - o.submit;
        return studentName.compareTo(o.studentName);
    }
}
