import java.util.*;

public class Main {
    public static String solve(String s){
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for(String x : words){
            if(!x.isEmpty()){
                sb.append(Character.toUpperCase(x.charAt(0)));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher> list = new ArrayList<>();
        int test = Integer.parseInt(sc.nextLine());
        while(test-- != 0){
            list.add(new Teacher(sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- != 0){
            String queryMajor = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN BO MON " + solve(queryMajor) + ":");
            for(Teacher x : list){
                if(x.getTeacherMajor().equals(queryMajor)){
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
Cong nghe phan mem
 */