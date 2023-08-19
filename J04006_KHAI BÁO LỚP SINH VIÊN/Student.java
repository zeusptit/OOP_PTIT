public class Student {
    private String id, name, clas, dob;
    private Double gpa;

    public Student() {
        this.id = "";
        this.name = "";
        this.clas = "";
        this.dob = "";
        this.gpa = 0.0;
    }

    public Student(String name, String clas, String dob, Double gpa) {
        this.id = "B20DCCN001";
        this.name = name;
        this.clas = clas;
        this.dob = dob;
        this.gpa = gpa;
    }

    public String std(String temp){
        StringBuilder stringBuilder = new StringBuilder(temp);
        if(stringBuilder.charAt(1) == '/')stringBuilder.insert(0, '0');
        if(stringBuilder.charAt(4) == '/')stringBuilder.insert(3, '0');
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", id, name, clas, std(dob), gpa);
    }
}
