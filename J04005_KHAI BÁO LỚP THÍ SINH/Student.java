public class Student {
    private String name, dob;
    private Double score_1, score_2, score_3;

    public Student(String name, String dob, Double score_1, Double score_2, Double score_3) {
        this.name = name;
        this.dob = dob;
        this.score_1 = score_1;
        this.score_2 = score_2;
        this.score_3 = score_3;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f", name, dob, score_1 + score_2 + score_3);
    }
}
