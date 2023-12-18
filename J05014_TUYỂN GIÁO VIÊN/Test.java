public class Test implements Comparable<Test>{
    private static int count = 1;
    private String candidateID, candidateName, candidateCode, specialize;
    private double officeTest, specializeTest, sum, priorityScore;
    private String testMode;

    public Test(String candidateName, String candidateCode, double officeTest, double specializeTest) {
        this.candidateID = "GV" + String.format("%02d", count++);
        this.candidateName = candidateName;
        this.candidateCode = candidateCode;
        this.officeTest = officeTest * 2;
        this.specializeTest = specializeTest;
        if(candidateCode.charAt(0) == 'A')this.specialize = "TOAN";
        else if(candidateCode.charAt(0) == 'B') this.specialize = "LY";
        else this.specialize = "HOA";
        if(candidateCode.charAt(1) == '1')this.priorityScore = 2.0;
        else if(candidateCode.charAt(1) == '2')this.priorityScore = 1.5;
        else if(candidateCode.charAt(1) == '3')this.priorityScore = 1.0;
        else this.priorityScore = 0.0;
        this.sum = this.officeTest + this.specializeTest + this.priorityScore;
        if(this.sum >= 18)this.testMode = "TRUNG TUYEN";
        else this.testMode = "LOAI";
    }

    @Override
    public String toString() {
        return candidateID + " " + candidateName + " " + specialize + " " + String.format("%.1f", sum) + " " + testMode;
    }

    @Override
    public int compareTo(Test o) {
        if(sum < o.sum)
            return 1;
        else if(sum > o.sum)
            return -1;
        return candidateID.compareTo(o.candidateID);
    }
}
