public class Student implements Comparable<Student>{
    public static int count = 1;
    private String studentId;
    private String studentName;
    private String studentRole;

    private double mathScore, literatureScore, englishScore, physicalScore, chemicalScore, biologyScore, historyScore, geographyScore, civicEduScore, technologyScore;

    public Student(String studentName, double mathScore, double literatureScore, double englishScore, double physicalScore, double chemicalScore, double biologyScore, double historyScore, double geographyScore, double civicEduScore, double technologyScore) {
        this.studentId = "HS" + String.format("%02d", count++);
        this.studentName = studentName;
        this.mathScore = mathScore;
        this.literatureScore = literatureScore;
        this.englishScore = englishScore;
        this.physicalScore = physicalScore;
        this.chemicalScore = chemicalScore;
        this.biologyScore = biologyScore;
        this.historyScore = historyScore;
        this.geographyScore = geographyScore;
        this.civicEduScore = civicEduScore;
        this.technologyScore = technologyScore;
    }

    public double getAverage(){
        double res =  (mathScore * 2 + literatureScore * 2 + englishScore + physicalScore + chemicalScore + biologyScore + historyScore + geographyScore + civicEduScore + technologyScore) / 12;
        res = Math.round(res * 10f) / 10f;
        return res;
    }

    public void setStudentRole() {
        double average = getAverage();
        if(average >= 9) this.studentRole = "XUAT SAC";
        else if(average >= 8) this.studentRole = "GIOI";
        else if(average >= 7) this.studentRole = "KHA";
        else if(average >= 5) this.studentRole = "TB";
        else this.studentRole = "YEU";
    }

    @Override
    public String toString() {
        return studentId + " " + studentName + " " + String.format("%.1f ", getAverage()) + studentRole;
    }

    @Override
    public int compareTo(Student o) {
        if(getAverage() < o.getAverage())
            return 1;
        else if(getAverage() > o.getAverage())
            return -1;
        return this.studentId.compareTo(o.studentId);
    }
}
