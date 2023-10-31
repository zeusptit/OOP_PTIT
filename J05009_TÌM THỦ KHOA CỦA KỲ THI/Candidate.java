public class Candidate implements Comparable<Candidate>{
    public static int count = 1;
    public int candidateId;
    public String candidateName;
    public String candidateDob;
    public double score_1, score_2, score_3;

    public Candidate(String candidateName, String candidateDob, double score_1, double score_2, double score_3) {
        this.candidateId = count++;
        this.candidateName = candidateName;
        this.candidateDob = candidateDob;
        this.score_1 = score_1;
        this.score_2 = score_2;
        this.score_3 = score_3;
    }
    public double totalScore(){
        return score_1 + score_2 + score_3;
    }

    @Override
    public String toString() {
        return candidateId + " " + candidateName + " " + candidateDob + " " + String.format("%.1f", totalScore());
    }

    @Override
    public int compareTo(Candidate o) {
        if(totalScore() < o.totalScore())
            return -1;
        else if(totalScore() > o.totalScore())
            return 1;
        return this.candidateId - o.candidateId;
    }
}