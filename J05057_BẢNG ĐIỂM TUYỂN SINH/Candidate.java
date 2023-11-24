import java.text.DecimalFormat;

public class Candidate {
    private String candidateID;
    private String candidateName;
    private double math, physical, chemical;
    private double priorityScore, finalScore;
    private String mod;

    public Candidate(String candidateID, String candidateName, double math, double physical, double chemical) {
        this.candidateID = candidateID;
        this.candidateName = candidateName;
        this.math = math;
        this.physical = physical;
        this.chemical = chemical;
        if(this.candidateID.charAt(2) == '1')
            this.priorityScore = 0.5;
        else if(this.candidateID.charAt(2) == '2')
            this.priorityScore = 1.0;
        else this.priorityScore = 2.5;
        this.finalScore = this.math * 2 + this.physical + this.chemical;
        if(this.finalScore + this.priorityScore >= 24)this.mod = "TRUNG TUYEN";
        else this.mod = "TRUOT";
    }

    @Override
    public String toString() {
        return candidateID + " " + candidateName + " " + (new DecimalFormat().format(priorityScore)) + " " + (new DecimalFormat().format(finalScore)) + " " + mod;
    }
}