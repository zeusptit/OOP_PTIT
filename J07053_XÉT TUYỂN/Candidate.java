import java.text.DecimalFormat;

public class Candidate{
    public static int count = 1;
    private String candidateID;
    private String candidateName;
    private String dob;
    private int age;
    private double theoryScore;
    private double practiceScore;
    private double bonusScore;
    private int finalScore;
    private String mod;

    public String stdDOB(String dob){
        StringBuilder sb = new StringBuilder(dob);
        if(sb.charAt(1) == '/')sb.insert(0, '0');
        if(sb.charAt(4) == '/')sb.insert(3, '0');
        return sb.toString();
    }
    public String stdName(String name){
        StringBuilder sb = new StringBuilder("");
        String[] word = name.split(" ");
        for(String x : word){
            if(!x.isEmpty()){
                x = x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase();
                sb.append(x).append(" ");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
    public Candidate(String candidateName, String dob, double theoryScore, double practiceScore) {
        this.candidateID = "PH" + String.format("%02d", count++);
        this.candidateName = stdName(candidateName);
        this.dob = stdDOB(dob);
        this.age = 2021 - Integer.parseInt(this.dob.substring(6));
        this.theoryScore = theoryScore;
        this.practiceScore = practiceScore;
        if(theoryScore >= 8 && practiceScore >= 8)this.bonusScore = 1;
        else if(theoryScore >= 7.5 && practiceScore >= 7.5)this.bonusScore = 0.5;
        else this.bonusScore = 0;
        this.finalScore = (int) Math.round((this.theoryScore + this.practiceScore) / 2 + this.bonusScore);
        if(this.finalScore >= 10)this.finalScore = 10;
        if(this.finalScore < 5)mod = "Truot";
        else if(this.finalScore < 7)mod = "Trung binh";
        else if(this.finalScore == 7)mod = "Kha";
        else if(this.finalScore == 8)mod = "Gioi";
        else mod = "Xuat sac";
    }

    @Override
    public String toString() {
        return candidateID + " " + candidateName + " " + age + " " + finalScore + " " + mod;
    }

}