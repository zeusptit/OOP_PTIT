import java.text.DecimalFormat;

public class Candidate implements Comparable<Candidate>{
    private String candidateID;
    private String candidateName;
    private Double mathScore, physicalScore, chemicalScore, priorityScore, score;
    private String mod;
    private int target;

    public Candidate(String candidateID, String candidateName, Double mathScore, Double physicalScore, Double chemicalScore) {
        this.candidateID = candidateID;
        StringBuilder sb = new StringBuilder("");
        String[] word = candidateName.split(" ");
        for(String x : word){
            if(!x.isEmpty()){
                x = x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase();
                sb.append(x).append(" ");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        this.candidateName = sb.toString();
        if(candidateID.charAt(2) == '1')
            priorityScore = 0.5;
        else if(candidateID.charAt(2) == '2')
            priorityScore = 1.0;
        else
            priorityScore = 2.5;
        this.mathScore = mathScore;
        this.physicalScore = physicalScore;
        this.chemicalScore = chemicalScore;
        this.score = this.mathScore * 2 + this.physicalScore + this.chemicalScore + priorityScore;
    }

    @Override
    public String toString() {
        return candidateID + " " + candidateName + " " + (new DecimalFormat().format(priorityScore)) + " " + (new DecimalFormat().format(score)) + " " + mod;
    }

    @Override
    public int compareTo(Candidate o) {
        if(score > o.score)
            return -1;
        else if(score < o.score)
            return 1;
        return candidateID.compareTo(o.candidateID);
    }

    public double getScore() {
        return score;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }
}