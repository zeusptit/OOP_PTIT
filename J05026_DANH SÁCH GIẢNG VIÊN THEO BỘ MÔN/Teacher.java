import java.util.ArrayList;

public class Teacher{
    public static int count = 1;
    private String teacherID;
    private String teacherName;
    private String teacherMajor;

    public Teacher(String teacherName, String teacherMajor) {
        this.teacherID = "GV" + String.format("%02d", count++);
        this.teacherName = teacherName;
        this.teacherMajor = teacherMajor;
    }

    public String solveMajor(String teacherMajor){
        StringBuilder sb = new StringBuilder();
        String[] words = teacherMajor.split(" ");
        for(String x : words){
            sb.append(Character.toUpperCase(x.charAt(0)));
        }
        return sb.toString();
    }

    public String getTeacherName() {
        ArrayList<String> list = new ArrayList<>();
        String[] words = teacherName.split(" ");
        for(String x : words){
            list.add(x);
        }
        return list.get(list.size() - 1);
    }

    public String getTeacherID() {
        return teacherID;
    }

    public String getTeacherMajor() {
        return teacherMajor;
    }

    @Override
    public String toString() {
        return teacherID + " " + teacherName + " " + solveMajor(teacherMajor);
    }
}
