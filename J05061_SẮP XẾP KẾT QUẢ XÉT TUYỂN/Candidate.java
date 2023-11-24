
import java.text.DecimalFormat;

public class Candidate implements Comparable<Candidate>{
    public static int count = 1;
    private String candidateID;
    private String candidateName;
    private String candidateDOB;
    private double theoryScore, practiceScore;
    private double bonusScore, finalScore;
    private Long age;
    private String mod;

    public Candidate(String candidateName, String candidateDOB, double theoryScore, double practiceScore) {
        this.candidateID = "PH" + String.format("%02d", count++);
        this.candidateName = candidateName;
        this.candidateDOB = candidateDOB;
        this.age = 2021 - Long.parseLong(candidateDOB.split("/")[2]);
        this.theoryScore = theoryScore;
        this.practiceScore = practiceScore;
        if(theoryScore >= 8 && practiceScore >= 8)this.bonusScore = 1;
        else if(theoryScore >= 7.5 && practiceScore >= 7.5)this.bonusScore = 0.5;
        this.finalScore = Math.min(10, (int)(Math.round((this.theoryScore + this.practiceScore) / 2 + this.bonusScore)));
        if(finalScore >= 9)mod = "Xuat sac";
        else if(finalScore >= 8)mod = "Gioi";
        else if(finalScore >= 7)mod = "Kha";
        else if(finalScore >= 5)mod = "Trung binh";
        else mod = "Truot";
    }

    @Override
    public String toString() {
        return candidateID + " " + candidateName + " " + age + " " + (new DecimalFormat().format(finalScore)) + " " + mod;
    }

    @Override
    public int compareTo(Candidate o) {
        if(finalScore > o.finalScore)
            return -1;
        if(finalScore < o.finalScore)
            return 1;
        return candidateID.compareTo(o.candidateID);
    }
}