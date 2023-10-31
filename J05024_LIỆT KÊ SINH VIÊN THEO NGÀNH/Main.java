import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Student[] a = new Student[n];
        ArrayList<Student> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + s + ":");
            String[] ans = s.split("\\s+");
            String tmp = "";
            for(String x : ans){
                tmp += x.charAt(0);
            }
            tmp = tmp.substring(0, 2);
            for(Student x : arr){
                if(tmp.equals("CN") || tmp.equals("AT")){
                    if(x.getStudentClass().charAt(0) != 'E' && x.getStudentId().substring(5, 7).equals(tmp))
                        System.out.println(x);
                }
                else{
                    if(x.getStudentId().substring(5, 7).equals(tmp))
                        System.out.println(x);
                }
            }
        }
    }
}