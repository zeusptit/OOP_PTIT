public class Student {
    private String studentID, studentName, studentClass, studentEmail;

    public Student(String studentID, String studentName, String studentClass, String studentEmail) {
        this.studentID = studentID;
        this.studentName = normalizeName(studentName);
        this.studentClass = studentClass;
        this.studentEmail = studentEmail;
    }
    public String normalizeName(String s){
        StringBuilder sb = new StringBuilder();
        String[] words = s.trim().split("\\s+");
        for(String x : words){
            x = x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase();
            sb.append(x).append(" ");
        }
        return sb.toString().trim();
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public String getStudentEmail() {
        return studentEmail;
    }
}
