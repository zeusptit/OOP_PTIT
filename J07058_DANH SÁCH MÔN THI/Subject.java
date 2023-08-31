public class Subject implements Comparable<Subject> {
    private String subjectID;
    private String subjectName;
    private String subjectContest;

    public Subject(String subjectID, String subjectName, String subjectContest) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.subjectContest = subjectContest;
    }

    @Override
    public String toString() {
        return subjectID + " " + subjectName + " " + subjectContest;
    }

    @Override
    public int compareTo(Subject o) {
        return this.subjectID.compareTo(o.subjectID);
    }
}
