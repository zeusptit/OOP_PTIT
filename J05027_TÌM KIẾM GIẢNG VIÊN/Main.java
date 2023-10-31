import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher> list = new ArrayList<>();
        int test = Integer.parseInt(sc.nextLine());
        while(test-- != 0){
            list.add(new Teacher(sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- != 0){
            String queryWord = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + queryWord + ":");
            for(Teacher x : list){
                if(x.getTeacherName().toLowerCase().contains(queryWord.toLowerCase())){
                    System.out.println(x);
                }
            }
        }
    }
}
/*

3
Nguyen Manh Son
Cong nghe phan mem
Vu Hoai Nam
Khoa hoc may tinh
Dang Minh Tuan
An toan thong tin
1
aN
 */