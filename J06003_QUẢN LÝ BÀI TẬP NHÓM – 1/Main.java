import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> students = new ArrayList<>();
        while(n-- != 0){
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        HashMap<Integer, String> map = new HashMap<>();
        for(int i = 1; i <= m; i++){
            String title = sc.nextLine();
            map.put(i, title);
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- != 0){
            String queryGroup = sc.nextLine();
            System.out.println("DANH SACH NHOM " + queryGroup + ":");
            for(Student x :students){
                if(x.getStudentGroup().equals(queryGroup)){
                    System.out.println(x);
                }
            }
            System.out.println("Bai tap dang ky: " + map.get(Integer.parseInt(queryGroup)));
        }
    }
}
/*
5 2
B17DTCN001
Nguyen Chi  Linh
0987345543
1
B17DTCN011
Vu Viet Thang
0981234567
1
B17DTCN023
Pham Trong Thang
0992123456
1
B17DTCN022
Nguyen Van  Quyet
0977865432
2
B17DTCN031
Ngo Thanh Vien
0912313111
2
Xay dung website ban dien thoai truc tuyen
Xay dung ung dung quan ly benh nhan Covid-19
1
1
 */