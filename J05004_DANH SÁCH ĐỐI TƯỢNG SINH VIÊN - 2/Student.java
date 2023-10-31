public class Student {
    public static int count = 1;
    private String studentID;
    private String studentName;
    private String studentClass;
    private String studentDob;
    private Double studentGpa;

    public Student(String studentName, String studentClass, String studentDob, Double studentGpa) {
        this.studentID = "B20DCCN" + String.format("%03d", count++);
        StringBuilder sb = new StringBuilder();

        String[] words = studentName.trim().split(" ");
        for(String x : words){
            if(!x.isEmpty()){
                x = x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase();
                sb.append(x).append(" ");
            }
        }
        this.studentName = sb.toString().trim();

        this.studentClass = studentClass;

        StringBuilder sb2 = new StringBuilder(studentDob);
        if(sb2.charAt(1) == '/')sb2.insert(0, "0");
        if(sb2.charAt(4) == '/')sb2.insert(3, "0");
        this.studentDob = sb2.toString();

        this.studentGpa = studentGpa;
    }

    @Override
    public String toString() {
        return studentID + " " + studentName + " " + studentClass + " " + studentDob + " " + String.format("%.2f", studentGpa);
    }
}
