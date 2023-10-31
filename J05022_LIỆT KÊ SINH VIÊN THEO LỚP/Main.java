import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        int test = Integer.parseInt(sc.nextLine());
        while(test-- != 0){
            list.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- != 0){
            String queryCLass = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + queryCLass + ":");
            for(Student x : list){
                if(x.getStudentClass().equals(queryCLass)){
                    System.out.println(x);
                }
            }
        }
    }
}
/*
4
B16DCCN011
Nguyen Trong Duc Anh
D16CNPM1
sv1@stu.ptit.edu.vn
B15DCCN215
To Ngoc Hieu
D15CNPM3
sv2@stu.ptit.edu.vn
B15DCKT150
Nguyen Ngoc Son
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT02-B
sv4@stu.ptit.edu.vn
1
D15CQKT02-B
 */

