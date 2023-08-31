public class Subject implements Comparable<Subject>{
    private String subjectID;
    private String subjectName;
    private int subjectCredit;
    private String theoryType;
    private String practiceType;

    public Subject(String subjectID, String subjectName, int subjectCredit, String theoryType, String practiceType) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.subjectCredit = subjectCredit;
        this.theoryType = theoryType;
        this.practiceType = practiceType;
    }

    public String getPracticeType() {
        return practiceType;
    }

    public boolean filter(String practiceType){
        return practiceType.equals("Truc tuyen") || practiceType.contains(".ptit.edu.vn");
    }
    @Override
    public String toString() {
        return subjectID + " " + subjectName + " " + subjectCredit + " " + theoryType + " " + practiceType;
    }

    @Override
    public int compareTo(Subject o) {
        return this.subjectID.compareTo(o.subjectID);
    }
}