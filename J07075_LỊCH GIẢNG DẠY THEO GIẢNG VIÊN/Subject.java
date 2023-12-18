public class Subject {
    private String subjectID, subjectName;
    private int creditNumber;

    public Subject(String subjectID, String subjectName, int creditNumber) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.creditNumber = creditNumber;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getCreditNumber() {
        return creditNumber;
    }
}
