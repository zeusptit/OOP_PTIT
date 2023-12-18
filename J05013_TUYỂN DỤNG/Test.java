public class Test implements Comparable<Test>{
    private static int count = 1;
    private String candidateID, candidateName;
    private double theoryTest, practiceTest, avg;
    private String testMode;

    public Test(String candidateName, double theoryTest, double practiceTest) {
        this.candidateID = "TS" + String.format("%02d", count++);
        this.candidateName = candidateName;
        this.theoryTest = theoryTest;
        this.practiceTest = practiceTest;
        if(this.theoryTest > 10)this.theoryTest /= 10;
        if(this.practiceTest > 10)this.practiceTest /= 10;
        this.avg = (this.theoryTest + this.practiceTest) / 2;
        if(this.avg > 9.5)testMode = "XUAT SAC";
        else if(this.avg >= 8)testMode = "DAT";
        else if(this.avg > 5)testMode = "CAN NHAC";
        else testMode = "TRUOT";
    }

    @Override
    public String toString() {
        return candidateID + " " + candidateName + " " + String.format("%.2f", avg) + " " + testMode;
    }

    @Override
    public int compareTo(Test o) {
        if(avg < o.avg)
            return 1;
        return -1;
    }
}
