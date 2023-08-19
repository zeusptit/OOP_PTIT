public class Student {
    public static int count = 1;
    private String id, name, clas, dob;
    private double gpa;

    public Student(String name, String clas, String dob, double gpa) {
        this.id = "B20DCCN" + String.format("%03d", count++);
        this.name = name;
        this.clas = clas;
        StringBuilder sb = new StringBuilder(dob);
        if(sb.charAt(1) == '/')sb.insert(0, '0');
        if(sb.charAt(4) == '/')sb.insert(3, '0');
        this.dob = sb.toString();
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + clas + " " + dob + " " + String.format("%.2f", gpa);
    }
}