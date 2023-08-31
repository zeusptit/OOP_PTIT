public class Student implements Comparable<Student>{
    public static int count = 1;
    private String studentID;
    private String studentName;
    private int score_1, score_2, score_3;
    private double finalScore;
    private String mod;

    public double getFinalScore() {
        return finalScore;
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

    public Student(String studentName, int score_1, int score_2, int score_3) {
        this.studentID = "SV" + String.format("%02d", count++);
        this.studentName = stdName(studentName);
        this.score_1 = score_1;
        this.score_2 = score_2;
        this.score_3 = score_3;
        this.finalScore = (double)score_1 * 0.25 + (double) score_2 * 0.35 + (double) score_3 * 0.4;
        if(this.finalScore >= 8)this.mod = "GIOI";
        else if(this.finalScore >= 6.5) this.mod = "KHA";
        else if(this.finalScore >= 5) this.mod = "TRUNG BINH";
        else this.mod = "KEM";
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f %s", studentID, studentName, finalScore, mod);
    }

    @Override
    public int compareTo(Student o) {
        if(o.finalScore < this.finalScore)
            return -1;
        else if(o.finalScore > this.finalScore)
            return 1;
        return 0;
    }
}
