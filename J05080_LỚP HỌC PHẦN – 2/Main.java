import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Course> list = new ArrayList<>();
        while(n-- != 0){
            Course course = new Course(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(course);
        }
        Collections.sort(list);
        int m = Integer.parseInt(sc.nextLine());
        while(m-- != 0){
            String queryCourse = sc.nextLine();
            System.out.println("Danh sach cho giang vien " + queryCourse + ":");
            for(Course x : list){
                if(x.getLecturerName().equals(queryCourse)){
                    System.out.println(x);
                }
            }
        }
    }
}
/*
4
THCS2D20
Tin hoc co so 2 - D20
01
Nguyen Binh An
CPPD20
Ngon ngu lap trinh C++ - D20
01
Le Van Cong
THCS2D20
Tin hoc co so 2 - D20
02
Nguyen Trung Binh
LTHDTD19
Lap trinh huong doi tuong - D19
01
Nguyen Binh An
1
Nguyen Binh An
 */